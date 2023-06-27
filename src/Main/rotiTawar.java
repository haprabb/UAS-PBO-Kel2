package Main;
import Bahan.bahanRoti;
import hargaBahan.beratKemasanBahanRoti;

public class rotiTawar implements bahanRoti {
    int doughPcsTawar = 400;
    int totalAdonan = 2065;
    public int TepungTerigu() {

        return 1000;
    }

    public int gulaPasir() {

        return 125;
    }

    public int butter() {

        return 100;
    }

    public int ragi() {

        return 20;
    }

    public int susuBubuk() {

        return 250;
    }

    public int susuCair() {

        return 200;
    }

    public int telur() {

        return 70;
    }

    public int esBatu() {

        return 300;
    }
    public int adonanTawar () {
        int pcsRotiTawar = this.totalAdonan / this.doughPcsTawar;
        return pcsRotiTawar;
    }
}
