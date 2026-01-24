package Stack;
//stack using LL
public class StackLL {
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }


        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.val;
        }
    }


    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Top element of the stack is: "+s.peek());

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
