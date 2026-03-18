public class Tip {
    public static void main(String[] args) {
        System.out.println(tipTheWaiter(65.00, .15));
    }
    public static double tipTheWaiter(double bill, double tip){
        return bill*tip;
    }
}
