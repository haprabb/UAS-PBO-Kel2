package Menghitung;
import Menghitung.modal;
import MainClass.mainClass;
import Pesanan.pesananRotiManis;
import Pesanan.pesananPizza;
import Pesanan.pesananRotiTawar;
import Main.pizza;
import Main.rotiTawar;
import Main.rotiManis;

public class hargaPcs {

    modal modalRotiManis = new modal();
    pesananRotiManis OrderanRotiManisV1 = new pesananRotiManis();
    pesananRotiTawar OrderanRotiTawarV2 = new pesananRotiTawar();
    public double totalModal;

    // Menghitung harga jual per pcs roti
    public static double hargaJualRotiManis () {
        modal.modalRotiManis();
        return (modal.modalTepungManis + modal.modalGulaManis + modal.modalButterManis + modal.modalRagiManis + modal.modalSusuBubukManis + modal.modalSusuCairManis + modal.modalTelurManis + modal.modalEsBatuManis) + ((40/100) * (modal.modalTepungManis + modal.modalGulaManis + modal.modalButterManis + modal.modalRagiManis + modal.modalSusuBubukManis + modal.modalSusuCairManis + modal.modalTelurManis + modal.modalEsBatuManis));
    }
    public static double hargaJualRotiTawar() {
        modal.hargaModalRotiTawar2();
        return (modal.modalTepungTawar + modal.modalGulaTawar + modal.modalButterTawar + modal.modalRagiTawar + modal.modalSusuBubukTawar + modal.modalSusuCairTawar + modal.modalTelurTawar + modal.modalEsBatuTawar)  * 1.4;}
    public static double hargaJualPizza()
    {   modal.hargaModalPizza();
        return (modal.modalTepungPizza + modal.modalGulaPizza + modal.modalButterPizza + modal.modalRagiPizza + modal.modalSusuBubukPizza + modal.modalSusuCairPizza + modal.modalTelurPizza + modal.modalEsBatuPizza) * 1.4;}
    }

