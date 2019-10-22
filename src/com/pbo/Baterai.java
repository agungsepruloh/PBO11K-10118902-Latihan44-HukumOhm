package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung nilai tegangan dari baterai
 *
 */

public class Baterai {

    private float kuatArus;
    private float hambatan;

    Baterai() {
        System.out.println("===== Hukum Ohm =====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan beda"
                .concat("potensial pada ujung-ujung kawat penghantar tersebut asalkan suhu kawat dijaga konstan."));
    }

    Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return getKuatArus() * getHambatan();
    }

    public static void main(String[] args) {
        Baterai baterai = new Baterai(3, 12);
        Baterai hukumOhm = new Baterai();
        System.out.println(String.format("\nKuat arus\t\t: %.1f ampere", baterai.getKuatArus()));
        System.out.println(String.format("Hambatan\t\t: %.1f ohm", baterai.getHambatan()));
        System.out.println(String.format("Hasil tegangan\t: %.1f volt", baterai.hitungTegangan()));
    }
}
