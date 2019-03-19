package com.dc.pojo;

public class Classxx {
    private Integer class_number;
    private Integer class_id;
    private Integer class_xyid;
    private Integer class_teacherid;
    public Classxx() {
    }


    public Integer getClass_teacherid() {
        return class_teacherid;
    }

    public void setClass_teacherid(Integer class_teacherid) {
        this.class_teacherid = class_teacherid;
    }

    public Integer getClass_number() {
        return class_number;
    }

    public void setClass_number(Integer class_number) {
        this.class_number = class_number;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public Integer getClass_xyid() {
        return class_xyid;
    }

    public void setClass_xyid(Integer class_xyid) {
        this.class_xyid = class_xyid;
    }

    @Override
    public String toString() {
        return "Classxx{" +
                "class_number=" + class_number +
                ", class_id=" + class_id +
                ", class_xyid=" + class_xyid +
                ", class_teacherid=" + class_teacherid +
                '}';
    }
}
