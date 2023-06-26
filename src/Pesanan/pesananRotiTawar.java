package Pesanan;

import java.util.Scanner;

public class pesananRotiTawar {
    static Scanner rotiTawarV1 = new Scanner(System.in);
    static Scanner rotiTawarV2 = new Scanner(System.in);

    static int angka;

    public static void ngitungPesananv1() {
        System.out.print("Masukkan berapa pesanan anda untuk menu Roti Tawar varian 1 = ");
        pesananRotiManis.angka = rotiTawarV1.nextInt();
    }

    public static void ngitungPesananv2() {
        System.out.print("Mauskkan Berapa pesanan anda untuk menut Roti Tawar Varian 2 =");
        pesananRotiManis.angka = rotiTawarV2.nextInt();


    }
}