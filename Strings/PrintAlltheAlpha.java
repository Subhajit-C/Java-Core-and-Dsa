package Strings;

public class PrintAlltheAlpha {
    public static void main(String[] args) {
        
        /* 
        String series = "" ;
        for (int i = 0; i<26; i++){
            char ch = (char)('a'+i);
            series += ch;
        }
        System.out.println(series);
        */
        //this is not efficient because for every loop it is making a new object. so space complexity increases

        StringBuilder series2 = new StringBuilder() ;
        for (int i = 0; i<26; i++){
            char ch = (char)('a'+i);
            series2.append(ch);
        }
        System.out.println(series2);
        
        series2.deleteCharAt(0); 
        System.out.println(series2);

        series2.reverse();
        System.out.println(series2);

    }
} 
