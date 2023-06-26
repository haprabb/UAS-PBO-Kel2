package Menghitung;
import Menghitung.modal;
import MainClass.mainClass;
public class hargaPcs {

    modal modalRotManis = new modal();
    public double totalModal;
    public double orderRotiManisVarian1;
    public double orderRotiManisVarian2;
    public double orderRotiManisVarian3;
    public double orderRotiTawarVarian1;
    public double orderRotiTawarVarian2;
    public double orderPizzaVarian1;

    // Menghitung harga jual per pcs roti
    double hargaJualRotiManis = (modal.modalRotiManis() / (orderRotiManisVarian1 +
            orderRotiManisVarian2 + orderRotiManisVarian3)) * 1.4;
    double hargaJualRotiTawar = (modal.modalRotitawar() / (orderRotiTawarVarian1 +
            orderRotiTawarVarian2)) * 1.4;
    double hargaJualPizza = (modal.modalPizza() / orderPizzaVarian1) * 1.4;

}
