package PERTEMUAN15;

public class DoubleLinkedLists {
    private Node head;
    private int size;

    private class Node {
        int data;
        int jarak; // Added this field based on the image
        Node prev, next;

        Node(Node prev, int data, int jarak, Node next) {
            this.prev = prev;
            this.data = data;
            this.jarak = jarak; // Initialize jarak
            this.next = next;
        }
    }

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Updated addFirst method
    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node(null, item, jarak, null);
        } else {
            Node newNode = new Node(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item, 0); // Assuming jarak = 0 for simplicity, adjust as needed
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, 0, null); // Assuming jarak = 0, adjust as needed
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            addFirst(item, 0); // Assuming jarak = 0, adjust as needed
        } else if (index == size) {
            addLast(item);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node newNode = new Node(current.prev, item, 0, current); // Assuming jarak = 0, adjust as needed
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked List Masih Kosong, Tidak dapat dihapus");
        } else if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void remove(int data) { // Modified to remove by data instead of index
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }
    
    public int getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked List Kosong, tidak dapat diambil!");
        }
        return head.data;
    }

    public int getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) {
        if (isEmpty() || index >= size) {
            throw new IndexOutOfBoundsException("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // Added getJarak method
    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    // Added getHead method
    public Node getHead() {
        return head;
    }

    public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
        Node current = head;
        while (current != null) {
            if (current.data == tujuan) {
                current.jarak = jarak;
                break;
            }
            current = current.next;
        }
    }
}