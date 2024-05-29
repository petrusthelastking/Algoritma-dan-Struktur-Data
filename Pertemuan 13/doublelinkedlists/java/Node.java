package doublelinkedlists.java;

public class Node {
    int data;
    Node prev, next;

    // Constructor for Node
    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}
