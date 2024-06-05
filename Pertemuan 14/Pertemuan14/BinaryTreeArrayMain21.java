package Pertemuan14;

public class BinaryTreeArrayMain21 {
    public static void main(String[] args) {
        BinaryTreeArray21 bta =new BinaryTreeArray21();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxlast = 6;
        bta.populateData(data, idxlast);
        System.out.print("\ninorder Tranversal : ");
        bta.traverseInOrder(0);
        System.out.print("\n");
    }
}
