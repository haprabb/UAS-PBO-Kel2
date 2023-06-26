package Menghitung;

import java.util.HashMap;
import java.util.Map;

public class hargaPesanan {
    // Menghitung harga pesanan
    Map<String, Integer> pesanan = new HashMap<>();
      int  pesanan.put("Roti Manis (Varian 1)", 50);
      int  pesanan.put("Roti Manis (Varian 2)", 100);
      int pesanan.put("Roti Manis (Varian 3)", 70);
      int  pesanan.put("Roti Tawar (Varian 1)", 20);
      int  pesanan.put("Roti Tawar (Varian 2)", 15);
      int  pesanan.put("Pizza (Varian 1)", 10);

    int totalHarga = hargaPesanan(pesanan);
    public void hargaPesanan(){
    System.out.println("Total harga pesanan: Rp " + totalHarga");
}
}
}
