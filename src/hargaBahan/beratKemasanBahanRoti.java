package hargaBahan;
import Bahan.bahanRoti;

import javax.swing.*;

public class beratKemasanBahanRoti implements bahanRoti {
    public static int TepungTerigu() {
        int priceTepungTerigu = 40000 / 1000;
        return priceTepungTerigu;
    }
    public static int gulaPasir() {
        int priceGulaPasir = 25000 / 1000;
        return priceGulaPasir;
    }
    public static int butter() {
        int priceButter = 23000 / 500;
        return priceButter;
    }

    public static int ragi() {
        int priceRagi = 5000 / 11;
        return priceRagi;
    }
    public static int susuBubuk() {
       int priceSusuBubuk = 39000 / 1000;
       return priceSusuBubuk;
    }

    public static int susuCair() {
        int priceSusuCair = 24000 / 1000;
        return priceSusuCair;
    }

    public static int telur() {
        int priceTelur = 23000 / 1000;
        return priceTelur;
    }
    public static int esBatu() {
        int priceEsBatu = 2000 / 1000;
        return priceEsBatu;
    }
}
