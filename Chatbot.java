import java.util.Scanner;

class Chatbot {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHello, What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHi, " + name + "! I'm Javabot. Where are you from?");
        String origin = scan.nextLine();

        System.out.println("\nI hear it is beautiful in " +origin+"! I'm from a place called Oracle.");
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        
        System.out.println("\nSo your're " + age + ". Cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / age)+ " older than you.");
        System.out.println("\nEnought about me. What are you learning right now?");
        scan.nextLine();
        String learning = scan.nextLine();

        System.out.println("\n" + learning.substring(0,1).toUpperCase() + 
        learning.substring(1).toLowerCase() + ", That's Great! Nice Chatting with you " + name + ". Bye!");

        scan.close();

    }
}
