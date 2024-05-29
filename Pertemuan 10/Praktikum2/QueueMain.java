package Praktikum2;
import java.util.Scanner;
import Praktikum1.Queue;
public class QueueMain {
    public static void menu() {
        System.out.println(" Pilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kapasitas Queue: ");
        int jumlah = sc.nextInt();
        Nasabah antri = new Nasabah(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.println("Umur: ");
                    int umur = sc.nextInt();
                    System.out.println("Saldo: ");
                    double saldo = sc.nextDouble();
                    
                    Nasabah baru = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.Enqueue(baru);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat +" " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
