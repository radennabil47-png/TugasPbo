/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_8;

/**
 *
 * @author lenovo
 */
public class Pertemuan_8 {

  
    public static void main(String[] args) {

        // 1. Objek Persegi
        persegi persegi = new persegi();
        persegi.setSisi(5.0f);
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + persegi.getSisi());
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());
        System.out.println();

        // 2. Objek Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(7.0f);
        System.out.println("=== LINGKARAN ===");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas     : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());
        System.out.println();

        // 3. Objek Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(8.0f);
        persegiPanjang.setLebar(4.0f);
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang  : " + persegiPanjang.getPanjang());
        System.out.println("Lebar    : " + persegiPanjang.getLebar());
        System.out.println("Luas     : " + persegiPanjang.getLuas());
        System.out.println("Keliling : " + persegiPanjang.getKeliling());
        System.out.println();

        // 4. Objek Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6.0f);
        segitiga.setTinggi(8.0f);
        System.out.println("=== SEGITIGA ===");
        System.out.println("Alas     : " + segitiga.getAlas());
        System.out.println("Tinggi   : " + segitiga.getTinggi());
        System.out.println("Luas     : " + segitiga.getLuas());
        System.out.println("Keliling : " + segitiga.getKeliling());
    }
}

