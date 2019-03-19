package com.dc.pojo;

public class Stuxx {
    private String stuid;
    private String stuname;
    private Integer latetimes;
    private Integer classid;
    private String phoneIp;
    private String islate;

    public Stuxx() {
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getLatetimes() {
        return latetimes;
    }

    public void setLatetimes(Integer latetimes) {
        this.latetimes = latetimes;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getPhoneIp() {
        return phoneIp;
    }

    public void setPhoneIp(String phoneIp) {
        this.phoneIp = phoneIp;
    }

    public String getIslate() {
        return islate;
    }

    public void setIslate(String islate) {
        this.islate = islate;
    }

    @Override
    public String toString() {
        return "Stuxx{" +
                "stuid='" + stuid + '\'' +
                ", stuname='" + stuname + '\'' +
                ", latetimes=" + latetimes +
                ", classid=" + classid +
                ", phoneIp='" + phoneIp + '\'' +
                ", islate='" + islate + '\'' +
                '}';
    }
}
