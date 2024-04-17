package UTS.java;
import java.util.Scanner;

public class pengurutandanpencarianmain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = {16,26,3,45,38,5,26,22,28,35,10,46,0,8,22,22,47};
        pengurutandanpencarian objek = new pengurutandanpencarian(array);

        System.out.println("Angka-angka sebelum diurutkan: ");
        objek.tampilAll();
        System.out.println();

        System.out.print("Masukkan angka yang dicari: ");
        int cari = sc.nextInt();

        int[] arr = objek.getArray();
        
        int hasil = objek.findBinarySearch(cari, 0, arr.length - 1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        System.out.println();
        System.out.println("Nilai-nilai yang diurutkan secara Ascending: ");
        objek.selectionSort(arr, true);
        objek.tampilAll();
        System.out.println();
        hasil = objek.findBinarySearch(cari, 0, arr.length - 1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        System.out.println();
        System.out.println("Nilai-nilai yang diurutkan secara Descending: ");
        objek.selectionSort(arr, false);
        objek.tampilAll();
        System.out.println();
        hasil = objek.findBinarySearch(cari, 0, arr.length - 1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        System.out.println();
        System.out.print("Masukkan Angka Lain: ");
        cari = sc.nextInt();

        System.out.println("Pencarian secara Ascending: ");
        objek.selectionSort(arr, true);
        hasil = objek.findBinarySearch(cari, 0, arr.length - 1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        System.out.println("Pencarian secara Descending: ");
        objek.selectionSort(arr, false);
        hasil = objek.findBinarySearch(cari, 0, arr.length - 1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }
    }
}