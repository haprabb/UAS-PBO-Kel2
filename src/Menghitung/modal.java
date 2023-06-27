package Menghitung;
import hargaBahan.beratKemasanBahanRoti;
import hargaBahan.beratKemasanToppingFilling;
import Main.rotiManis;
import Main.rotiTawar;

public class modal extends beratKemasanBahanRoti {
    // Menghitung harga modal
    static int modalTepungManis;
    static int modalGulaManis;
    static int modalButterManis;
    static int modalRagiManis;
    static int modalSusuBubukManis;
    static int modalSusuCairManis;
    static int modalTelurManis;
    static int modalEsBatuManis;
    static int modalTepungTawar;
    static int modalGulaTawar;
    static int modalButterTawar;
    static int modalRagiTawar;
    static int modalSusuBubukTawar;
    static int modalSusuCairTawar;
    static int modalTelurTawar;
    static int modalEsBatuTawar;
    static int modalTepungPizza;
    static int modalGulaPizza;
    static int modalButterPizza;
    static int modalRagiPizza;
    static int modalSusuBubukPizza;
    static int modalSusuCairPizza;
    static int modalTelurPizza;
    static int modalEsBatuPizza;
    public void modalRotiManis(){
        int modalTepungManis = this.TepungTerigu() * this.TepungTerigu();
        int modalGulaManis = this.gulaPasir() * this.gulaPasir();
        int modalButterManis = this.butter() * this.butter();
        int modalRagiManis = this.ragi() * this.ragi();
        int modalSusuBubukManis = this.susuBubuk() * this.susuBubuk();
        int modalSusuCairManis= this.susuCair() * this.susuCair() ;
        int modalTelurManis = this.telur() * this.telur() ;
        int modalEsBatuManis = this.esBatu() * this.esBatu();

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

    }

    public static double hargaModalRotiManis1(){
        return modal.modalTepungManis + modal.modalGulaManis + modal.modalButterManis + modal.modalRagiManis + modal.modalSusuBubukManis + modal.modalSusuCairManis + modal.modalTelurManis + modal.modalEsBatuManis;
    }
    public static double hargaModalRotiTawar2(){
        return modal.modalTepungTawar + modal.modalGulaTawar + modal.modalButterTawar + modal.modalRagiTawar + modal.modalSusuBubukTawar + modal.modalSusuCairTawar + modal.modalTelurTawar + modal.modalEsBatuTawar;
    }

    public static double hargaModalPizza(){
        return modal.modalTepungPizza + modal.modalGulaPizza + modal.modalButterPizza + modal.modalRagiPizza + modal.modalSusuBubukPizza + modal.modalSusuCairPizza + modal.modalTelurPizza + modal.modalEsBatuPizza;
    }

}
