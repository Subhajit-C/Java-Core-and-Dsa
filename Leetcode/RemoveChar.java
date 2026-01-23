package Leetcode;

public class RemoveChar {
    
    /* 
    public static void main(String[] args) {
        String s = "baccad";
        remove("", s);

    }

    static void remove(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        
        if (ch== 'a'){
            remove(p, up.substring(1));
        }
        else{
            remove(p+ch, up.substring(1));
        }
    }

    */


    public static void main(String[] args) {
        String s = "baccad";
        System.out.println(remove(s));
    }

    static String remove(String up){

        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        
        if (ch== 'a'){
            return remove(up.substring(1));
        }
        else{
            return ch + remove(up.substring(1));
        }
    }

}
