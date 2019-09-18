package com.fasttrackit;

public class Act {
    private String dataEmiteri;
    private String institutiaEmitenta;
    private int valabilitateAni;
    private String detinator;

    public Act() {
    }
    public Act(int valabilitateAni) {
        this.valabilitateAni = valabilitateAni;
    }
    public String getDataEmiteri() {
        return dataEmiteri;
    }
    public void setDataEmiteri(String dataEmiteri) {
        this.dataEmiteri = dataEmiteri;
    }
    public String getInstitutiaEmitenta() {
        return institutiaEmitenta;
    }
    public int getValabilitateAni() {
        return valabilitateAni;
    }
    public void setValabilitateAni(int valabilitateAni) {
        this.valabilitateAni = valabilitateAni;
    }
    public void setInstitutiaEmitenta(String institutiaEmitenta) {
        this.institutiaEmitenta = institutiaEmitenta;
    }
    public String getDetinator() {
        return detinator;
    }
    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }
}
