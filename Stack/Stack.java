package Stack;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

  


    //pointer
    int ptr = -1;




    //constructor
    public Stack(){
        this(DEFAULT_SIZE);
    }




    //constructor
    public Stack(int size){
        this.data = new int[size];
    }





    //function to check if the stack is full or not
    protected boolean isFull(){
        return ptr == data.length-1; 
        //the stack will be full if the ptr is at the last index
    }    




    //check if the stack is empty
    boolean isEmpty(){
        return ptr == -1;  //initial value of ptr 
    }





    //insert an item
    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }




    //remove an item
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack.");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }




    //return item at the top
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack.");
        }

        return data[ptr];
    }






    //main function
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(5);

        stack.push(34);
        stack.push(4);
        stack.push(75);
        stack.push(36);
        stack.push(97);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());   //will give exception because the stack became empty 

        System.out.println("The top element in the stack: " + stack.peek());


        
    }

    

}
