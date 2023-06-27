package Main;
import Bahan.bahanRoti;
import hargaBahan.beratKemasanBahanRoti;

public class rotiManis extends beratKemasanBahanRoti implements bahanRoti {
    int doughPcsManis = 50;
    int totalAdonan = 2350;
    public static int TepungTerigu() {
        return 1_000;

    }

    public static int gulaPasir() {

        return 150;
    }

    public static int butter() {
        return 150;

    }

    public static int ragi() {

        return 20;
    }

    public static int susuBubuk() {

        return 300;
    }

    public static int susuCair() {

        return 250;
    }

    public static int telur() {

        return 80;
    }

    public static int esBatu() {

        return 400;
    }

    public int adonanManis (){
        int pcsRotiManis = this.totalAdonan / this.doughPcsManis;
        return pcsRotiManis;
    }
}
