package KuisPraktikum;
public class Baterai {
    private int kapasitas;
    private int persen;

    public Baterai(){
    }
    public Baterai(int kapasitas, int persen) {
        this.kapasitas = kapasitas;
        setPersen(persen); 
    }
    public void setPersen(int persen){
        if (persen > 100) {
            persen = 100;
        } else if (persen < 0) {
            persen = 0;
        }
        this.persen = persen;
    }
    public int getPersen(){
        return persen;
    }
    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }
    public int getKapasitas(){
        return kapasitas;
    }
}