public class IsItaDigit {
    public static void main(String[] args) {
        System.out.println(isDigit("A1Z"));
    }

    public static boolean isDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            } 
        }
        return false; 
    }
}
