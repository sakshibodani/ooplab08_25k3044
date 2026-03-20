//task 1 lab 08 25k-3044
public interface Payment {
    void processPayment();
}
 class CreditCard implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Payment done using Credit Card. Receive your bill ");
    }
}
class PayPal implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Payment done using PayPal Receive your receipt ");
    }
}
class BankTransfer implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment done using bank Transfer. Receive your cheque");
    }
}
class ecommerce{
    public static void main(String[] args){
       Payment card= new CreditCard();
       card.processPayment();
       Payment paypal= new PayPal();
       paypal.processPayment();
       Payment bank= new BankTransfer();
       bank.processPayment();

    }
}