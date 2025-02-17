public class merge2list {
    class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node mergeSortedLists(Node head1, Node head2) {
        Node dummy = new Node(-1); // Temporary dummy node
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        return dummy.next; // Returning the merged sorted list
    }

    // Utility function to print the linked list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Function to add nodes to a linked list
    public Node addNodes(int[] arr) {
        Node head = null, tail = null;
        for (int num : arr) {
            Node newNode = new Node(num);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        merge2list list = new merge2list();

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        Node head1 = list.addNodes(arr1);
        Node head2 = list.addNodes(arr2);

        System.out.println("List 1:");
        list.printList(head1);

        System.out.println("List 2:");
        list.printList(head2);

        Node mergedHead = list.mergeSortedLists(head1, head2);

        System.out.println("Merged Sorted List:");
        list.printList(mergedHead);
    }
}
