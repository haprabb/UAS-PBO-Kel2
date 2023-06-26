package hargaBahan;
import Bahan.bahanRoti;

import javax.swing.*;

public class beratKemasanBahanRoti implements bahanRoti {
    public int TepungTerigu() {
        int priceTepungTerigu = 40000 / 1000;
        return priceTepungTerigu;
    }
    public int gulaPasir() {
        int priceGulaPasir = 25000 / 1000;
        return priceGulaPasir;
    }
    public int butter() {
        int priceButter = 23000 / 500;
        return priceButter;
    }

    public int ragi() {
        int priceRagi = 5000 / 11;
        return priceRagi;
    }
    public int susuBubuk() {
       int priceSusuBubuk = 39000 / 1000;
       return priceSusuBubuk;
    }

    public int susuCair() {
        int priceSusuCair = 24000 / 1000;
        return priceSusuCair;
    }

    public int telur() {
        int priceTelur = 23000 / 1000;
        return priceTelur;
    }
    public int esBatu() {
        int priceEsBatu = 2000 / 1000;
        return priceEsBatu;
    }
}
