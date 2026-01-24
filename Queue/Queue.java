package Queue;

public class Queue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

  



    //pointer
    int end = 0;





    //constructor
    public Queue(){
        this(DEFAULT_SIZE);
    }





    //constructor
    public Queue(int size){
        this.data = new int[size];
    }






    //function to check if the stack is full or not
    private boolean isFull(){
        return end == data.length; 
        //the stack will be full if the ptr is at the last index
    }    






    //check if the stack is empty
    private boolean isEmpty(){
        return end == -1;  //initial value of ptr 
    }






    //insert an item in queue
    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        return true;
    }






    //remove item from queue
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        //shift the elements to left
        for(int i = 1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;

        return removed;
    }






    //front element in the queue
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        return data[0];
    }






    //display
    public void display(){
        for(int i = 0; i<end ; i++){
            System.out.print(data[i] + " <- ");
        }

        System.out.println("END");
    }






    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(5);

        queue.insert(43);
        queue.insert(75);
        queue.insert(4);
        queue.insert(34);
        queue.insert(77);


        queue.display();


        System.out.println(queue.remove());


        queue.display();
    }

}
