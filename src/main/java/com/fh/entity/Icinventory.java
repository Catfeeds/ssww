package com.fh.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Icinventory  {
    private BigDecimal fqty;

    private BigDecimal fbal;

    private BigDecimal fqtylock;

    private BigDecimal fsecqty;

    private Date flastupdatetime;
    

	public BigDecimal getFqty() {
        return fqty;
    }

    public void setFqty(BigDecimal fqty) {
        this.fqty = fqty;
    }

    public BigDecimal getFbal() {
        return fbal;
    }

    public void setFbal(BigDecimal fbal) {
        this.fbal = fbal;
    }

    public BigDecimal getFqtylock() {
        return fqtylock;
    }

    public void setFqtylock(BigDecimal fqtylock) {
        this.fqtylock = fqtylock;
    }

    public BigDecimal getFsecqty() {
        return fsecqty;
    }

    public void setFsecqty(BigDecimal fsecqty) {
        this.fsecqty = fsecqty;
    }

    public Date getFlastupdatetime() {
        return flastupdatetime;
    }

    public void setFlastupdatetime(Date flastupdatetime) {
        this.flastupdatetime = flastupdatetime;
    }
}