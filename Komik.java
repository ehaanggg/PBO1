public class Komik extends Buku {
    private int volume;

    // Konstruktor
    public Komik(String judul, String penulis, int tahunTerbit, double harga, int volume) {
        super(judul, penulis, tahunTerbit, harga);
        this.volume = volume;
    }

    // Getter untuk volume
    public int getVolume() {
        return volume;
    }

    // Override method untuk menaikkan harga
    @Override
    public void naikkanHarga(double persentase) {
        // Komik mendapatkan kenaikan harga tambahan 5% dibandingkan buku biasa
        double tambahanPersentase = persentase + 5;
        super.naikkanHarga(tambahanPersentase);
    }

    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku = new Buku("Java Programming", "John Doe", 2010, 50000);
        System.out.println("Harga Buku sebelum kenaikan: " + buku.getHarga());
        buku.naikkanHarga(10);
        System.out.println("Harga Buku setelah kenaikan: " + buku.getHarga());

        // Membuat objek Komik
        Komik komik = new Komik("Naruto", "Masashi Kishimoto", 1999, 45000, 72);
        System.out.println("\nHarga Komik sebelum kenaikan: " + komik.getHarga());
        komik.naikkanHarga(10);
        System.out.println("Harga Komik setelah kenaikan: " + komik.getHarga());
    }
}
