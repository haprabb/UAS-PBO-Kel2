package hargaBahan;
import Bahan.bahanRoti;

import javax.swing.*;

public class beratKemasanBahanRoti implements bahanRoti {
    int weight;
    public int TepungTerigu() {
        int price = 40000 / 1000;
        return price;
    }
    public int gulaPasir() {
        int price = 25000 / 1000;
        return price;
    }
    public int butter() {
        int price = 23000 / 500;
        return price;
    }

    public int ragi() {
        int price = 5000 / 11;
        return price;
    }
    public int susuBubuk() {
       int price = 39000 / 1000;
       return price;
    }

    public int susuCair() {
        int price = 24000 / 1000;
        return price;
    }

    public int telur() {
        int price = 23000 / 1000;
        return price;
    }
    public int esBatu() {
        int price = 2000 / 1000;
        return price;
    }
}
