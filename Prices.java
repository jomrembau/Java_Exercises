import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        
        double[][] prices = new double[3][5];

        prices[0][0] = 12.99;
        prices[0][1] = 8.99;
        prices[0][2] = 9.99;
        prices[0][3] = 10.49;
        prices[0][4] = 11.99;

        prices[1][0] = 0.99;
        prices[1][1] = 1.99;
        prices[1][2] = 2.49;
        prices[1][3] = 1.49;
        prices[1][4] = 2.99;

        prices[2][0] = 8.99;
        prices[2][1] = 7.99;
        prices[2][2] = 9.49;
        prices[2][3] = 9.99;
        prices[2][4] = 10.99;
        

        for (int i = 0; i < prices.length; i++) {

            switch (i) {
                case 0:
                    System.out.print("\tBaking: ");
                    break;
                
                case 1:
                    System.out.print("\tBeverage: ");
                    break;
                
                case 2:
                    System.out.print("\tCereals ");
                    break;
            
                default:
                    break;
            }
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}
