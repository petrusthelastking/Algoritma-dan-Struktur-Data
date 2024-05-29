<<<<<<< HEAD
package Tugas2;

public class LinkedList21 {
    node21 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node21 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.println("NIM: " + tmp.data.nim + " Nama: " + tmp.data.nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void enqueue(mhs21 data) {
        node21 ndInput = new node21(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    mhs21 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa dequeue");
            return null;
        }
        mhs21 data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }
}
=======
package Tugas2;

public class LinkedList21 {
    node21 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node21 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.println("NIM: " + tmp.data.nim + " Nama: " + tmp.data.nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void enqueue(mhs21 data) {
        node21 ndInput = new node21(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    mhs21 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa dequeue");
            return null;
        }
        mhs21 data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }
}
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
