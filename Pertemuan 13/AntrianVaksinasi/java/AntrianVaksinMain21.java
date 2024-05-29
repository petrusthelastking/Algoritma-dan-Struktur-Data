package AntrianVaksinasi.java;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class AntrianVaksinMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists21 data = new DoubleLinkedLists21();

        try {
            while (true) {
                System.out.println("+++++++++++++++++++++++++++++++++");
                System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
                System.out.println("+++++++++++++++++++++++++++++++++");
                System.out.println("1. Tambah Data Penerima vaksin");
                System.out.println("2. Hapus Data Pengantri vaksin");
                System.out.println("3. Daftar Penerima Vaksin");
                System.out.println("4. Keluar");
                System.out.println("++++++++++++++++++++++++++++++++++++");
                System.out.print("Pilih Menu: ");
                int menu = sc.nextInt();
                sc.nextLine(); // consume the newline character
                switch (menu) {
                    case 1:
                        System.out.print("Nomor Antrian: ");
                        int noAntri = sc.nextInt();
                        sc.nextLine(); // consume the newline character
                        System.out.print("Nama Penerima: ");
                        String nama = sc.nextLine();
                        Datapas21 tempPenerima = new Datapas21(noAntri, nama);
                        data.Enqueue(tempPenerima);
                        break;
                    case 2:
                        data.Dequeue();
                        break;
                    case 3:
                        System.out.println("++++++++++++++++++++++++++");
                        System.out.println("Daftar Pengantri Vaksin");
                        System.out.println("+++++++++++++++++++++++++++");
                        data.print();
                        System.out.println("Sisa Antrian: " + data.size());
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan Salah!!!");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
