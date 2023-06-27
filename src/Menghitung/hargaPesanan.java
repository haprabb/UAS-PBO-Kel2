package Menghitung;
import Menghitung.hargaPcs;
import Pesanan.pesananPizza;
import Pesanan.pesananRotiManis;
import Pesanan.pesananRotiTawar;

import java.util.HashMap;
import java.util.Map;

public class hargaPesanan {
    // Menghitung harga pesanan

    public static double hargaJualRotiManis () {
        return modal.hargaModalRotiManis1() / pesananRotiManis.angka + pesananRotiManis.angka2 + pesananRotiManis.angka3 * 1.4;
    }
    public static double hargaJualRotiTawar() {
        return modal.hargaModalRotiTawar2() / pesananRotiTawar.angka4 + pesananRotiTawar.angka5 * 1.4;}
    public static double hargaJualPizza()
    {
        return modal.hargaModalPizza() / pesananPizza.angka6 *1.4;}




    public void hargaPesanan(){

        System.out.println("Total jumlah roti");
    System.out.println("Total harga pesanan: Rp ");
}
}

