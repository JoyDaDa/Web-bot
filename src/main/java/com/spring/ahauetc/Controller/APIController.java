package com.spring.ahauetc.Controller;

import com.spring.ahauetc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class APIController {
    @Autowired
    private LoginService loginService;


    @RequestMapping("/")
    @ResponseBody
    public String login(@RequestParam("xh") String xh,
                          @RequestParam("pwd") String pwd) throws Exception {
        Map<String, String> cookies = loginService.login(xh, pwd);
        return cookies.toString();
    }

    @RequestMapping("/getsource")
    @ResponseBody
    public Map<String,String> getsource(@RequestParam("year") String year,
                                        @RequestParam("term") String term,
                                        @RequestParam("cookies") Map<String,String> cookies) {

        return null;
    }

}

