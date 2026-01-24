package Queue;

import java.util.Scanner;


public class QueueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail==null;
        }

        //we dont need is full fuction if we implement queue using linked list. because LL is a variable length datastructure
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail==null){
                head = tail = newNode;
                
            }
            
            tail.next = newNode;
            tail = tail.next;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int res = head.data;
            if(head==tail){
                tail = null;
            }
            head = head.next;
            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(n==-1){
                break;   
            }
            else{
                q.add(n);
            }
        }

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
