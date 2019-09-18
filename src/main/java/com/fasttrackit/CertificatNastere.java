package com.fasttrackit;

public class CertificatNastere extends Act {
    private String numeTata;
    private String numeMama;
    private String cetatenie;

    public CertificatNastere() {
    }
    public CertificatNastere(String numeTata) {
        this.numeTata = numeTata;
    }
    public String getNumeTata() {
        return numeTata;
    }
    public void setNumeTata(String numeTata) {
        this.numeTata = numeTata;
    }
    public String getNumeMama() {
        return numeMama;
    }
    public void setNumeMama(String numeMama) {
        this.numeMama = numeMama;
    }
    public String getCetatenie() {
        return cetatenie;
    }
    public void setCetatenie(String cetatenie) {
        this.cetatenie = cetatenie;
    }
}
