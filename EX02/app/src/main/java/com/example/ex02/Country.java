package com.example.ex02;

public class Country {
    private int flag;
    private String countryName ;
    private String countryCapital;

    public Country(int ukflag, String s, String s1) {
        this.flag = ukflag;
        this.countryName = s;
        this.countryCapital = s1;
    }

    public int getFlag() {
        return flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }
}