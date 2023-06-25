package Pesanan;
import java.util.Scanner;
public class pesananRotiManis {
    static Scanner v1 = new Scanner(System.in);
    static int angka;
    static void ngitungPesananv1(){
        System.out.print("Masukkan berapa pesanan anda untuk menu Roti Manis varian 1 = ");
       pesananRotiManis.angka = v1.nextInt();

    }

    static void ngitungPesananv2(){
        System.out.print("Mauskkan Berapa pesanan anda untuk menut Roti Manis Varian 2 =");
        pesananRotiManis.angka = v1.nextInt();


    }

    static void ngitungPesananv3(){
        System.out.print("Masukkan Berapa pesanan anda untuk menu Roti Manis varian 3 =");
        pesananRotiManis.angka = v1.nextInt();
    }
}
