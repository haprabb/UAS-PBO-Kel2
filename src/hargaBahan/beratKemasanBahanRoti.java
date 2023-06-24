package hargaBahan;
import Bahan.bahanRoti;

import javax.swing.*;

public class beratKemasanBahanRoti implements bahanRoti {
    int weight;
    public int TepungTerigu() {
        if (this.weight > 1000){
            return this.weight * 40000;
        } else {
            return 40000;
        }
    }
    public int gulaPasir() {
        if (this.weight > 1000){
            return this.weight * 25000;
        } else {
            return 25000;
        }
    }

    public int butter() {
        if (this.weight > 500){
            return this.weight * 23000;
        } else {
            return 23000;
        }
    }

    public int ragi() {
        if (this.weight > 11){
            return this.weight * 5000;
        } else {
            return 5000;
        }
    }
    public int susuBubuk() {
        if (this.weight > 1000){
            return this.weight * 39000;
        } else {
            return 39000;
        }
    }

    public int susuCair() {
        if (this.weight > 1000){
            return this.weight * 24000;
        } else {
            return 24000;
        }
    }

    public int telur() {
        if (this.weight > 1000){
            return this.weight * 23000;
        } else {
            return 23000;
        }
    }
    public int esBatu() {
        if (this.weight > 1000){
            return this.weight * 2000;
        } else {
            return 2000;
        }
    }

}
