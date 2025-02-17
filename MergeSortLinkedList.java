public class MergeSortLinkedList {
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
    
    private Node getMid(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
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
        
        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }
        
        return mergedLL.next;
    }
    
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);
        
        return merge(left, right);
    }
    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);
        
        System.out.println("Original Linked List:");
        list.display();
        
        head = list.mergeSort(head);
        
        System.out.println("Sorted Linked List:");
        list.display();
    }
}
