/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_inherit;

import java.util.Scanner;

public class persegi {
    Scanner sc = new Scanner(System.in);
    int sisi;
    
    public void luas(){
        System.out.println("Masukkan sisi : ");
        sisi = sc.nextInt();
        System.out.println("Luas persegi");
        int hasil = sisi * sisi;
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        System.out.println("Keliling persegi");
        int hasil = sisi * 4;
        System.out.println("Hasil keliling : " + hasil);
    }
    
}

