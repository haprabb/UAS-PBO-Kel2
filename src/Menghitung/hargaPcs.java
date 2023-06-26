package Menghitung;

public class hargaPcs {
    // Menghitung harga jual per pcs roti
    double hargaJualRotiManis = (totalModal / (orderRotiManisVarian1 +
            orderRotiManisVarian2 + orderRotiManisVarian3)) * 1.4;
    double hargaJualRotiTawar = (totalModal / (orderRotiTawarVarian1 +
            orderRotiTawarVarian2)) * 1.4;
    double hargaJualPizza = (totalModal / orderPizzaVarian1) * 1.4;

}
