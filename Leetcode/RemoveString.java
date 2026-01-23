package Leetcode;

public class RemoveString {
    public static void main(String[] args) {
        String s = "aajk APP mbn APPLE lakjdfl";
        System.out.println(removeAPPLE(s));
        System.out.println(removeAPPnotAPPLE(s));
    }

//remove apple from the string
    static String removeAPPLE(String s){
        if (s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if (s.startsWith("APPLE")){
            return removeAPPLE(s.substring(5));
        }
        else{
            return ch+removeAPPLE(s.substring(1));
        }
    }


//if we want to remove app but not remove app if it is apple
    static String removeAPPnotAPPLE(String s){
        if (s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if (s.startsWith("APP") && !s.startsWith("APPLE")){
            return removeAPPnotAPPLE(s.substring(3));
        }
        else{
            return ch+removeAPPnotAPPLE(s.substring(1));
        }
    }

}
