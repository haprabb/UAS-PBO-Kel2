package Pesanan;

import java.util.Scanner;

public class pesananRotiTawar{
    static Scanner rotiTawarV1 = new Scanner(System.in);
    static Scanner rotiTawarV2 = new Scanner(System.in);
    public static int angka4;
    public static int angka5;
    public static void PesananrotiTawarV1(){
        System.out.print("Masukkan berapa pesanan anda untuk menu Roti Tawar varian 1 = ");
        pesananRotiTawar.angka4 = rotiTawarV1.nextInt();

    }

    public static void PesananrotiTawarV2(){
        System.out.print("Mauskkan Berapa pesanan anda untuk menut Roti Tawar Varian 2 =");
        pesananRotiTawar.angka5 = rotiTawarV2.nextInt();


    }

}
