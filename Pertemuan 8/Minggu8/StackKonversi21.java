<<<<<<< HEAD
package Minggu8;

public class StackKonversi21 {
    int size;
    int[] tumpukanBiner;
    int top;
    public StackKonversi21(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isfull(){
        return top == size - 1;
    }
    public void push(int data) {
        if (isfull()) {
            System.out.println("Stack penuh");
        }else{
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack kosong");
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
=======
package Minggu8;

public class StackKonversi21 {
    int size;
    int[] tumpukanBiner;
    int top;
    public StackKonversi21(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isfull(){
        return top == size - 1;
    }
    public void push(int data) {
        if (isfull()) {
            System.out.println("Stack penuh");
        }else{
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack kosong");
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
