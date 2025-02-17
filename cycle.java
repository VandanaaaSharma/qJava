public class cycle {
    class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
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
    public boolean cyclell(){
        Node slow=head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast = fast.next.next;
        if(slow==fast){
            return true;
        }
        }
        return false;

    }
    public void createCycle(int pos) {
        if (pos == -1) return;
        Node temp = head;
        Node cycleNode = null;
        int count = 0;
        while (temp.next != null) {
            if (count == pos) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = cycleNode;
    }
    
    public static void main(String[] args) {
        cycle list = new cycle();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.createCycle(2); // Creating a cycle at index 2
        
        if (list.cyclell()) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}

    

