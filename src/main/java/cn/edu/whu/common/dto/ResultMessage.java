package cn.edu.whu.common.dto;

import com.alibaba.fastjson.JSON;

/**
 * Created by Fly on 2017/7/19.
 * 返回信息的统一格式
 */
public class ResultMessage<T> {
    private boolean success;
    private String message;
    private T data;
    /**
     * 状态码
     */
    private int code;

    public ResultMessage(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ResultMessage(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public ResultMessage(boolean success, String message, int code) {
        this.success = success;
        this.message = message;
        this.code = code;
    }

    public ResultMessage(boolean success, String message, T data, int code) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
