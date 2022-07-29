package com.example.calismayapisi.entities;

import java.io.Serializable;

public class Kisiler implements Serializable {
    private int tcNo;
    private String isim;

    public Kisiler() {
    }

    public Kisiler(int tcNo, String isim) {
        this.tcNo = tcNo;
        this.isim = isim;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
