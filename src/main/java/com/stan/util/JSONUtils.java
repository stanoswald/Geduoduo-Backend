package com.stan.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

public class JSONUtils {
    public static Map<String, String> paramsToMap(HttpServletRequest request) {
        String jsonStr = null;
        try {
            jsonStr = request.getReader().readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject.parseObject(jsonStr);

        return JSON.parseObject(jsonStr, new TypeReference<Map<String, String>>() {
        });
    }
}
