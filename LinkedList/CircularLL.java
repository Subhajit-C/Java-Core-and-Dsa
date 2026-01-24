public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }





    // insert at beginning
    public void insertBegin(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;
    }




    //insert at a particular index
    public void insert(int val, int index) {
        Node node = new Node(val);

        if (index == 0) {
            insertBegin(val);
            return;
        }

        Node temp = head;
        int i = 0;

        // Traverse to the node before the target index
        while (i < index - 1) {
            temp = temp.next;
            i++;
            // If we looped full circle before reaching index, it's out of bounds
            if (temp == head) {
                System.out.println("Index out of bounds");
                return;
            }
        }

        node.next = temp.next;
        temp.next = node;

        // If inserting after tail, update tail
        if (temp == tail) {
            tail = node;
       }
    }   







    //delete the node containing val
    public void delete(int val) {
        if (head == null) return;

        if (head.value == val) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        Node temp = head;
        do {
            Node nextNode = temp.next;
            if (nextNode.value == val) {
                if (nextNode == tail) {
                    tail = temp;
                }
                temp.next = nextNode.next;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }






    //display
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
    }






    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }





    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertBegin(3);
        list.insertBegin(2);
        list.insertBegin(1);
        list.insertBegin(8);
        list.display();

        list.delete(1);
        list.display();

        list.delete(8);
        list.display();

        list.insert(5, 1);  // Insert value 5 at index 2
        list.display();

    }
}
