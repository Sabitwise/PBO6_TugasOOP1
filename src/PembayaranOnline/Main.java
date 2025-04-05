package PembayaranOnline;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //siti's transaction
        Payment Siti = new Payment(3500000, "Credit Card");
        Siti.processPayment("Credit Card");
        Siti.headline();
        Siti.display();
        Siti.boundaries();
        //ciciripi's transaction
        Payment Ciciripi = new Payment (10000000, "Voucher");
        Ciciripi.processPayment("Voucher", 0.15);
        Ciciripi.headline();
        Ciciripi.display();
        Ciciripi.boundaries();
        //asnawi's transaction
        Payment Asnawi = new Payment (1200000, "Transfer Bank");
        Asnawi.processPayment("Transfer Bank");
        Asnawi.headline();
        Asnawi.display();
        Asnawi.boundaries();


    }
}
