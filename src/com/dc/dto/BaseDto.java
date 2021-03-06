package com.dc.dto;

/**
 * @author:Teacher黄
 * @date:Created at 2019/02/18
 */
public class BaseDto<T> {


    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    private T data;

    public BaseDto() {
    }


    public BaseDto(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
