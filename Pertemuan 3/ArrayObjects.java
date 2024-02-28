import java.util.Scanner;

public class ArrayObjects {

    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        ArrayObjects[] ppArray = new ArrayObjects[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new ArrayObjects();
            System.out.println("persegi panjang ke-" + i);
            System.out.print("masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
