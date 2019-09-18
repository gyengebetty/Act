package com.fasttrackit;

public class CertificatCasatorie extends Act{
   private String numePartener;

    public CertificatCasatorie() {
    }
    public CertificatCasatorie(String numePartener) {
        this.numePartener = numePartener;
    }
    public String getNumePartener() {
        return numePartener;
    }
    public void setNumePartener(String numePartener) {
        this.numePartener = numePartener;
    }
}
