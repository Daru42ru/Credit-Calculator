public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 9.99;
        int credit = 1_000_000;
        int paymentOne = service.calculate(percent, credit);
        System.out.println(paymentOne);
        int paymentTwo = service.calculate(percent, credit);
        System.out.println(paymentTwo);
        int paymentThree = service.calculate(percent, credit);
        System.out.println(paymentThree);
    }
}