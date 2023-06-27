package Main;
import Bahan.bahanRoti;
public class pizza implements bahanRoti{
    int totalAdonan= 1950;
    int doughPcsPizza = 190;

    public int TepungTerigu() {

        return 1_000;
    }


    public int gulaPasir() {

        return 100;
    }


    public int butter() {

        return 100;
    }


    public int ragi() {

        return 20;
    }


    public int susuBubuk() {

        return 200;
    }


    public int susuCair() {

        return 180;
    }


    public int telur() {

        return 50;
    }


    public int esBatu() {

        return 300;
    }
    public int adonanPizza () {
        int pcsRotiPizza = this.totalAdonan / this.doughPcsPizza;
        return pcsRotiPizza;
    }
}
