package Menghitung;
import Menghitung.modal;
import MainClass.mainClass;
import Pesanan.pesananRotiManis;
import Pesanan.pesananPizza;
import Pesanan.pesananRotiTawar;


public class hargaPcs {

    modal modalRotManis = new modal();
    pesananRotiManis OrderanRotiManisV1 = new pesananRotiManis();
    pesananRotiTawar OrderanRotiTawarV2 = new pesananRotiTawar();
    public double totalModal;

    // Menghitung harga jual per pcs roti
    public static double hargaJualRotiManis () {
        return modal.hargaModalRotiManis1() / pesananRotiManis.angka + pesananRotiManis.angka2 + pesananRotiManis.angka3 * 1.4;
    }
    public static double hargaJualRotiTawar() {
        return modal.hargaModalRotiTawar2() / pesananRotiTawar.angka4 + pesananRotiTawar.angka5 * 1.4;}
    public static double hargaJualPizza()
    {
        return modal.hargaModalPizza() / pesananPizza.angka6 *1.4;}
    }

