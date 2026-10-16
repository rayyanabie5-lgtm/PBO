package P8UTS;
public class Perpustakaan {
    private String nama;
    private Rak[] daftarRak;
    private Pustakawan kepala;

    public Perpustakaan(String nama, int jumlahRak) {
        if (jumlahRak < 1) {
            throw new IllegalArgumentException("Jumlah rak minimal 1");
        }
        this.nama = nama;
        this.daftarRak = new Rak[jumlahRak];
        for (int i = 0; i < jumlahRak; i++) {
            daftarRak[i] = new Rak("R-" + (i + 1));
        }
    }
    public void setKepala(Pustakawan kepala) {
        this.kepala = kepala;
    }
    public void simpanKoleksi(Koleksi k) {
        if (k == null) {
            System.out.println("Koleksi tidak valid");
            return;
        }
        for (Rak rak : daftarRak) {
            if (!rak.isPenuh()) {
                rak.taruh(k);
                return;
            }
        }
        System.out.println("Semua rak penuh, koleksi " + k.getKode() + " ditolak");
    }
    public void simpanKoleksi(Koleksi k, int nomorRak) {
        if (k == null) {
            System.out.println("Koleksi tidak valid.");
            return;
        }
        if (nomorRak < 1 || nomorRak > daftarRak.length) {   // guard indeks
            System.out.println("Nomor rak " + nomorRak + " tidak valid.");
            return;
        }
        daftarRak[nomorRak - 1].taruh(k);
    }
     public void tampilInfo() {
        System.out.println("Perpustakaan: " + nama);
        System.out.println("Kepala: " + (kepala != null ? kepala.getNama() : "-"));
        for (Rak rak : daftarRak) {
            System.out.println("Rak " + rak.getKode() + ":");
            for (Koleksi k : rak.getIsi()) {
                System.out.println("  - [" + k.getJenis() + "] " + k.getKode()
                        + " " + k.getJudul());
            }
        }
    }
    
}
