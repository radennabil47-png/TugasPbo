/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_8;


    public class persegi extends BangunDatar {
    private float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    @Override
    protected float luas() {
        return sisi * sisi;
    }

    @Override
    protected float keliling() {
        return 4 * sisi;
    }
}

