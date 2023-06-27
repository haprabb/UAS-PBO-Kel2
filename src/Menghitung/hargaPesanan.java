package Menghitung;

import Menghitung.hargaPcs;
import java.util.HashMap;
import java.util.Map;

public class hargaPesanan {
    // Menghitung harga pesanan
    Map<String, Integer> pesanan = new HashMap<>();
    static int ngitungpesananv1;
    static int ngitungpesananv2;
    static int ngitungpesananv3;
    static int pesananrotiTawarV1;
    static int pesananrotiTawarV2;
    static int pesananPizza;

    public void hitungHargaPesanan() {
        int totalHarga = hargaPesanan(pesanan);
        System.out.println("Total harga pesanan: Rp " + totalHarga);
    }

    private int hargaPesanan(Map<String, Integer> pesanan) {
        // Implementasi untuk menghitung harga pesanan berdasarkan pesanan yang ada
        // ...
        return 0; // Ganti 0 dengan nilai yang sesuai setelah implementasi
    }
}
