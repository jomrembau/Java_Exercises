import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        
        int[][] numbersTable = new int[50][50];
            
        for (int i = 0; i < numbersTable.length ; i++ ) {
            for (int j = 0; j < numbersTable[i].length ; j++) {
                numbersTable[i][j] = randomInteger();
            } 
        }

        for (int x = 0; x < numbersTable.length; x++) {
            System.out.println(Arrays.toString(numbersTable[x]));
        }

    }
    public static int randomInteger () {
        double value = Math.random();
        return (int)(value * 100)+ 1;
    }
}
