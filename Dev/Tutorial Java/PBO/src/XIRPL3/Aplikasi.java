package XIRPL3;


// Input
// nextBoolean() membaca nilai boolean dari user
// nextByte() membaca nilai byte dari user
// nextDouble() membaca nilai double dari user
// nextFloat() membaca nilai float dari user
// nextInt() membaca nilai int dari user
// nextLine() membaca nilai String dari user
// nextLong() membaca nilai long dari user
// nextShort() membaca nilai short dari user


import XIRPL2.BangunRuang;

public class Aplikasi {

    public static void main(String[] args){

        int i; do { i = (int) (Math.random() * 100); } while( i > 33 );
        System.out.println("Yang jawab adalah absensi nomor: " + i);

        final double phi = 3.14;

        User user = new User();
        //user.getUmur()

        BangunRuang bangunRuang = new BangunRuang();

        bangunRuang.setPanjang(100);
        bangunRuang.setLebar(100);
        bangunRuang.setTinggi(100);

        //System.out.println("volume limas adalah: " + bangunRuang.getVolumeLimas());

    }

}

















//        System.out.println("Mencari Luas Bangun Ruang");
//
//        System.out.println("======= TABUNG =========");
//        Scanner userObj = new Scanner(System.in); // Membuat scanner object
//        System.out.println("Masukkan nilai jari jari : ");
//
//        double jariJari = userObj.nextDouble(); // Membaca inputan user
//        double luasTabung = 2 * phi * ( jariJari * jariJari ) + 2 * phi * jariJari;
//        System.out.println("Luas Tabung = " + luasTabung); // Output user input







//class BangunRuang3 {
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
//    public int getTinggi() {
//        return tinggi;
//    }
//
//    public void setTinggi(int tinggi) {
//        this.tinggi = tinggi;
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
//    public int getJariJari() {
//        return jariJari;
//    }
//
//    public void setJariJari(int jariJari) {
//        this.jariJari = jariJari;
//    }
//}