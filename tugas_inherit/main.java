/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_inherit;

/**
 *
 * @author lenovo
 */
public class main {
     public static void main(String[] args) {
       BangunDatar b1 = new BangunDatar();
       b1.luas();
       b1.keliling();
       persegi p1 = new persegi();
       p1.luas();
       p1.keliling();
       Lingkaran ll = new Lingkaran();
       ll.luas();
       ll.keliling();
       PersegiPanjang pp = new PersegiPanjang();
       pp.luas();
       pp.keliling();
       Segitiga s1 = new Segitiga();
       s1.luas();
       s1.keliling();
    }
}
