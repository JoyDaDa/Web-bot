package com.spring.ahauetc.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class QuerySource {
    public void getStudentGrade(int year , int term,Map<String, String> cookies) throws Exception {
        Map<String,String> datas = new HashMap<>();
        datas.put("xnm",String.valueOf(year));
        datas.put("xqm",String.valueOf(term * term * 3));
        datas.put("_search","false");
        datas.put("nd",String.valueOf(new Date().getTime()));
        datas.put("queryModel.showCount","20");
        datas.put("queryModel.currentPage","1");
        datas.put("queryModel.sortName","");
        datas.put("queryModel.sortOrder","asc");
        datas.put("queryModel.sortName","");
        datas.put("time","0");

        Connection connection = Jsoup.connect("http://220.178.71.156:9100/jwglxt/cjcx/cjcx_cxDgXscj.html?doType=query&gnmkdm=N305005");
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
        Connection.Response response = connection.cookies(cookies).method(Connection.Method.POST)
                .data(datas).ignoreContentType(true).execute();
        JSONObject jsonObject = JSON.parseObject(response.body());
        JSONArray gradeTable = JSON.parseArray(jsonObject.getString("items"));
        for (Iterator iterator = gradeTable.iterator(); iterator.hasNext();) {
            JSONObject lesson = (JSONObject) iterator.next();
            System.out.println(lesson.getString("kcmc") + " " +
                    lesson.getString("jsxm") + " " +
                    lesson.getString("bfzcj") + " " +
                    lesson.getString("jd"));
        }
    }

}
