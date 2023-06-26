package Menghitung;
import hargaBahan.beratKemasanBahanRoti;
import hargaBahan.beratKemasanToppingFilling;
import Main.rotiManis;
import Main.rotiTawar;

public class modal extends beratKemasanBahanRoti {
    // Menghitung harga modal
    int modalTepungManis;
    int modalGulaManis;
    int modalButterManis;
    int modalRagiManis;
    int modalSusuBubukManis;
    int modalSusuCairManis;
    int modalTelurManis;
    int modalEsBatuManis;
    int modalTepungTawar;
    int modalGulaTawar;
    int modalButterTawar;
    int modalRagiTawar;
    int modalSusuBubukTawar;
    int modalSusuCairTawar;
    int modalTelurTawar;
    int modalEsBatuTawar;
    int modalTepungPizza;
    int modalGulaPizza;
    int modalButterPizza;
    int modalRagiPizza;
    int modalSusuBubukPizza;
    int modalSusuCairPizza;
    int modalTelurPizza;
    int modalEsBatuPizza;
    public void modalRotiManis(){
        int modalTepungManis = this.TepungTerigu() * this.TepungTerigu();
        int modalGulaManis = this.gulaPasir() * this.gulaPasir();
        int modalButterManis = this.butter() * this.butter();
        int modalRagiManis = this.ragi() * this.ragi();
        int modalSusuBubukManis = this.susuBubuk() * this.susuBubuk();
        int modalSusuCairManis= this.susuCair() * this.susuCair() ;
        int modalTelurManis = this.telur() * this.telur() ;
        int modalEsBatuManis = this.esBatu() * this.esBatu();
        int totalModalManis = this.modalTepungManis + this.modalGulaManis + this.modalButterManis + this.modalRagiManis + this.modalSusuBubukManis + this.modalSusuCairManis + this.modalTelurManis + this.modalEsBatuManis;
    }

    public void modalRotitawar(){
        int modalTepungTawar = this.TepungTerigu() * this.TepungTerigu();
        int modalGulaTawar= this.gulaPasir() * this.gulaPasir();
        int modalButterTawar = this.butter() * this.butter();
        int modalRagiTawar = this.ragi() * this.ragi();
        int modalSusuBubukTawar = this.susuBubuk() * this.susuBubuk();
        int modalSusuCairTawar= this.susuCair() * this.susuCair() ;
        int modalTelurTawar = this.telur() * this.telur() ;
        int modalEsBatuTawar = this.esBatu() * this.esBatu();
        int totalModalTawar= this.modalTepungTawar + this.modalGulaTawar + this.modalButterTawar + this.modalRagiTawar + this.modalSusuBubukTawar + this.modalSusuCairTawar + this.modalTelurTawar + this.modalEsBatuTawar;
    }
    public void modalPizza(){
        int modalTepungPizza = this.TepungTerigu() * this.TepungTerigu();
        int modalGulaPizza = this.gulaPasir() * this.gulaPasir();
        int modalButterPizza = this.butter() * this.butter();
        int modalRagiPizza = this.ragi() * this.ragi();
        int modalSusuBubukPizza = this.susuBubuk() * this.susuBubuk();
        int modalSusuCairPizza = this.susuCair() * this.susuCair() ;
        int modalTelurPizza = this.telur() * this.telur() ;
        int modalEsBatuPizza = this.esBatu() * this.esBatu();
        int totalModalPizza= this.modalTepungPizza + this.modalGulaPizza + this.modalButterPizza + this.modalRagiPizza + this.modalSusuBubukPizza + this.modalSusuCairPizza + this.modalTelurPizza + this.modalEsBatuPizza;
    }


}
