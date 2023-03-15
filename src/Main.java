public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int oneYear = 12;
        double percent = 9.99;
        int credit = 1_000_000;
        int paymentOne = service.calculate(oneYear, percent, credit);
        System.out.println(paymentOne);
        System.out.println(service.calculate(24, percent, credit));
        System.out.println(service.calculate(36, percent, credit));
    }
}