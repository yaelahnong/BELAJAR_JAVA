package XIRPL3;

// CamelCase
// snake_case

import XIRPL2.BangunRuang;

public class User {

    String nama;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }












    public static void main(String[] args){

        // TUGAS PERORANGAN
        // Buat Program Nilai Mutu
        // Jika nilai > 90: A
        // JIka nilai > 80: AB
        // Jika nilai > 70: B
        // Jika nilai > 60: BC
        // Selain itu: C

        // TUGAS KELOMPOK 1: Jelaskan modifier: default, private, protected dan public
        // TUGAS KELOMPOK 2: contoh perhitungan bangun ruang: balok, kubus, tabung, prisma, limas (volume dan keliling)
        // TUGAS KELOMPOK 3: contoh perhitungan bangun datar: trapesium, segitiga, kotak, layang-layang (luas dan keliling)
        // TUGAS KELOMPOK 4: Bikin object: nama, umur, berat badan, golongan darah, jenis kelamin (berat badan ideal atau engga)

        BangunRuang bangunRuang = new BangunRuang();
        bangunRuang.setPanjang(100);
        bangunRuang.setLebar(100);
        bangunRuang.setTinggi(100);
        //System.out.println("volume limas adalah: " + bangunRuang.getVolumeLimas());
    }
}



























//class BangunRuang2 {
//
//    final private double phi = 3.14;
//
//    private int panjang;
//    private int lebar;
//    private int tinggi;
//    private int jariJari;
//
//    public double getVolumeBola() {
//        return (4 / 3) * phi * ( jariJari * jariJari * jariJari );
//    }
//
//    public int getVolumeLimas() {
//        return (panjang * lebar * tinggi) / 3;
//    }
//
//    public int getVolumeKubus() {
//        return (panjang * lebar * tinggi);
//    }
//
//    public int getVolumePrisma() {
//        return (panjang * lebar * tinggi);
//    }
//
//    public int getPanjang() {
//        return panjang;
//    }
//
//    public void setPanjang(int panjang) {
//        this.panjang = panjang;
//    }
//
//    public int getLebar() {
//        return lebar;
//    }
//
//    public void setLebar(int lebar) {
//        this.lebar = lebar;
//    }
//
//    public int getTinggi() {
//        return tinggi;
//    }
//
//    public void setTinggi(int tinggi) {
//        this.tinggi = tinggi;
//    }
//
//    public int getJariJari() {
//        return jariJari;
//    }
//
//    public void setJariJari(int jariJari) {
//        this.jariJari = jariJari;
//    }
//}