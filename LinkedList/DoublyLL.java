public class DoublyLL {

    private Node head;
    




    //insert at the beginning
    public void insertbegin(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        
        if(head!=null){
            head.prev = node;
        }

        head = node;
    }






    //insert at the last 
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        //condition if the DLL is empty
        if(head == null){
            head.prev = null;
            head = node;
        }

        //traversing the last node to the end of the list
        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.next = null;
        node.prev = last;
    }






    //insert anywhere
    public void insert(int val, int index){
        if(index == 0){
            insertbegin(val);
            return;
        }

        Node temp = head;
        int i = 0;

        while(temp!=null && i<index-1){
            temp = temp.next;
            i++;
        }

        if(temp == null){
            System.out.println("Index out of bound");
            return;
        }

        Node node = new Node(val, temp.next, temp);
        if(temp.next != null){
            temp.next.prev = node;
        }

        temp.next = node;
    }






    //insert after a value
    public void insertAfter(int after, int val){
        Node temp = find(after);

        if(temp == null){
            System.out.println("does not exist");
        }

        Node node = new Node(val);  

        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if (node.next != null){
            node.next.prev = node;
        }
    }
    





    //display the LL
    public void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }





    //display the LL in reverse
    public void displayReverse(){
        Node last = head; //initialize the last node to head, next step is to travese the last node to the last index of the DLL
        while(last!=null && last.next!=null){
            //traversing the last node to the end of the DLL
            last = last.next;  
        }

        System.out.print("Print in reverse: ");

        while (last != null) {
            System.out.print(last.val + " -> ");

            last = last.prev;
        }
        System.out.println("START");
    }





    //find the node with a particular value
    public Node find(int val){
        Node node = head;
        while (node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;

    }





    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }




    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertbegin(3);
        list.insertbegin(2);
        list.insertbegin(1);
        list.insertbegin(8);
        list.insertLast(99);
        list.insertLast(56);

        list.display();
        // list.displayReverse();

        list.insert(20, 3);
        list.display();

        list.insertAfter(99, 5);
        list.display();
        // list.displayReverse();
    }

}
