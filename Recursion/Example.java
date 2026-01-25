package Recursion;

public class Example {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("1");
        message1();
    }
    static void message1(){
        System.out.println("2");
        message2();
    }
    static void message2(){
        System.out.println("3");
        message3();
    }
    static void message3(){
        System.out.println("4");
        message4();
    }
    static void message4(){
        System.out.println("5");
    }
}
