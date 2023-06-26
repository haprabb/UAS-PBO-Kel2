package TampilanAwal;
import Pesanan.pesananRotiManis;
import Pesanan.pesananPizza;
import Pesanan.pesananRotiTawar;

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




    }


}
