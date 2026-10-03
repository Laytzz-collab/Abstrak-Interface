package com.praktikum.percobaan2;

public class Main {
    public static void main(String[] argv) {
        
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas sebelum diperbesar = " + se.luas);
        System.out.println("Keliling sebelum diperbesar = " + se.keliling);
        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperbesar = " + se.luas);
        System.out.println("Keliling setelah diperbesar = " + se.keliling);
        se.perkecil();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperkecil = " + se.luas);
        System.out.println("Keliling setelah diperkecil = " + se.keliling);

        System.out.println();

       
        Lingkaran lk = new Lingkaran();
        lk.jariJari = 10;
        lk.hitungKeliling();
        lk.hitungLuas();
        System.out.println("Luas Lingkaran sebelum diperbesar = " + lk.luas);
        System.out.println("Keliling Lingkaran sebelum diperbesar = " + lk.keliling);
        lk.perbesar();
        lk.hitungKeliling();
        lk.hitungLuas();
        System.out.println("Luas Lingkaran setelah diperbesar = " + lk.luas);
        System.out.println("Keliling Lingkaran setelah diperbesar = " + lk.keliling);
        lk.perkecil();
        lk.hitungKeliling();
        lk.hitungLuas();
        System.out.println("Luas Lingkaran setelah diperkecil = " + lk.luas);
        System.out.println("Keliling Lingkaran setelah diperkecil = " + lk.keliling);

        System.out.println();

       
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Luas STSK sebelum diperbesar = " + stsk.luas);
        System.out.println("Keliling STSK sebelum diperbesar = " + stsk.keliling);
        stsk.perbesar();
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Luas STSK setelah diperbesar = " + stsk.luas);
        System.out.println("Keliling STSK setelah diperbesar = " + stsk.keliling);
        stsk.perkecil();
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Luas STSK setelah diperkecil = " + stsk.luas);
        System.out.println("Keliling STSK setelah diperkecil = " + stsk.keliling);
        
        System.out.println();
        
        JajarGenjang jk = new JajarGenjang();
        jk.alas = 15;
        jk.tinggi = 20;
        jk.sisiMiring = 25;
        jk.hitungLuas();
        jk.hitungKeliling();
        System.out.println("Luas jk sebelum diperbesar = " + jk.luas);
        System.out.println("Keliling jk sebelum diperbesar = " + jk.keliling);
        jk.perbesar();
        jk.hitungKeliling();
        jk.hitungLuas();
        System.out.println("Luas jk setelah diperbesar = " + jk.luas);
        System.out.println("Keiling jk setelah diperbesar = " + jk.keliling);
        jk.perkecil();
        jk.hitungKeliling();
        jk.hitungLuas();
        System.out.println("Luas jk setelah diperkecil = " + jk.luas);
        System.out.println("Keliling jk setelah diperkecil = " + jk.keliling);
        
    }
    
}