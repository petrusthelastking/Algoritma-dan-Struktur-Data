package Daftarfilm;

public class DoubleLinkedLists21 {
    Node21 head;
    int size;

    public DoubleLinkedLists21() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String title, double rating) {
        if (isEmpty()) {
            head = new Node21(id, title, rating, null, null);
        } else {
            Node21 newNode = new Node21(id, title, rating, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String title, double rating) {
        if (isEmpty()) {
            addFirst(id, title, rating);
        } else {
            Node21 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node21 newNode = new Node21(id, title, rating, current, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int id, String title, double rating, int index) {
        if (index < 0 || index > size) {
            System.out.println("Nilai indeks di luar batas");
            return;
        } else if (isEmpty() || index == 0) {
            addFirst(id, title, rating);
        } else {
            Node21 current = head;
            int i = 0;
            while (i < index && current.next != null) {
                current = current.next;
                i++;
            }
            if (i == index) {
                Node21 newNode = new Node21(id, title, rating, current.prev, current);
                if (current.prev != null) {
                    current.prev.next = newNode;
                }
                current.prev = newNode;
                if (index == 0) {
                    head = newNode;
                }
                size++;
            } else {
                addLast(id, title, rating);
            }
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node21 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void remove(int index) {
        if (isEmpty() || index >= size) {
            System.out.println("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node21 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current.next.prev = null;
                head = current.next;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Node21 searchById(int id) {
        Node21 current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void sortDescendingByRating() {
        if (size > 1) {
            boolean wasChanged;
            do {
                Node21 current = head;
                Node21 previous = null;
                Node21 next = head.next;
                wasChanged = false;
                while (next != null) {
                    if (current.rating < next.rating) {
                        wasChanged = true;
                        if (previous != null) {
                            Node21 sig = next.next;
                            previous.next = next;
                            next.next = current;
                            current.next = sig;
                        } else {
                            Node21 sig = next.next;
                            head = next;
                            next.next = current;
                            current.next = sig;
                        }
                        Node21 temp = current;
                        current = next;
                        next = temp;
                    }
                    previous = current;
                    current = next;
                    next = next.next;
                }
            } while (wasChanged);
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node21 tmp = head;
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Film bioskop mumpbai");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("|ID\t|Judul\t|Rating");
            System.out.println("+-------------------------------------+");
            while (tmp != null) {
                System.out.println("|" + tmp.id + "\t|" + tmp.title + "\t|" + tmp.rating);
                tmp = tmp.next;
            }
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}

