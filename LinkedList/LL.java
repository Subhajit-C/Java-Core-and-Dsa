public class LL {

    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public LL() {
        this.size = 0;
    }

    // Insert at beginning
    public void insertBegin(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at last
    public void insertLast(int val) {
        if (tail == null) {
            insertBegin(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at any index
    public void insert(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            insertBegin(val);
            return;
        }

        if (index == size) {
            insertLast(val);
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

    // Delete first node
    public int deleteFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int val = head.value;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return val;
    }

    // Delete last node
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    // Delete at index
    public int delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    // Find node with value
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Get node at index
    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Reverse the linked list (RECURSIVE)
    public void reverse() {
        head = reverseRec(head);
    }

    private Node reverseRec(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node newHead = reverseRec(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Node structure
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Main method
    public static void main(String[] args) {
        LL list = new LL();

        list.insertBegin(3);
        list.insertBegin(2);
        list.insertBegin(1);
        list.insertBegin(8);
        list.insertLast(99);
        list.insert(77, 3);

        list.display();

        System.out.println("Deleted first: " + list.deleteFirst());
        list.display();

        System.out.println("Deleted last: " + list.deleteLast());
        list.display();

        System.out.println("Deleted at index 2: " + list.delete(2));
        list.display();

        System.out.print("Reversed LL: ");
        list.reverse();
        list.display();
    }
}
