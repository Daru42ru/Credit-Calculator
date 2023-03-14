public class CreditPaymentService {
    public int calculate(double percent, int credit) {
        int result;
        int i;
        for (i = 12; i > 36; i = i + 12) {
            System.out.println(i);
        }
        result = (int) (credit * ((percent / i / 100) / (1 - Math.pow(1 + percent / i / 100, -i))));
        return result;
    }
}