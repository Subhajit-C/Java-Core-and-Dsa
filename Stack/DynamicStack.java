package Stack;

public class DynamicStack extends Stack {
    public DynamicStack(){
        super();        //it will call Stack()
    }




    public DynamicStack(int size){
        super(size);       //it will call Stack(int size)
    }




    public boolean push(int item){
        //this takes care of it being full
        if(this.isFull()){
            //double the array size
            int [] temp = new int[data.length*2];

            //copy the previous items in new data
            for(int i = 0; i<data.length ; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        //at this point we know that array is not full
        //insert item
        return super.push(item);
    }



    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);

        stack.push(34);
        stack.push(4);
        stack.push(75);
        stack.push(36);
        stack.push(97);
        stack.push(234);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());   //will give exception because the stack became empty 

        // System.out.println("The top element in the stack: " + stack.peek());
    }

}
