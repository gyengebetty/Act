package com.fasttrackit;

public class CertificatProprietate extends Act{
    String tipProprietate;
    private int suprafata;

    public CertificatProprietate() {
    }
    public CertificatProprietate(String tipProprietate) {
        this.tipProprietate = tipProprietate;
    }
    public String getTipProprietate() {
        return tipProprietate;
    }
    public void setTipProprietate(String tipProprietate) {
        this.tipProprietate = tipProprietate;
    }
    public int getSuprafata() {
        return suprafata;
    }
    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }
}
