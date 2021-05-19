package com.spring.ahauetc.service;

import java.util.Map;

public interface LoginService {
    Map<String, String> login(String username, String password) throws Exception;

}
