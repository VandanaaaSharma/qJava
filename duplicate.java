public class duplicate {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove duplicates from an unsorted linked list
    static Node removeDuplicate(Node head) {
        Node curr1 = head;
        while (curr1 != null) {
            Node curr2 = curr1;
            while (curr2.next != null) {
                if (curr2.next.data == curr1.data) {
                    curr2.next = curr2.next.next; // Remove duplicate node
                } else {
                    curr2 = curr2.next;
                }
            }
            curr1 = curr1.next;
        }
        return head;
    }

    // Function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        duplicate list = new duplicate();

        // Adding duplicate elements to the linked list
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        System.out.println("Original List:");
        list.printList(head);

        head = removeDuplicate(head);

        System.out.println("List after removing duplicates:");
        list.printList(head);
    }
}
