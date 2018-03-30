package com.fh.entity;

public class TB_WXQYAPP {
    private String wxqyappId;

    private String appname;

    private String appsecret;

    private String appagentid;

    private String createtime;

    private String updatetime;

    private String createman;

    private String appurl;

    private String token;

    private String encodingaeskey;

    public String getWxqyappId() {
        return wxqyappId;
    }

    public void setWxqyappId(String wxqyappId) {
        this.wxqyappId = wxqyappId == null ? null : wxqyappId.trim();
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getAppagentid() {
        return appagentid;
    }

    public void setAppagentid(String appagentid) {
        this.appagentid = appagentid == null ? null : appagentid.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public String getCreateman() {
        return createman;
    }

    public void setCreateman(String createman) {
        this.createman = createman == null ? null : createman.trim();
    }

    public String getAppurl() {
        return appurl;
    }

    public void setAppurl(String appurl) {
        this.appurl = appurl == null ? null : appurl.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getEncodingaeskey() {
        return encodingaeskey;
    }

    public void setEncodingaeskey(String encodingaeskey) {
        this.encodingaeskey = encodingaeskey == null ? null : encodingaeskey.trim();
    }
}