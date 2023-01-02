public class Palindrome {
    public static boolean isAPalindrome = false;
    public static boolean check(String palindrome) {
        for(int i = 0; i < palindrome.length(); i++) {  
            if(palindrome.charAt(i) == (palindrome.charAt(palindrome.length() - 1) - i)) {
                isAPalindrome = true;
            }
        }
        return isAPalindrome;
    }
    public static void main(String[] args) {
        String palindrome = "aaabaaaa";
        if(check(palindrome)) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
    }
}