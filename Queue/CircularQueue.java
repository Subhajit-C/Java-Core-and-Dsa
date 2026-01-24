package Queue;
/* 
public class CircularQueue{
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;






    //constructor
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }





    //constructor
    public CircularQueue(int size){
        this.data = new int[size];
    }






    //function to check if the stack is full or not
    protected boolean isFull(){
        return size == data.length; 
        //the stack will be full if the ptr is at the last index
    }    






    //check if the stack is empty
    private boolean isEmpty(){
        return size == 0;  //initial value of ptr 
    }






    //insert an item in queue
    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }






    //remove item from queue
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }






    //front element in the queue
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        return data[front];
    }






    //display
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }

        int i = front;
        
        do{
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        }
        while(i != end);
        System.out.println("END");
    }






    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);

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

*/
import java.util.*;
public class CircularQueue{
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        static boolean isEmpty(){
            return front==-1 && rear == -1;
        }

        static boolean isFull(){
            return (rear+1)%size == front;
        }

        static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front =0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int r = arr[front];
            //condition if there is one element in the queue
            if(rear==front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
    
            return r;
        }

        static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

        static void print(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int i = front%size;
            do {
                System.out.print(arr[i] + " ");
                i = (i + 1) % size;
            } while (i != (rear + 1) % size);
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue q = new Queue(size);

       
        for (int i = 0; i < size; i++) {
            int n= sc.nextInt();
            if(n==-1){
                break;
            }
            else{
                q.add(n);
            }
        }
        q.print();
        
        System.out.println(q.remove());
        q.print();
        System.out.println(q.peek());

        sc.close();
    }
}



