package com.stan.pojo;

public class Cart {
    private String openId;
    private Integer goodsId;
    private Integer goodsNum;

    public Cart(String openId, Integer goodsId, Integer goodsNum) {
        this.openId = openId;
        this.goodsId = goodsId;
        this.goodsNum = goodsNum;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "openId='" + openId + '\'' +
                ", goodsId=" + goodsId +
                ", goodsNum=" + goodsNum +
                '}';
    }
}
