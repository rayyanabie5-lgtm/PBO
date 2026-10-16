package P8UTS;
public abstract class Koleksi {
    protected String kode;
    protected String judul;
    protected int hariTerlambat;
    private Anggota peminjam;

    public Koleksi(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
    }
    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }
    public Anggota getPeminjam() {
        return peminjam;
    }
    public void setHariTerlambat(int hariTerlambat) {
        if (hariTerlambat < 0) {
            this.hariTerlambat = 0;
            return;
        }
        this.hariTerlambat = hariTerlambat;
    }
    public String getKode() {
        return kode;
    }
    public String getJudul() {
        return judul;
    }
    public int getHariTerlambat() {
        return hariTerlambat;
    }
    public abstract int hitungDenda();
    public abstract String getJenis();
    
}
