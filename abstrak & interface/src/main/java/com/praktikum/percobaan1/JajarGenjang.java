package com.praktikum.percobaan1;

public class JajarGenjang extends BangunDatar{
    public int alas, tinggi, sisiMiring;

    @Override
    public void hitungLuas() {
       this.luas = alas * tinggi; 
    }

    @Override
    public void hitungKeliling() {
        this.keliling = 2 * (alas + sisiMiring);
    }
    



}