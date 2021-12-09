package com.stan.pojo;

import java.util.List;
import java.util.Map;

public class Order {
    private Integer orderId;
    private String openId;
    private Double orderPrice;
    private String orderDate;
    private List<OrderItem> orderItem;

    public Order() {
    }

    public Order(Integer orderId, String openId, Double orderPrice, String orderDate) {
        this.orderId = orderId;
        this.openId = openId;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
    }

    public Order(Integer orderId, Double orderPrice, String orderDate) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
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

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
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


