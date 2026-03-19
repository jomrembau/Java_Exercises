import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number for the area you want to calculate.\n");
        System.out.println("1 - Square");
        System.out.println("2 - Rectangle");
        System.out.println("3 - Triangle");
        System.out.println("4 - Circle\n");
        int userChoice = scan.nextInt();
        
        switch (userChoice) {
            case 1:
                System.out.println("What is the length of one side of the square in centimeters?");
                scan.nextLine();
                double side = scan.nextDouble();
                System.out.println("Area of Square: " + areaOfSquare(side) + " square centimeters.");
                break;

            case 2:
                System.out.println("What is the length of the rectangle in centimeters?");
                scan.nextLine();
                double length = scan.nextDouble();
                System.out.println("What is the width of the rectangle in centimeters?");
                double width = scan.nextDouble();
                System.out.println("Area of Rectangle: " + areaOfRectangle(length,width) + " square centimeters.");
                break;

            case 3:
                System.out.println("What is the base in centimeters? ");
                scan.nextLine();
                double base = scan.nextDouble();
                System.out.println("What is the height in centimeters? ");
                double height = scan.nextDouble();
                System.out.println("Area of Triangle: " + areaOfTriangle(base,height) + " square centimeters.");
                break;

            case 4:
                System.out.println("What is the radius in centimeters?");
                scan.nextLine();
                double radius = scan.nextDouble();
                System.out.println("Area of Circle: " + areaOfCircle(radius) + " square centimeters.");
                break;
        
            default:
                System.out.println("Invalid Choice / Number.");
        }


        scan.close();
    } 

    public static double areaOfSquare (double side) {
        return side * side;
    }

    public static double areaOfRectangle (double length, double width) {
        return length *  width;
    }

    public static double areaOfTriangle (double base, double height) {
        return (base * height) / 2;
    }
    
    public static double areaOfCircle (double radius) {
        return Math.round(Math.PI * (radius * radius) * 100.0) / 100.0;
    }
}
