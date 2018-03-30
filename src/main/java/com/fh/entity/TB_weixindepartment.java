package com.fh.entity;

public class TB_weixindepartment {
    private String weixindepartmentId;

    private String dname;

    private Integer parentid;

    private Integer id;

    private Integer dorder;

    public String getWeixindepartmentId() {
        return weixindepartmentId;
    }

    public void setWeixindepartmentId(String weixindepartmentId) {
        this.weixindepartmentId = weixindepartmentId == null ? null : weixindepartmentId.trim();
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDorder() {
        return dorder;
    }

    public void setDorder(Integer dorder) {
        this.dorder = dorder;
    }
}