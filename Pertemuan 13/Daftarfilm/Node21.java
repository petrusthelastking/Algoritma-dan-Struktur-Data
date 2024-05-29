package Daftarfilm;

public class Node21 {
    int id;
    String title;
    double rating;
    Node21 prev;
    Node21 next;

    public Node21(int id, String title, double rating, Node21 prev, Node21 next) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.prev = prev;
        this.next = next;
    }
}