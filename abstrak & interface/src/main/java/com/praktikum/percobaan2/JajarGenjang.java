package com.praktikum.percobaan2;

public class JajarGenjang extends BangunDatar implements Resizeable {
    public int alas, tinggi, sisiMiring;

    @Override
    public void hitungLuas() {
        this.luas = alas * tinggi;
    }

    @Override
    public void hitungKeliling() {
        this.keliling = 2 * (alas + sisiMiring);
    }

    @Override
    public void perbesar() {
      this.alas = this.alas * 2;
      this.tinggi = this.tinggi * 2;
      this.sisiMiring = this.sisiMiring * 2;
              
    }
    

    @Override
    public void perkecil() {
      this.alas = this.alas / 2;
      this.tinggi = this.tinggi / 2;
      this.sisiMiring = this.sisiMiring / 2;
    }

}