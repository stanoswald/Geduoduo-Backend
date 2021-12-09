package com.stan.pojo;

import java.util.List;

public class Cart {
    private String openId;
    private List<OrderItem> orderItem;

    public Cart() {
    }

    public Cart(String openId) {
        this.openId = openId;
    }

    public Cart(String openId, List<OrderItem> orderItem) {
        this.openId = openId;
        this.orderItem = orderItem;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "openId='" + openId + '\'' +
                ", orderItem=" + orderItem +
                '}';
    }
}
