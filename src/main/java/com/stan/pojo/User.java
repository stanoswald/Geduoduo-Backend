package com.stan.pojo;

public class User {
    private String openId;
    private String sessionKey;
    private String nickName;

    public User(String openId, String sessionKey, String nickName) {
        this.openId = openId;
        this.sessionKey = sessionKey;
        this.nickName = nickName;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "openId='" + openId + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
