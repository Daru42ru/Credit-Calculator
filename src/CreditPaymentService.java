public class CreditPaymentService {
    public int calculate(int oneYear, double percent, int credit) {
        int result;
        result = (int) (credit * ((percent / oneYear / 100) / (1 - Math.pow(1 + percent / oneYear / 100, -oneYear))));
        return result;
    }
}