/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_8;


    public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getLebar() {
        return lebar;
    }

    @Override
    protected float luas() {
        return panjang * lebar;
    }

    @Override
    protected float keliling() {
        return 2 * (panjang + lebar);
    }
}
