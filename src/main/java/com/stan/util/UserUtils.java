package com.stan.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UserUtils {
    public static JSONObject getSession(String appId, String appSecret, String code) throws IOException {
        String STR_URL = "https://api.weixin.qq.com/sns/jscode2session" +
                "?appid=" + appId +
                "&secret=" + appSecret +
                "&js_code=" + code +
                "&grant_type=authorization_code";

        URL getUrl = new URL(STR_URL);
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        connection.connect();

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                connection.getInputStream()));

        JSONObject res = JSON.parseObject(reader.readLine());

        reader.close();
        connection.disconnect();

        if (res.get("errmsg") == null) {
            return res;
        }

        return null;
    }
}
