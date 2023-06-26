package MainClass;
import TampilanAwal.tampilanAwal;
import Pesanan.pesananRotiManis;
import Pesanan.pesananPizza;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
    tampilanAwal awal = new tampilanAwal();
    awal.MainMenu();

    pesananRotiManis v1 = new pesananRotiManis();
    v1.ngitungPesananv1();

    pesananRotiManis v2 = new pesananRotiManis();
    v2.ngitungPesananv2();

    pesananRotiManis v3 = new pesananRotiManis();
    v3.ngitungPesananv3();

    pesananPizza v4 = new pesananPizza();
    v4.pesananPizza();


    }
}
