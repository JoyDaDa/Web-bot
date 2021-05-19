package com.spring.ahauetc.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.spring.ahauetc.Helper.B64;
import com.spring.ahauetc.Helper.RSAEncoder;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JwxtLogin {

    public Map<String, String> login(Map<String, String> params) throws Exception {
        //访问教务系统，开始得到cookie
        System.out.println("开始访问教务系统");

        //分析请求参数，需要csrftoken，yhm, mm
        //请求登陆页,获得csrftoken
        Connection connection = Jsoup.connect("http://220.178.71.156:9100/jwglxt/xtgl/login_slogin.html?language=zh_CN&_t="+new Date().getTime());
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36");
        Connection.Response response = connection.followRedirects(true).execute();
        Map<String, String> cookies = response.cookies();
        System.out.println("开始访问教务系统时的cookies："+cookies.toString());
        Document document = Jsoup.parse(response.body());
        String csrftoken = document.getElementById("csrftoken").val();
        System.out.println(csrftoken);

        //yhm=xh
        String yhm = params.get("username");
        System.out.println(yhm);

        //获取公钥并加密密码
        connection = Jsoup.connect("http://220.178.71.156:9100/jwglxt/xtgl/login_getPublicKey.html?" +
                "time="+ new Date().getTime());
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36");
        response = connection.cookies(cookies).ignoreContentType(true).followRedirects(true).execute();

        JSONObject jsonObject = JSON.parseObject(response.body());
        String modulus = jsonObject.getString("modulus");
        String exponent = jsonObject.getString("exponent");
        String password = RSAEncoder.RSAEncrypt(params.get("password"), B64.b64tohex(modulus), B64.b64tohex(exponent));
        String mm = B64.hex2b64(password);
        System.out.println(mm);

        System.out.println("登录前提交服务器的"+cookies);
        //提交服务器，登陆完成
        connection = Jsoup.connect("http://220.178.71.156:9100/jwglxt/xtgl/login_slogin.html");
        connection.header("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36");
        connection.data("csrftoken",csrftoken);
        connection.data("yhm",yhm);
        connection.data("mm",mm);
        connection.data("mm",mm);
        Connection.Response response1 = connection.cookies(cookies).ignoreContentType(true)
                .method(Connection.Method.POST).execute();
        System.out.println(response1.cookies());
//        System.out.println(response1.body());

        document = Jsoup.parse(response1.body());

        //二次构造cookies
        Map<String, String> seccesscookies = new HashMap<>();
        seccesscookies.put("JSESSIONID",response1.cookies().get("JSESSIONID"));
        seccesscookies.put("route",cookies.get("route"));
        System.out.println(seccesscookies);

        if(document.getElementById("tips") == null){
            System.out.println("登陆成功");

            StudentInformaction studentInformaction = new StudentInformaction();
            studentInformaction.getStudentInformaction(yhm,seccesscookies);
//
//            QuerySource querySource = new QuerySource();
//            querySource.getStudentGrade(2020,1,seccesscookies);
            Jspj jspj=new Jspj();
            jspj.pingjia(yhm,seccesscookies);
            return seccesscookies;
        }else{
//            System.out.println(document.getElementById("tips").text());
            Map<String, String> msg = new HashMap<>();
            msg.put("err",document.getElementById("tips").text());
            return msg;
        }

    }



}



