package com.spring.ahauetc.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Map;

public class StudentInformaction {

    public void getStudentInformaction(String yhm,Map<String, String> cookies) throws IOException {
            Connection connection = Jsoup.connect( "http://220.178.71.156:9100/jwglxt/xsxxxggl/xsxxwh_cxCkDgxsxx.html?gnmkdm=N100801&su"+ yhm );
            connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
            Connection.Response response = connection.cookies(cookies).ignoreContentType(true).execute();
            JSONObject jsonObject = JSON.parseObject(response.body());
            System.out.println("学号：" + jsonObject.getString("xh_id"));
            System.out.println("性别：" + jsonObject.getString("xbm"));
            System.out.println("民族：" + jsonObject.getString("mzm"));
            System.out.println("学院：" + jsonObject.getString("jg_id"));
            System.out.println("班级：" + jsonObject.getString("bh_id"));
            System.out.println("专业：" + jsonObject.getString("zszyh_id"));
            System.out.println("状态：" + jsonObject.getString("xjztdm"));
            System.out.println("入学年份：" + jsonObject.getString("njdm_id"));
            System.out.println("证件号码：" + jsonObject.getString("zjhm"));
            System.out.println("政治面貌：" + jsonObject.getString("zzmmm"));

    }

}
