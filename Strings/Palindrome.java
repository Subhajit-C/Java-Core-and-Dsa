package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str ="aabbccdccbbaa";
        String a = "a";
        String b = "aa";
        String c = "lsdjf";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
        System.out.println(isPalindrome(c));
    }

    static boolean isPalindrome(String str){
        if (str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for(int i = 0; i<str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end){
                return false;
            }
            
        }

        return true;
    }
}
