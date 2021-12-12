package com.stan.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class JSONUtils {
    public static Map<String, String> paramsToMap(HttpServletRequest request) {
        String jsonStr = null;
        try {
            jsonStr = request.getReader().readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(jsonStr);
        JSONObject.parseObject(jsonStr);

        return JSON.parseObject(jsonStr, new TypeReference<Map<String, String>>() {
        });
    }

    public static JSONObject paramsToJSON(HttpServletRequest request) {
        try {
            BufferedReader buffReader = new BufferedReader(
                    new InputStreamReader(
                            request.getInputStream(),
                            StandardCharsets.UTF_8));

            String line = null;
            StringBuilder strBuilder = new StringBuilder();
            while ((line = buffReader.readLine()) != null) {
                strBuilder.append(line);
            }
            buffReader.close();
            return JSON.parseObject(strBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
