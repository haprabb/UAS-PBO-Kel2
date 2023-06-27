package Menghitung;
import hargaBahan.beratKemasanBahanRoti;
import hargaBahan.beratKemasanToppingFilling;
import Main.rotiManis;
import Main.rotiTawar;
import Main.pizza;

public class modal extends beratKemasanBahanRoti {

    static pizza AdonanPizza = new pizza();
    static rotiManis AdonanRotiManis = new rotiManis();
    static rotiTawar AdonanRotiTawar = new rotiTawar();

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
    public static void modalRotiManis(){
        modal. modalTepungManis = modal.TepungTerigu() * modal.TepungTerigu() / modal.AdonanRotiManis.adonanManis();
        modal.modalGulaManis = modal.gulaPasir() * modal.gulaPasir()/ modal.AdonanRotiManis.adonanManis();
        modal. modalButterManis = modal.butter() * modal.butter()/ modal.AdonanRotiManis.adonanManis();
        modal. modalRagiManis = modal.ragi() * modal.ragi()/ modal.AdonanRotiManis.adonanManis();
        modal.modalSusuBubukManis = modal.susuBubuk() * modal.susuBubuk()/ modal.AdonanRotiManis.adonanManis();
        modal. modalSusuCairManis= modal.susuCair() * modal.susuCair() / modal.AdonanRotiManis.adonanManis();
        modal.modalTelurManis = modal.telur() * modal.telur() / modal.AdonanRotiManis.adonanManis();
        modal.modalEsBatuManis = modal.esBatu() * modal.esBatu()/ modal.AdonanRotiManis.adonanManis();

    }

    public void modalRotitawar(){
        this.modalTepungTawar = this.TepungTerigu() * this.TepungTerigu() / this.AdonanRotiTawar.adonanTawar();
        this.modalGulaTawar= this.gulaPasir() * this.gulaPasir()/ this.AdonanRotiTawar.adonanTawar();
        this.modalButterTawar = this.butter() * this.butter()/ this.AdonanRotiTawar.adonanTawar();
        this.modalRagiTawar = this.ragi() * this.ragi()/ this.AdonanRotiTawar.adonanTawar();
        this.modalSusuBubukTawar = this.susuBubuk() * this.susuBubuk()/ this.AdonanRotiTawar.adonanTawar();
        this.modalSusuCairTawar= this.susuCair() * this.susuCair()/ this.AdonanRotiTawar.adonanTawar() ;
        this.modalTelurTawar = this.telur() * this.telur()/ this.AdonanRotiTawar.adonanTawar() ;
        this.modalEsBatuTawar = this.esBatu() * this.esBatu()/ this.AdonanRotiTawar.adonanTawar();

    }
    public void modalPizza(){

        this.modalTepungPizza = this.TepungTerigu() * this.TepungTerigu() / this.AdonanPizza.adonanPizza();
        this. modalGulaPizza = this.gulaPasir() * this.gulaPasir() / this.AdonanPizza.adonanPizza();
        this.modalButterPizza = this.butter() * this.butter() / this.AdonanPizza.adonanPizza();
        this.modalRagiPizza = this.ragi() * this.ragi() / this.AdonanPizza.adonanPizza();
        this.modalSusuBubukPizza = this.susuBubuk() * this.susuBubuk() / this.AdonanPizza.adonanPizza();
        this.modalSusuCairPizza = this.susuCair() * this.susuCair() / this.AdonanPizza.adonanPizza();
        this.modalTelurPizza = this.telur() * this.telur() / this.AdonanPizza.adonanPizza();
        this.modalEsBatuPizza = this.esBatu() * this.esBatu() / this.AdonanPizza.adonanPizza();

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
