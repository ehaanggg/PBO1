public class Bebas {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private double harga;

    // Konstruktor
    public Bebas(String judul, String penulis, int tahunTerbit, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    // Getter untuk judul
    public String getJudul() {
        return judul;
    }

    // Getter untuk penulis
    public String getPenulis() {
        return penulis;
    }

    // Getter untuk tahun terbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Method untuk menaikkan harga
    public void naikkanHarga(double persentase) {
        harga += harga * persentase / 100;
    }

    @Override
    public String toString() {
        return "Bebas{" +
                "judul='" + judul + '\'' +
                ", penulis='" + penulis + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                ", harga=" + harga +
                '}';
    }
}
