public class CreditPaymentService {
    public int calculate(int a, int b, int c) {
        int result;
        double percent = 9.99;
        int credit = 1_000_000;
        result = (int) (credit * ((percent / a / 100) / (1 - Math.pow(1 + percent/ a / 100, -a))));
        result = (int) (credit * ((percent / b / 100) / (1 - Math.pow(1 + percent / b / 100, -b))));
        result = (int) (credit * ((percent / c / 100) / (1 - Math.pow(1 + percent/ c / 100, -c))));
        return result;
    }
}


