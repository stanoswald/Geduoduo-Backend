package com.stan.pojo;

public class OrderItem {
    Integer orderNum;
    Goods goods;

    public OrderItem() {
    }

    public OrderItem(Integer orderNum, Goods goods) {
        this.orderNum = orderNum;
        this.goods = goods;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderNum=" + orderNum +
                ", goods=" + goods +
                '}';
    }
}
