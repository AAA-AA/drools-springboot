package com.github.drools.model;

/**
 * @author : hongqiangren.
 * @since: 2018/8/7 11:44
 */
public class PointDomain {
    private String userName;
    private Boolean birthDay;
    private Integer point;
    private Integer buyNum;
    private Integer backNum;
    private double buyMoney;
    private double backMoney;
    private double billThisMonth;

    public void recordPointLog(String userName, String log) {
        System.out.println("用户名：" + userName + ", " + log);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Boolean birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getBackNum() {
        return backNum;
    }

    public void setBackNum(Integer backNum) {
        this.backNum = backNum;
    }

    public double getBuyMoney() {
        return buyMoney;
    }

    public void setBuyMoney(double buyMoney) {
        this.buyMoney = buyMoney;
    }

    public double getBackMoney() {
        return backMoney;
    }

    public void setBackMoney(double backMoney) {
        this.backMoney = backMoney;
    }

    public double getBillThisMonth() {
        return billThisMonth;
    }

    public void setBillThisMonth(double billThisMonth) {
        this.billThisMonth = billThisMonth;
    }
}
