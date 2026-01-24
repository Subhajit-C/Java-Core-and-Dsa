public class GCD {
    private static Node head;
    private Node tail;

    private int size;
    //condtructor for size
    public GCD() {
    this.size = 0;
    }


    


    //insert at the beginning 
    public void insertbegin(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }

        size+=1;
    }




    //insert at last
    public void insertlast(int val){
        if(tail == null){
            insertbegin(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }




    //insert at any index
    public void insert(int val, int index){
        if(index == 0){
            insertbegin(val);
            return;
        }

        if(index == size){
            insertlast(val);
            return;
        }
        
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    } 




    //delete at the beginning
    public int deletefirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }





    //delete at the end
    public int deleteLast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;

    }





    //delete element at a particular index
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }

        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }





    //find the node with the value 
    public Node find(int val){
        Node node = head;
        while (node != null) {
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }





    //to get the node at the particular index
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        } 
        return node;
    }





    //reversing a linked list
    
    public static void reverse(Node node) {
        // base case: last node becomes the new head
        if (node.next == null) {
            head = node;
            return;
        }

        reverse(node.next);         // Recurse to the end

        node.next.next = node;      // Reverse the pointer
        node.next = null;           // Break the old link
    }



    public void repeat(){
        if(head==null){
            return;
        }

        Node temp = head;
      

        while(temp != null && temp.next != null){
            if(temp.value != temp.next.value){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }



    public void gcdadd(){
        if(head == null || head.next == null){
            return;
        }

        Node current = head;
        while(current != null && current.next != null){
            int a = current.value;
            int b = current.next.value;
            int g = gcd(a,b);

            Node middle = new Node(g);
            middle.next = current.next;
            current.next = middle;

            current = middle.next;

        }
    }






    //insert a new Node in the LL which holds the value of gcd of the neighbouring nodes
    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }







    //display the LL
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }






    //structure of linked list
    private class Node{

        private int value;
        private Node next;

        //constructor for one argument (value)
        public Node(int value){
            this.value = value;
        }

        //constructor for both arguments
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }




    public static void main(String[] args) {
        GCD list = new GCD();
        list.insertbegin(2);
        list.insertlast(10);
        list.insertlast(15);
        list.insertlast(30);
        
        
        list.display();
        list.gcdadd();
        list.display();

    }
}
