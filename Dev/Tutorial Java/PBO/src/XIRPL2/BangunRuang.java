package XIRPL2;

public class BangunRuang extends BangunDatar {

    private int tinggi;

    public int getVolumeBalok() {
        return panjang * lebar * tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
