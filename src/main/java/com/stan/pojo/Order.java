package com.stan.pojo;

import java.util.Map;

public class Order {
    private Integer orderId;
    private Integer openId;
    private Double orderPrice;
    private String orderDate;
    private Map<Goods,Integer> orderItem;

    public Order(Integer orderId, Integer openId, Double orderPrice, String orderDate) {
        this.orderId = orderId;
        this.openId = openId;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOpenId() {
        return openId;
    }

    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Map<Goods, Integer> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Map<Goods, Integer> orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", openId=" + openId +
                ", orderPrice=" + orderPrice +
                ", orderDate='" + orderDate + '\'' +
                ", orderItem=" + orderItem +
                '}';
    }
}


