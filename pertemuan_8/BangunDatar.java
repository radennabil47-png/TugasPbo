/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_8;

/**
 *
 * @author lenovo
 */
public class BangunDatar {
    
    // Method untuk di-override oleh class turunan
    protected float luas() {
        return 0;
    }
    
    protected float keliling() {
        return 0;
    }
    
    public float getLuas() {
        return luas();
    }
    
    public float getKeliling() {
        return keliling();
    }
}
