package TampilanAwal;

import Menghitung.modal;
import Bahan.bahanRoti;
import Main.rotiManis;
import Main.rotiTawar;
import Main.pizza;
import Menghitung.hargaPesanan;
import Pesanan.pesananRotiManis;
import Pesanan.pesananPizza;
import Pesanan.pesananRotiTawar;
import hargaBahan.beratKemasanBahanRoti;

import java.sql.SQLOutput;

public class tampilanAwal {
     ;

    public void MainMenu(){
        System.out.println("---------------------------------------------------------");
        System.out.println("SELAMAT DATANG DI TOKO ROTI YOOSHI");
        System.out.println("---------------------------------------------------------");
        System.out.println("Terdapat 3 Roti [ROTI MANIS] [ROTI TAWAR] [PIZZA] ");
        System.out.println("Roti Manis dengan 3 Varian");
        System.out.println("Varian 1 [ Topping Coklat dengan isian coklat dan keju ]");
        System.out.println("Varian 2 [ Topping Kacang merah dengan isian krim Vanilla ]");
        System.out.println("Varian 3 [ Isian Keju dan sosis ]");
        System.out.println("Roti Tawar dengan 2 Varian");
        System.out.println("Varian 1 [ Dengan isian Coklat ]");
        System.out.println("Varian 2 [ Dengan isian Keju ]");
        System.out.println("Pizza dengan 1 Varian");
        System.out.println("Dengan topping keju, Sosis, Smoked Beef dan bawang Bombay");




        // Membuat objek roti manis
        rotiManis rotiManis = new rotiManis();
        bahanRoti bahanRotiManis = rotiManis;
        beratKemasanBahanRoti beratKemasanRotiManis= new beratKemasanBahanRoti();

        // Menampilkan berat kemasan bahan roti manis
        System.out.println("Berat Kemasan Bahan Roti Manis:");
        System.out.println("Tepung Terigu: " + beratKemasanRotiManis.TepungTerigu() + " gram");
        System.out.println("Gula Pasir: " + beratKemasanRotiManis.gulaPasir() + " gram");
        System.out.println("Butter: " + beratKemasanRotiManis.butter() + " gram");
        System.out.println("Ragi: " + beratKemasanRotiManis.ragi() + " gram");
        System.out.println("Susu Bubuk: " + beratKemasanRotiManis.susuBubuk() + " gram");
        System.out.println("Susu Cair: " + beratKemasanRotiManis.susuCair() + " gram");
        System.out.println("Telur: " + beratKemasanRotiManis.telur() + " gram");
        System.out.println("Es Batu: " + beratKemasanRotiManis.esBatu() + " gram");

        // Menampilkan jumlah adonan roti manis
        System.out.println("Jumlah Adonan Roti Manis: " + rotiManis.adonanManis() + " pcs");



        // Membuat objek roti tawar
        rotiTawar rotiTawar = new rotiTawar();
        bahanRoti bahanRotiTawar = rotiTawar;
        beratKemasanBahanRoti beratKemasanRotiTawar = new beratKemasanBahanRoti();

        // Menampilkan berat kemasan bahan roti manis
        System.out.println("Berat Kemasan Bahan Roti Manis:");
        System.out.println("Tepung Terigu: " + beratKemasanRotiTawar.TepungTerigu() + " gram");
        System.out.println("Gula Pasir: " + beratKemasanRotiTawar.gulaPasir() + " gram");
        System.out.println("Butter: " + beratKemasanRotiTawar.butter() + " gram");
        System.out.println("Ragi: " + beratKemasanRotiTawar.ragi() + " gram");
        System.out.println("Susu Bubuk: " + beratKemasanRotiTawar.susuBubuk() + " gram");
        System.out.println("Susu Cair: " + beratKemasanRotiTawar.susuCair() + " gram");
        System.out.println("Telur: " + beratKemasanRotiTawar.telur() + " gram");
        System.out.println("Es Batu: " + beratKemasanRotiTawar.esBatu() + " gram");

        // Menampilkan jumlah adonan roti manis
        System.out.println("Jumlah Adonan Roti Tawar: " + rotiTawar.adonanTawar() + " pcs");




        // Membuat objek roti tawar
        pizza pizza = new pizza();
        bahanRoti bahanPizza = pizza;
        beratKemasanBahanRoti beratKemasanPizza = new beratKemasanBahanRoti();

        // Menampilkan berat kemasan bahan roti manis
        System.out.println("Berat Kemasan Bahan Roti Manis:");
        System.out.println("Tepung Terigu: " + beratKemasanPizza.TepungTerigu() + " gram");
        System.out.println("Gula Pasir: " + beratKemasanPizza.gulaPasir() + " gram");
        System.out.println("Butter: " + beratKemasanPizza.butter() + " gram");
        System.out.println("Ragi: " + beratKemasanPizza.ragi() + " gram");
        System.out.println("Susu Bubuk: " + beratKemasanPizza.susuBubuk() + " gram");
        System.out.println("Susu Cair: " + beratKemasanPizza.susuCair() + " gram");
        System.out.println("Telur: " + beratKemasanPizza.telur() + " gram");
        System.out.println("Es Batu: " + beratKemasanPizza.esBatu() + " gram");

        // Menampilkan jumlah adonan roti manis
        System.out.println("Jumlah Adonan Roti Tawar: " + pizza.adonanPizza() + " pcs");




        pesananRotiManis v1 = new pesananRotiManis();
        v1.ngitungPesananv1();

        pesananRotiManis v2 = new pesananRotiManis();
        v2.ngitungPesananv2();

        pesananRotiManis v3 = new pesananRotiManis();
        v3.ngitungPesananv3();

        pesananPizza v4 = new pesananPizza();
        v4.pesananPizza();

        pesananRotiTawar v5 = new pesananRotiTawar();
        v5.PesananrotiTawarV1();

        pesananRotiTawar v6 = new pesananRotiTawar();
        v6.PesananrotiTawarV2();
        hargaPesanan pesanan = new hargaPesanan();

        // Menampilkan harga pesanan
        System.out.println( "Total harga pesanan: Rp " + new hargaPesanan());
   }


}
