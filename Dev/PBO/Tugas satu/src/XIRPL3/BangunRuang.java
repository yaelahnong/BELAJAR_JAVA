package XIRPL3;

public class BangunRuang {

    public static void main(String[] args) {

        System.out.println("MENCARI VOLUME BANGUN RUANG");

        // 1. Membuat class untuk menyimpan rumus volume bangun ruang
        // 2. Membuat Objek bangunRuang untuk memanggil class Rumus
        // 3. Memasukkan nilai yang dibutuhkan pada Rumus
        // 4. Melakukan perhitungan pada volume bangun ruang

        // Membuat objek bangunRuang
        Rumus bangunRuang = new Rumus();

        // Output bangun ruang

        System.out.println("========== BALOK ==========");
        // Memasukkan nilai
        bangunRuang.setPanjang(12);
        bangunRuang.setLebar(9);
        bangunRuang.setTinggi(10);

        // Menampilkan Hasil Perhitungan
        System.out.println("Volume = Panjang * Lebar * Tinggi");
        System.out.println("\t\t " + bangunRuang.getPanjang() + " * " + bangunRuang.getLebar() + " * " + bangunRuang.getTinggi() + " = "
                + bangunRuang.getVolumeBalok());



        System.out.println("========== BOLA ==========");
        bangunRuang.setJariJari(4);
        System.out.println("Volume = 4/3 * Phi * ( r * r * r )");
        System.out.println("\t\t 1.3 * " + bangunRuang.getPhi() +
                " * ( " + bangunRuang.getJariJari() + " * " + bangunRuang.getJariJari() + " * " + bangunRuang.getJariJari() +
                " ) = " + bangunRuang.getVolumeBola());


        System.out.println("========== KERUCUT ==========");
        //  Memasukkan nilai
        bangunRuang.setJariJari(9);
        bangunRuang.setTinggi(13);

        // Menampilkan Hasil Perhitungan
        System.out.println("Volume = 1/3 * Phi * ( r * r ) * Tinggi");
        System.out.println("\t\t 0.3 * " + bangunRuang.getPhi() + " ( " +
                bangunRuang.getJariJari() + " * " + bangunRuang.getJariJari() + " ) * "
                + bangunRuang.getTinggi() + " = " + bangunRuang.getVolumeKerucut());


        System.out.println("========== TABUNG ==========");
        // Memasukkan Nilai
        bangunRuang.setJariJari(5);
        bangunRuang.setTinggi(8);

        // Menampilkan hasil perhitungan
        System.out.println("Volume = Phi * ( r * r ) * Tinggi");
        System.out.println("\t\t " + bangunRuang.getPhi() + " * ( "
                + bangunRuang.getJariJari() + " * " + bangunRuang.getJariJari() + " ) * " + bangunRuang.getTinggi()
                + " = " + bangunRuang.getVolumeTabung());


        System.out.println("========== PRISMA ==========");
        // Memasukkan nilai
        bangunRuang.setAlas(8);
        bangunRuang.setTinggi(6);
        bangunRuang.setTinggiPrisma(15);

        // Menampilkan hasil perhitungan
        System.out.println("Volume = ( 1/2 * a * t ) * Tinggi Prisma ");
        System.out.println("\t\t (0.5 * " + bangunRuang.getAlas() + " * " + bangunRuang.getTinggi() +
                           " ) * " + bangunRuang.getTinggiPrisma() + " = " + bangunRuang.getVolumePrisma() );


        System.out.println("========== LIMAS ==========");
        // Memasukkan nilai
        bangunRuang.setPanjang(6);
        bangunRuang.setLebar(8);
        bangunRuang.setTinggi(8);

        // Menampilkan hasil perhitungan
        System.out.println("Volume = 1/3 ( 1/2 * Panjang * Lebar ) * Tinggi");
        System.out.println("\t\t 0.3 ( 0.5 " + " * " + bangunRuang.getPanjang() + " * " + bangunRuang.getLebar()
            + " ) * " + bangunRuang.getTinggi());
    }

    // Nilai 4/3 = 1.3 , Nilai 1/3 = 0.3
}

class Rumus {
    // Tempat Menyimpan Rumus

    final double phi = 3.14;

    public double getPhi() {
        return phi;
    }

    int panjang;
    int lebar;
    int tinggi;
    int sisi;
    int alas;
    int jariJari;
    int tinggiPrisma;

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public int getVolumeBalok() {
        return (int) (panjang * lebar * tinggi);
    }

    public int getVolumeBola() {
        return (int) (1.3 * phi * (jariJari * jariJari * jariJari));
    }

    public int getVolumeKerucut(){
        return (int) (0.3 * phi * (jariJari * jariJari) * tinggi );
    }

    public int getVolumeTabung() {
        return (int) (phi * (jariJari * jariJari) * tinggi);
    }

    public int getVolumePrisma() {
        return (int) ((0.5 * alas * tinggi) * tinggiPrisma );
    }

    public int getVolumeLimas() {
        return (int) (0.3 * (0.5 * panjang * lebar) * tinggi);
    }


    public int getJariJari() {
        return jariJari;
    }

    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }
}