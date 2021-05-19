package com.spring.ahauetc.service.Impl;

import com.spring.ahauetc.domain.JwxtLogin;
import com.spring.ahauetc.service.LoginService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {


    @Override
    public Map<String, String> login(String username, String password) throws Exception {

        // 封装参数
        Map<String, String> params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);


        JwxtLogin jwxtLogin = new JwxtLogin();
        return jwxtLogin.login(params);

    }
}
