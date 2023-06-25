package Menghitung;

public class modal {
    // Menghitung harga modal
    int modalTepungTerigu = hargaTepungTerigu * (totalBeratBahanRotiManis +
            totalBeratBahanRotiTawar + totalBeratBahanPizza);
    int modalGulaPasir = hargaGulaPasir * (totalBeratBahanRotiManis +
            totalBeratBahanRotiTawar + totalBeratBahanPizza);
    int modalButter = hargaButter * (totalBeratBahanRotiManis +
            totalBeratBahanRotiTawar + totalBeratBahanPizza);
    int modalRagi = hargaRagi * (totalBeratBahanRotiManis +
            totalBeratBahanRotiTawar + totalBeratBahanPizza);
    int modalSusuBubuk = hargaSusuBubuk * (totalBeratBahanRotiManis +
            totalBeratBahanRotiTawar + totalBeratBahanPizza);
    int modalSusuCair = hargaSusuCair * (totalBeratBahanRotiManis +
            totalBeratBahanRotiTawar + totalBeratBahanPizza);
    int modalTelur = hargaTelur * (totalBeratBahanRotiManis +
            totalBeratBahanRotiTawar + totalBeratBahanPizza);
    int modalEsBatu = hargaEsBatu * (totalBeratBahanRotiManis +
            totalBeratBahanRotiTawar + totalBeratBahanPizza);

    // Menghitung total modal
    int totalModal = modalTepungTerigu + modalGulaPasir + modalButter +
            modalRagi + modalSusuBubuk + modalSusuCair + modalTelur + modalEsBatu;
}
