package com.stan.pojo;

public class Pics {
    Integer picsId;
    String big;
    String mid;
    String small;

    public Pics(Integer picsId, String big, String mid, String small) {
        this.picsId = picsId;
        this.big = big;
        this.mid = mid;
        this.small = small;
    }

    public Integer getPicsId() {
        return picsId;
    }

    public void setPicsId(Integer picsId) {
        this.picsId = picsId;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    @Override
    public String toString() {
        return "Pics{" +
                "picsId=" + picsId +
                ", Big='" + big + '\'' +
                ", Mid='" + mid + '\'' +
                ", Small='" + small + '\'' +
                '}';
    }
}
