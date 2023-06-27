package MainClass;

import Main.rotiManis;
import TampilanAwal.tampilanAwal;
import Bahan.bahanRoti;
import hargaBahan.beratKemasanBahanRoti;
import Menghitung.hargaPesanan;

import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        tampilanAwal awal = new tampilanAwal();
        awal.MainMenu();
        hargaPesanan pesanan = new hargaPesanan();



        // Membuat objek roti manis
                rotiManis rotiManis = new rotiManis();
                bahanRoti bahanRotiManis = rotiManis;
                beratKemasanBahanRoti beratKemasanRotiManis = new beratKemasanBahanRoti();

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

                // Menampilkan harga pesanan
                 System.out.println( "Total harga pesanan: Rp " + new hargaPesanan());
            }
        }





