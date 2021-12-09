package com.stan.pojo;

import java.util.List;

public class Goods {
    private Integer goodsId;
    private Integer catId;
    private String goodsName;
    private Double goodsPrice;
    private Integer goodsNum;
    private String goodsIntroduce;
    private String goodsBigLogo;
    private String goodsSmallLogo;
    private List<Pics> pics;

    public Goods() {
    }

    public Goods(Integer goodsId, Integer catId, String goodsName, Double goodsPrice,
                 Integer goodsNum, String goodsIntroduce, String goodsBigLogo, String goodsSmallLogo) {
        this.goodsId = goodsId;
        this.catId = catId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.goodsIntroduce = goodsIntroduce;
        this.goodsBigLogo = goodsBigLogo;
        this.goodsSmallLogo = goodsSmallLogo;
    }

    public Goods(Integer catId, String goodsName, Double goodsPrice, Integer goodsNum, String goodsIntroduce, String goodsBigLogo, String goodsSmallLogo, List<Pics> pics) {
        this.catId = catId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.goodsIntroduce = goodsIntroduce;
        this.goodsBigLogo = goodsBigLogo;
        this.goodsSmallLogo = goodsSmallLogo;
        this.pics = pics;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public String getGoodsBigLogo() {
        return goodsBigLogo;
    }

    public void setGoodsBigLogo(String goodsBigLogo) {
        this.goodsBigLogo = goodsBigLogo;
    }

    public String getGoodsSmallLogo() {
        return goodsSmallLogo;
    }

    public void setGoodsSmallLogo(String goodsSmallLogo) {
        this.goodsSmallLogo = goodsSmallLogo;
    }

    public List<Pics> getPics() {
        return pics;
    }

    public void setPics(List<Pics> pics) {
        this.pics = pics;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", catId=" + catId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNum=" + goodsNum +
                ", goodsBigLogo='" + goodsBigLogo + '\'' +
                ", goodsSmallLogo='" + goodsSmallLogo + '\'' +
                '}';
    }
}
