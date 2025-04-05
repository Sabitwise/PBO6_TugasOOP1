package PembayaranOnline;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //siti

        Payment Siti = new Payment(3500000, "Credit Card");
        Siti.processPayment("Credit Card");
        Siti.headline();
        Siti.display();
        Siti.boundaries();
        //ciciripi
        Payment Ciciripi = new Payment (10000000, "Voucher");
        Ciciripi.processPayment("Voucher", 0.15);
        Ciciripi.headline();
        Ciciripi.display();
        Ciciripi.boundaries();
        //asnawi
        Payment Asnawi = new Payment (1200000, "Transfer Bank");
        Asnawi.processPayment("Transfer Bank");
        Asnawi.headline();
        Asnawi.display();
        Asnawi.boundaries();


    }
}
