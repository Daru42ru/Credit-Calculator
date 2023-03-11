public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double index = 9.99;
        int percent = (int) index;
        int payment = service.calculate(credit, index);
        System.out.println(payment);
    }
}