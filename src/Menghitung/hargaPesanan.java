package Menghitung;
import Menghitung.hargaPcs;
import Pesanan.pesananPizza;
import Pesanan.pesananRotiManis;
import Pesanan.pesananRotiTawar;
import TampilanAwal.tampilanAwal;

import java.util.HashMap;
import java.util.Map;

public class hargaPesanan {
    // Menghitung harga pesanan

    public static double hargaJualRotiManisfinal () {
        return Math.round(hargaPcs.hargaJualRotiManis() * (pesananRotiManis.angka + pesananRotiManis.angka2 + pesananRotiManis.angka3));
    }
    public static double hargaJualRotiTawarfinal() {
        return hargaPcs.hargaJualRotiTawar() * (pesananRotiTawar.angka4 + pesananRotiTawar.angka5);
    }
    public static double hargaJualPizzafinal()
    {
        return hargaPcs.hargaJualPizza() * pesananPizza.angka6;
    }




    public static double hargaPesananfilal(){
       return hargaJualRotiManisfinal() + hargaJualRotiTawarfinal() + hargaJualPizzafinal()
    ;}
}

