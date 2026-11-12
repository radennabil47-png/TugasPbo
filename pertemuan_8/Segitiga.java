/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_8;

    public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float getAlas() {
        return alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return tinggi;
    }

    @Override
    protected float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    protected float keliling() {
        // Asumsi segitiga siku-siku: keliling = alas + tinggi + sisi miring
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
