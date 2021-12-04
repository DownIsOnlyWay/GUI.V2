package com.company.mokiniai;

public interface Mokiniai {

    String getVardas();
    String getPavarde();
    int getAK();
    int getKlase();
    String getMokykla();

    void setKlase(int klase);
    void setMokykla(String mokykla);
}
