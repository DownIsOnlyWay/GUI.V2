package com.company.mokiniai;

public class MokiniaiIMPL implements Mokiniai {


    private String vardas;
    private String pavarde;
    private int ak; //Asmens Kodas
    private int klase;
    private String mokykla;

    public MokiniaiIMPL(String vardas, String pavarde, int ak, int klase, String mokykla) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.ak = ak;
        this.klase = klase;
        this.mokykla = mokykla;
    }

    @Override
    public String getVardas() {
        return  this.vardas;
    }

    @Override
    public String getPavarde() {
        return this.pavarde;
    }

    @Override
    public int getAK() {
        return this.ak;
    }

    @Override
    public int getKlase() {
        return this.klase;
    }

    @Override
    public String getMokykla() {
        return this.mokykla;
    }

    @Override
    public void setKlase(int klase) {
        klase = this.klase;
    }

    @Override
    public void setMokykla(String mokykla) {
        mokykla = this.mokykla;
    }

    @Override
    public String toString() {
        return "MokiniaiIMPL{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", ak=" + ak +
                ", klase=" + klase +
                ", mokykla='" + mokykla + '\'' +
                '}';
    }
}
