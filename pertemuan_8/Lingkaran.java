/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_8;


    public class Lingkaran extends BangunDatar {
    private float jari;

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    @Override
    protected float luas() {
        return (float) (Math.PI * jari * jari);
    }

    @Override
    protected float keliling() {
        return (float) (2 * Math.PI * jari);
    }
}
