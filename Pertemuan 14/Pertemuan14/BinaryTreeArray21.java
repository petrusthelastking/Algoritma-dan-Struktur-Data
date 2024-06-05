package Pertemuan14;

public class BinaryTreeArray21 {
    int [] data;
    int idxlast;

    public BinaryTreeArray21(){
        data = new int[10];
    }
    void populateData(int data[], int idxlast){
        this.data = data;
        this.idxlast = idxlast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart<=idxlast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void add(int data){
        if (idxlast < data) {
            this.data[idxlast] = data;
            idxlast++;
        } else {
            System.out.println("Array is full, cannot add more elements.");
        }
    }

    void traversePreOrder(int idxStart){
        if (idxStart<=idxlast) {
            System.out.print(data[idxStart]+" ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }

    void traversePostOrder(int idxStart){
        if (idxStart<=idxlast) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart]+" ");
        }
    }
}
