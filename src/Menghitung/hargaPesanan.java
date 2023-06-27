package Menghitung;
import Menghitung.hargaPcs;
import java.util.HashMap;
import java.util.Map;

public class hargaPesanan {
    // Menghitung harga pesanan
    Map<String, Integer> pesanan = new HashMap<>();

    public hargaPesanan() {

        pesanan.put("Roti Manis (Varian 1)", 50);
        pesanan.put("Roti Manis (Varian 2)", 100);
        pesanan.put("Roti Manis (Varian 3)", 70);
        pesanan.put("Roti Tawar (Varian 1)", 20);
        pesanan.put("Roti Tawar (Varian 2)", 15);
        pesanan.put("Pizza (Varian 1)", 10);
    }

    public int hargaPesanan() {
        int totalHarga = 0;
        for (int harga : pesanan.values()) {
            totalHarga += harga;
        }
        return totalHarga;
    }
    public void tampilkanHargaPesanan() {
        System.out.println("Total harga pesanan: Rp " + hargaPesanan());
    }
}
