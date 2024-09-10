class Node {
    String val;
    Node prev;
    Node next;

    Node(String val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class BrowserHistory {

    Node dummy;
    Node curr;
    Node tail;

    public BrowserHistory(String homepage) {
        dummy = new Node(homepage);
        curr = tail = dummy;
    }
    
    public void visit(String url) {
        Node newPage = new Node(url);
        curr.next = newPage;
        newPage.prev = curr;
        curr = newPage;
        if (newPage.next == null) {
            tail = newPage;
        }
    }
    
    public String back(int steps) {
        if (curr.prev == null) return curr.val;
        
        while (curr.prev != null && steps != 0) {
            curr = curr.prev;
            steps--;
        }

        return curr.val;
    }
    
    public String forward(int steps) {
        if (curr.next == null) return curr.val;
        
        while (curr.next != null && steps != 0) {
            curr = curr.next;
            steps--;
        }

        return curr.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */