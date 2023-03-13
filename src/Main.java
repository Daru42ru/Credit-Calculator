public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int a = 12;
        int b = 24;
        int c = 36;
        int p = service.calculate(a, b, c);
        System.out.println(p);
        int pa = service.calculate(a, b, c);
        System.out.println(pa);
        int pay = service.calculate(a, b, c);
        System.out.println(pay);
    }
}