package KuisPraktikum;
public class Smartphone {
    private String merk;
    private Baterai baterai;

    public Smartphone(String merk, int kapasitasBaterai){
        this.merk = merk;
        this.baterai = new Baterai(kapasitasBaterai, kapasitasBaterai);
    }
    public void isiDaya(Charger c, int menit){
        if (c == null) {
            System.out.println("Charger tidak terdeteksi");
            return;
        }
        int tambahan = c.getDaya() * menit / 10;
        baterai.setPersen(baterai.getPersen() + tambahan);
    }
    public void pakai(int menit){
        baterai.setPersen(baterai.getPersen() - menit);
    }
    public void tampilkanInfo(){
        System.out.println(merk + " | baterai " + baterai.getKapasitas() + " mAH | " + baterai.getPersen() + "%");
    }
}
