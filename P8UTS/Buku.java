package P8UTS;
public class Buku extends Koleksi {
     private String penulis;

    public Buku(String kode, String judul, String penulis) {
        super(kode, judul);
        this.penulis = penulis;
    }
    public String getPenulis() { return penulis; }
    @Override
    public int hitungDenda() {
        int denda = hariTerlambat * 1000;
        return Math.min(denda, 20000);   // maksimal Rp20.000
    }
    @Override
    public String getJenis() { return "Buku"; }
}
