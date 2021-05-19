package com.spring.ahauetc.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Jspj {
    public void pingjia(String yhm,Map<String, String> cookies) throws IOException {
        Map<String,String> datas = new HashMap<>();
        datas.put("ztpjbl","100");
        datas.put("jszdpjbl","0");
        datas.put("xykzpjbl","0");
        datas.put("xsdm","01");
        datas.put("modelList[0].pjmbmcb_id","BBF8EE45102B738CE055000000000001");
        datas.put("modelList[0].pjdxdm","01");
        datas.put("modelList[0].fxzgf","");
        datas.put("modelList[0].py","");
        datas.put("modelList[0].xspfb_id","");

        datas.put("modelList[1].xspjList[0].childXspjList[0].pfdjdmxmb_id","B571419A2A4C06BFE055000000000001");
        datas.put("modelList[1].xspjList[0].childXspjList[0].pjzbxm_id","C12A050E30213241E055000000000001");
        datas.put("modelList[1].xspjList[0].childXspjList[0].pfdjdmb_id","B571419A2A4706BFE055000000000001");
        datas.put("modelList[1].xspjList[0].childXspjList[0].zsmbmcb_id","C12A050E301F3241E055000000000001");


        datas.put("modelList[0].xspjList[0].childXspjList[1].pfdjdmxmb_id","B571419A2A4C06BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[1].pjzbxm_id","C12A050E30223241E055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[1].pfdjdmb_id","B571419A2A4706BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[1].zsmbmcb_id","C12A050E301F3241E055000000000001");


        datas.put("modelList[0].xspjList[0].childXspjList[2].pfdjdmxmb_id","B571419A2A4C06BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[2].pjzbxm_id","C12A050E30233241E055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[2].pfdjdmb_id","B571419A2A4706BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[2].zsmbmcb_id","C12A050E301F3241E055000000000001");


        datas.put("modelList[0].xspjList[0].childXspjList[3].pfdjdmxmb_id","B571419A2A4C06BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[3].pjzbxm_id","C12A050E30243241E055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[3].pfdjdmb_id","B571419A2A4706BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[3].zsmbmcb_id","C12A050E301F3241E055000000000001");


        datas.put("modelList[0].xspjList[0].childXspjList[4].pfdjdmxmb_id","B571419A2A4C06BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[4].pjzbxm_id","C12A050E30253241E055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[4].pfdjdmb_id","B571419A2A4706BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[4].zsmbmcb_id","C12A050E301F3241E055000000000001");


        datas.put("modelList[0].xspjList[0].childXspjList[5].pfdjdmxmb_id","B571419A2A4E06BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[5].pjzbxm_id","C12A050E30263241E055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[5].pfdjdmb_id","B571419A2A4706BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[5].zsmbmcb_id","C12A050E301F3241E055000000000001");


        datas.put("modelList[0].xspjList[0].childXspjList[6].pfdjdmxmb_id","B571419A2A4C06BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[6].pjzbxm_id","C12A050E30273241E055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[6].pfdjdmb_id","B571419A2A4706BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[6].zsmbmcb_id","C12A050E301F3241E055000000000001");


        datas.put("modelList[0].xspjList[0].childXspjList[7].pfdjdmxmb_id","B571419A2A4C06BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[7].pjzbxm_id","C12A050E30283241E055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[7].pfdjdmb_id","B571419A2A4706BFE055000000000001");
        datas.put("modelList[0].xspjList[0].childXspjList[7].zsmbmcb_id","C12A050E301F3241E055000000000001");

        datas.put("modelList[0].xspjList[0].pjzbxm_id","C12A050E30203241E055000000000001");
        datas.put("modelList[0].pjzt","1");
        datas.put("tjzt","1");

        //获得所有要评价的课程
        Map<String,String> QueryData = new HashMap<>();
        QueryData.put("_search","false");
        QueryData.put("nd",String.valueOf(new Date().getTime()));
        QueryData.put("queryModel.showCount","20");
        QueryData.put("queryModel.currentPage","1");
        QueryData.put("queryModel.sortName","");
        QueryData.put("queryModel.sortOrder","asc");
        QueryData.put("time","0");

        Connection connection = Jsoup.connect("http://220.178.71.156:9100/jwglxt/xspjgl/xspj_cxXspjIndex.html?doType=query&gnmkdm=N401605&su="+yhm);
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
        connection.header("Accept","application/json, text/javascript, */*; q=0.01");
        connection.header("Accept-Encoding","gzip, deflate");
        connection.header("Accept-Language","zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
        connection.header("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
        connection.header("Host"," 220.178.71.156:9100");
        connection.header("Origin","http://220.178.71.156:9100");
        connection.header("Referer","http://220.178.71.156:9100/jwglxt/xspjgl/xspj_cxXspjIndex.html?gnmkdm=N401605&layout=default&dltz=yes");
        connection.header("X-Requested-With","XMLHttpRequest");
        Connection.Response response = connection.cookies(cookies).method(Connection.Method.POST)
                .data(QueryData).ignoreContentType(true).execute();

        System.out.println(response.body());
        JSONObject jsonObject = JSON.parseObject(response.body());
        JSONArray gradeTable = JSON.parseArray(jsonObject.getString("items"));
        for (Iterator iterator = gradeTable.iterator(); iterator.hasNext();) {
            JSONObject lesson = (JSONObject) iterator.next();
//            System.out.println(lesson.getString("jxb_id"));
//            System.out.println(lesson.getString("kch_id"));
//            System.out.println(lesson.getString("jgh_id"));

            datas.put("jxb_id",lesson.getString("jxb_id"));
            datas.put("kch_id",lesson.getString("kch_id"));
            datas.put("jgh_id",lesson.getString("jgh_id"));

            //进行评价
            Connection conn = Jsoup.connect("http://220.178.71.156:9100/jwglxt/xspjgl/xspj_tjXspj.html?gnmkdm=N401605&su="+yhm);
            conn.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
            conn.header("Accept","application/json, text/javascript, */*; q=0.01");
            conn.header("Accept-Encoding","gzip, deflate");
            conn.header("Accept-Language","zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
            conn.header("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
            conn.header("Host"," 220.178.71.156:9100");
            conn.header("Origin","http://220.178.71.156:9100");
            conn.header("Referer","http://220.178.71.156:9100/jwglxt/xspjgl/xspj_cxXspjIndex.html?gnmkdm=N401605&layout=default&dltz=yes");
            conn.header("X-Requested-With","XMLHttpRequest");
            Connection.Response response1 = conn.cookies(cookies).method(Connection.Method.POST)
                .data(datas).ignoreContentType(true).execute();
            datas.remove("jxb_id");
            datas.remove("kch_id");
            datas.remove("jgh_id");
            System.out.println(response1.body());
        }
    }

}
