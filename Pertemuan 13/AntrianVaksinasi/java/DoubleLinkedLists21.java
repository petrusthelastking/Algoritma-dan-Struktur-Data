package AntrianVaksinasi.java;
import java.io.EOFException;
import java.util.NoSuchElementException;
public class DoubleLinkedLists21 {
    Node21 head;
    int size;

    public DoubleLinkedLists21(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void Enqueue(Datapas21 item){
        if (isEmpty()) {
            head = new Node21(null, item, null);
        } else {
            Node21 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node21 newNode21 = new Node21(current, item, null);
            current.next = newNode21;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void print(){
        if (!isEmpty()) {
            Node21 tmp = head;
            System.out.println("|No.            |Nama               |");
            while (tmp != null) {
                System.out.printf("|%-15d|%-20s|\n", tmp.data.noAntri, tmp.data.nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    public void Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih Kosong tidak dapat dihapus");
        } else if (size == 1) {
            System.out.println(head.data.nama + " telah selesai divaksinasi");
            head = null;
            size--;
        } else {
            System.out.println(head.data.nama + " telah selesai divaksinasi");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}

