package com.fh.entity;

public class ICInventoryKey {
    private Integer fitemid;

    private Integer fstockid;

    private Integer fauxpropid;

    private String fbatchno;

    private Integer fstockplaceid;

    private Integer fkfperiod;

    private String fkfdate;

    private String fbrno;

    private String fmtono;

    public Integer getFitemid() {
        return fitemid;
    }

    public void setFitemid(Integer fitemid) {
        this.fitemid = fitemid;
    }

    public Integer getFstockid() {
        return fstockid;
    }

    public void setFstockid(Integer fstockid) {
        this.fstockid = fstockid;
    }

    public Integer getFauxpropid() {
        return fauxpropid;
    }

    public void setFauxpropid(Integer fauxpropid) {
        this.fauxpropid = fauxpropid;
    }

    public String getFbatchno() {
        return fbatchno;
    }

    public void setFbatchno(String fbatchno) {
        this.fbatchno = fbatchno == null ? null : fbatchno.trim();
    }

    public Integer getFstockplaceid() {
        return fstockplaceid;
    }

    public void setFstockplaceid(Integer fstockplaceid) {
        this.fstockplaceid = fstockplaceid;
    }

    public Integer getFkfperiod() {
        return fkfperiod;
    }

    public void setFkfperiod(Integer fkfperiod) {
        this.fkfperiod = fkfperiod;
    }

    public String getFkfdate() {
        return fkfdate;
    }

    public void setFkfdate(String fkfdate) {
        this.fkfdate = fkfdate == null ? null : fkfdate.trim();
    }

    public String getFbrno() {
        return fbrno;
    }

    public void setFbrno(String fbrno) {
        this.fbrno = fbrno == null ? null : fbrno.trim();
    }

    public String getFmtono() {
        return fmtono;
    }

    public void setFmtono(String fmtono) {
        this.fmtono = fmtono == null ? null : fmtono.trim();
    }
}