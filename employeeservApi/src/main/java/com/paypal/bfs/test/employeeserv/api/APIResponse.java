package com.paypal.bfs.test.employeeserv.api;

import java.util.HashMap;

public class APIResponse {

    public static enum ERR_CODE {
        DB_CONNECTION("Error connecting to DB");

        private String uiMessage;

        ERR_CODE(String uiMessage) {
            this.uiMessage = uiMessage;
        }

        public String getUimessage() {
            return uiMessage;
        }
    }

    public static enum STATUS {
        FAILURE(0, "Failure"),
        SUCCESS(1, "Success"),
        TIMEOUT(2, "Timeout");

        private int code;
        private String desc;

        STATUS(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    private int sts;
    private String msg;
    private Object data;
    private Object entity;

    public APIResponse() {}

    public APIResponse(STATUS status) {
        this(status, "");
    }

    public APIResponse(STATUS status, ERR_CODE errCode) {
        this(status, errCode, null);
    }

    public APIResponse(STATUS status, String msg) {
        this.sts = status.getCode();
        this.msg = msg;
    }

    public APIResponse(STATUS status, ERR_CODE errCode, Object data) {
        sts = status.getCode();
        msg = errCode == null || errCode.getUimessage() == null ? "" : errCode.getUimessage();
        this.data = data == null ? new HashMap<String, Object>() : data;
    }

    public APIResponse(String msg, STATUS status, Object data) {
        sts = status.getCode();
        this.msg = msg == null ? "" : msg;
        this.data = data == null ? new HashMap<String, Object>() : data;
    }

    public APIResponse(String msg, STATUS status, Object data, Object entity) {
        sts = status.getCode();
        this.msg = msg == null ? "" : msg;
        this.data = data == null ? new HashMap<String, Object>() : data;
        this.entity = entity == null ? new HashMap<String, Object>() : entity;
    }

    public int getSts() {
        return sts;
    }

    public String getMsg() {
        return msg == null ? "" : msg;
    }

    public Object getData() {
        return data;
    }

    public void setSts(int sts) {
        this.sts = sts;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

}