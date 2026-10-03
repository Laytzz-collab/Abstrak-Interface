package com.praktikum.percobaan1;

import java.util.Locale;

public class Main {
    public static void main(String[] argv) {
        
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas STSK = " + stsk.luas);
        System.out.println("Keliling STSK = " +
                stsk.keliling);

        SegiEmpat se = new SegiEmpat();
        se.panjang = 10;
        se.lebar = 5;
        se.hitungLuas();
        se.hitungKeliling();
        System.out.println("Luas Segi Empat = " + se.luas);
        System.out.println("Keliling Segi Empat = " + se.keliling);

        Lingkaran lk = new Lingkaran();
        lk.jariJari = 7;
        lk.hitungLuas();
        lk.hitungKeliling();
        System.out.println("Luas Lingkaran = " + lk.luas);
        System.out.println("Keliling Lingkaran = " + lk.keliling);
        
        JajarGenjang jk = new JajarGenjang();
        jk.alas = 2;
        jk.tinggi = 5;
        jk.sisiMiring = 4;
        jk.hitungLuas();
        jk.hitungKeliling();
        System.out.println("Luas Jajar Genjang = " + jk.luas);
        System.out.println("Keliling Jajar Genjang = " + jk.keliling);
        
    }
}
