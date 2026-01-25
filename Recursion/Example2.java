package Recursion;

public class Example2 {
    public static void main(String[] args) {
        print(1);;
    }
    static void print(int n){

        //base condition: need to add a base condition to stop the recusion otherwise it will keep on calling itself and will not stop.
        //base condition will give a stop to recursion.
        if (n==10){
            System.out.println(10);
            return;
        }


        System.out.println(n);
        print(n+1);
    }
}
