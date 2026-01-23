package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'a');
        //these are charecters. this will change the charecters to their ASCII values and add them.

        System.out.println("a" + "a");
        //these are strings. this will concatinate the string.

        System.out.println("a" + 2);
        //this is same as: "a" + "2"
        //integer will be automatically converted to string. this will call .toString() method ie Integer.toString() interrnally.

        System.out.println((char)('a'+3));
        //('a'+3) will be converted to ASCII value and then converted to char

        System.out.println(new ArrayList<>());   //empty arraylist
        System.out.println("Raj" + new ArrayList<>());

        // System.out.println(56 + new ArrayList<>());
        //this will give an error. Because,
        //concatination is only defined for primitives or if any one value is a String.

        System.out.println(56 + "raj" + new ArrayList<>());
        //since, one of them is a string the others will also convert to string and concatinate
    }
}
