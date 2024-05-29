import java.util.Scanner;

public class ArrayObjects {

    public int panjang;
    public int lebar;

    // Konstruktor dengan parameter
    public ArrayObjects(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = sc.nextInt();

        ArrayObjects[] ppArray = new ArrayObjects[length]; // Array 2 dimensi dari objek ArrayObjects

        for (int i = 0; i < length; i++) {
            System.out.println("persegi panjang ke-" + i);
            System.out.print("masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();

            ppArray[i] = new ArrayObjects(panjang, lebar);
        }

        for (int i = 0; i < length; i++) {
            System.out.println("persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
