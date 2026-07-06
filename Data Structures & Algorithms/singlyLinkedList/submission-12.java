class LinkedList {

    class Node {
        int val;
        Node next;

        Node(int value) {
            val = value;
            next = null;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        Node curr = head;
        for (int i = 0; curr != null; i++) {
            if (i == index) {
                return curr.val;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
    }

    public void insertTail(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(val);
    }

    public boolean remove(int index) {
        if (head == null) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            return true;
        }
        
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            if (curr.next == null) {
                return false;
            }
            curr = curr.next;
        }
        if (curr.next == null) {
            return false;
        }
        curr.next = curr.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        return arr;
    }
}
