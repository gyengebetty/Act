package com.fasttrackit;

public class Main {
    public static void main(String[] args) {

        CertificatNastere cn=new CertificatNastere();
        cn.setNumeMama("Nagy Iuliana");
        cn.setNumeTata("Nagy Theodor");
        cn.setCetatenie("Roman");
        cn.setDataEmiteri("2018.06.12");
        cn.setInstitutiaEmitenta("Primaria Galat");
        cn.setValabilitateAni(2022);
        cn.setDetinator("Nagy Teodora");

        CertificatNastere cn1=new CertificatNastere();
        cn1.setNumeMama("Kiss Daniela");
        cn1.setNumeTata("Kiss Iosif");
        cn1.setCetatenie("Roman,Maghiar");
        cn1.setDataEmiteri("2019.02.23");
        cn1.setInstitutiaEmitenta("Primaria Ploiesti");
        cn1.setValabilitateAni(2024);
        cn1.setDetinator("Kiss Ecaterina");

        CertificatCasatorie cc=new CertificatCasatorie();
        cc.setNumePartener("Kocacs Petru");
        cc.setDataEmiteri("2019.08.12");
        cc.setDetinator("Irina Ionela");
        cc.setInstitutiaEmitenta("Primaria Constanta");
        cc.setValabilitateAni(2030);

        CertificatCasatorie cc1=new CertificatCasatorie();
        cc1.setNumePartener("Gabor Floare");
        cc1.setDataEmiteri("2018.04.12");
        cc1.setDetinator("Bodea Dan");
        cc1.setInstitutiaEmitenta("Primaria Brasov");
        cc1.setValabilitateAni(2033);

        CertificatProprietate cp=new CertificatProprietate();
        cp.setDetinator("Kalman Ionel");
        cp.setDataEmiteri("2017.09.23");
        cp.setSuprafata(43);
        cp.setTipProprietate("Casa ");
        cp.setInstitutiaEmitenta("Primaria Cluj");
        cp.setValabilitateAni(2024);

        CertificatProprietate cp1=new CertificatProprietate();
        cp1.setDetinator("Kelemen Anamaria");
        cp1.setDataEmiteri("2019.03.23");
        cp1.setSuprafata(65);
        cp1.setTipProprietate("Teren");
        cp1.setInstitutiaEmitenta("Primaria Oradea");
        cp1.setValabilitateAni(2033);
    }
}
