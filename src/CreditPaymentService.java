public class CreditPaymentService {
    public int calculate(int credit, double index) {
        int result;
        result = (int) (credit * ((index / 12 / 100) / (1 - Math.pow (1 + index / 12 / 100, -12))));
        return result;
        }
}

