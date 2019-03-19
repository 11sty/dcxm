package com.dc.pojo;

public class User {
    private String user_name;
    private String user_pwd;
    private Integer isteacher;
    private String  user_nikname;
    private Integer user_id;

    /**
     * 当前老师包含的班级信息
     */
    private Classxx classxx;

    public User() {
    }

    public Classxx getClassxx() {
        return classxx;
    }

    public void setClassxx(Classxx classxx) {
        this.classxx = classxx;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public Integer getIsteacher() {
        return isteacher;
    }

    public void setIsteacher(Integer isteacher) {
        this.isteacher = isteacher;
    }

    public String getUser_nikname() {
        return user_nikname;
    }

    public void setUser_nikname(String user_nikname) {
        this.user_nikname = user_nikname;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", isteacher=" + isteacher +
                ", user_nikname='" + user_nikname + '\'' +
                ", user_id=" + user_id +
                ", classxx=" + classxx +
                '}';
    }
}
