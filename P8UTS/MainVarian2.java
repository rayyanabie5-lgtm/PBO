package P8UTS;
public class MainVarian2 {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Polinema", 2);
        perpus.setKepala(new Pustakawan("P-01", "Bu Dewi"));

        Anggota rafi = new Anggota("A-01", "Rafi");
        Anggota nadia = new Anggota("A-02", "Nadia");

        Buku b1 = new Buku("B-01", "Pemrograman Java", "Abdul Kadir");
        b1.setPeminjam(rafi);
        b1.setHariTerlambat(4);

        Buku b2 = new Buku("B-02", "Struktur Data", "Rinaldi");
        b2.setPeminjam(nadia);
        b2.setHariTerlambat(25);

        Majalah m1 = new Majalah("M-01", "Info Komputer", "Mei 2026");
        m1.setPeminjam(rafi);
        m1.setHariTerlambat(6);

        perpus.simpanKoleksi(b1);
        perpus.simpanKoleksi(b2);
        perpus.simpanKoleksi(m1, 2);

        PetugasSirkulasi petugas = new PetugasSirkulasi("Petugas 1");
        petugas.cetakDenda(b1);
        petugas.cetakDenda(b2);
        petugas.cetakDenda(m1);
    }
}
