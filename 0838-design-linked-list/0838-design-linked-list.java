class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {

    Node dummy;
    Node tail;
    int size;

    public MyLinkedList() {
        dummy = new Node(-1);
        tail = dummy;
    }
    
    public int get(int index) {
        if (index >= size) return -1;

        Node curr = dummy;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = dummy.next;
        dummy.next = newNode;
        if(newNode.next == null) {
            tail = newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        Node curr = dummy;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (size == 0 || index >= size) return;
        
        Node curr = dummy;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        if (curr.next == tail) {
            curr.next = tail.next;
            tail = curr;
        } else {
            curr.next = curr.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */