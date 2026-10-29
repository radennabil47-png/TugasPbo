/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_inherit;

import java.util.Scanner;

public class Lingkaran extends BangunDatar {
     Scanner sc = new Scanner(System.in);
    double r;
    
    public void luas (){
        System.out.println("Masukkan jari : ");
        r = sc.nextDouble();
        System.out.println("Luas lingkaran");
        double hasil = 3.14 * (r * r);
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        System.out.println("Keliling lingkaran");
        double hasil = 2 * 3.14 * r;
        System.out.println("Hasil keliling : " + hasil);
    }
}

