public class Tip {
    public static void main(String[] args) {
        tipTheWaiter(65.00, .15);
    }
    public static void tipTheWaiter(double bill, double tip){
        System.out.println("Your service was wonderful! Please, accept this tip: $" + (bill * tip));
    }
}
