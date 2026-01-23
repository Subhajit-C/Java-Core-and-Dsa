import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);





//switch case
        /* 
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits.");
                break;            
                //It is very important to include break as it will stop the flow of switch if the condition satisfies the case. Otherwise the code will run for all the case unless a break statement is encountered.

            case "Apple":
                System.out.println("A sweet red fruit.");
                break;
            
            case "Orange":
                System.out.println("Vitamin C");
                break;
            
            default:
                System.out.println("Please enter a valid fruit.");
            
            //duplicate cases are not allowed. It will give me an erro
        }
         */
        





//This is enhanced switch case
        /* 
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }

        */



        /* 
        String day = in.next();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekdays");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;         

        }
         */



         /* 

        int day = in.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("weekdays");
        
            case 6,7 -> System.out.println("weekend");

            default -> System.out.println("Enter nos. form 1 to 7");
        }
        */




//nested switch
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Subhajit Chakraborty");
            case 2 -> System.out.println("Sudhish Tiwari");
            case 3 -> {
                System.out.println("Tanmay Sahare");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department");
                }
            }   
            default -> System.out.println("Enter correct empID");
        
        }

        in.close();

    }

}
