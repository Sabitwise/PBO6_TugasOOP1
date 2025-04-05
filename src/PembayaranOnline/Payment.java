package PembayaranOnline;

public class Payment {
    double totalPrice;
    String paymentMethod;
    boolean paymentStatus;

    //constructor
    public Payment(double totalPrice, String paymentMethod) {
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = false;
    }

    public void processPayment(String paymentMethod){
        this.paymentMethod = paymentMethod;
        if(paymentMethod.equals("Credit Card") || paymentMethod.equals("Transfer Bank")){
            this.paymentStatus = true;
        }else{
            this.paymentStatus = false;
        }
    }

    public double processPayment(String paymentMethod, double discount){
        if(paymentMethod.equals("Voucher")){
            this.totalPrice = this.totalPrice - (this.totalPrice * discount);
            this.paymentStatus = true;
        }
        return this.totalPrice;
    }

   public void display(){
       System.out.println("Total Price : Rp."+totalPrice);
       System.out.println("Payment Method : "+paymentMethod);
       if(paymentStatus = true){
           System.out.println("Payment Status is successful by "+paymentMethod);
       }else{
           System.out.println("Payment status is not successful");
       }
   }

   public void headline(){
       System.out.println("===============Payment Details===============");
   }

   public void boundaries(){
       System.out.println("=============================================");
   }

}
