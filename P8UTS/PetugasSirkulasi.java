package P8UTS;
public class PetugasSirkulasi {
    private String nama;

    public PetugasSirkulasi(String nama) {
        this.nama = nama;
    }
     public void cetakDenda(Koleksi k) {
        if (k == null) {
            System.out.println("Koleksi tidak valid.");
            return;
        }
        String peminjam = (k.getPeminjam() != null) ? k.getPeminjam().getNama() : "-";
        System.out.println("[" + k.getJenis() + "] " + k.getKode() + " " + k.getJudul()
                + " | Peminjam: " + peminjam
                + " | Terlambat " + k.getHariTerlambat() + " hari"
                + " | Denda: " + k.hitungDenda());
    }
    
}
