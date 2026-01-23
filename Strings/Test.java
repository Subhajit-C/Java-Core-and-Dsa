package Strings;

public class Test {
    public static void main(String[] args) {
        String a = "raj";
        String b = "raj";
        System.out.println("is a = b: " + (a==b));  
        //a and b points to the same object in the heap memory. Hence, true.

        String c = new String("Subhajit");
        String d = new String("Subhajit");
        System.out.println("is c = d: " + (c==d));  
        //c and d points to 2 different obj in the memory. Therefore, false

        System.out.println("Is the values of c and d are equal: " + c.equals(d));
        // .equals() method only checks the value of the variable and it does not matter that if the variables are pointing towards the same obj or not.

    }
}
