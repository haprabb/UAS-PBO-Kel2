package Main;
import Bahan.bahanRoti;
import hargaBahan.beratKemasanBahanRoti;

public class rotiManis extends beratKemasanBahanRoti implements bahanRoti {
    int doughPcsManis = 50;
    int totalAdonan = 2350;
    public int TepungTerigu() {
        return 1_000;

    }

    public int gulaPasir() {
        return 150;
    }

    public int butter() {
        return 150;

    }

    public int ragi() {

        return 20;
    }

    public int susuBubuk() {

        return 300;
    }

    public int susuCair() {

        return 250;
    }

    public int telur() {

        return 80;
    }

    public int esBatu() {

        return 400;
    }

    public int adonanManis (){
        int pcsRotiManis = this.totalAdonan / this.doughPcsManis;
        return pcsRotiManis;
    }
}
