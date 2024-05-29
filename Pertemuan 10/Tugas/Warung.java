<<<<<<< HEAD
package Tugas;
import java.util.Scanner;
public class Warung {
    public static void main(String[] args) {
        Queue antrian = new Queue(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di Warung Nasi Ayam Kami!");
            System.out.println("1. Bergabung ke antrian");
            System.out.println("2. Lihat daftar pembeli");
            System.out.println("3. Lihat pembeli di depan");
            System.out.println("4. Lihat pembeli di belakang");
            System.out.println("5. Cari pembeli di antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama anda: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nomor HP anda: ");
                    int noHP = scanner.nextInt();
                    Pembeli pembeli = new Pembeli(nama, noHP);
                    antrian.enqueue(pembeli);
                    System.out.println("Anda berhasil bergabung ke antrian!");
                    break;
                case 2:
                    antrian.daftarPembeli();
                    break;
                case 3:
                    antrian.peek();
                    break;
              case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli yang ingin dicari: ");
                    scanner.nextLine();
                    String cariNama = scanner.nextLine();
                    antrian.peekPosition(cariNama);
                    break;
                case 6:
                    System.out.println("Terima kasih telah mengunjungi Warung Nasi Ayam Kami!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid, silakan coba lagi.");
            }
        }
    }
}
=======
package Tugas;
import java.util.Scanner;
public class Warung {
    public static void main(String[] args) {
        Queue antrian = new Queue(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di Warung Nasi Ayam Kami!");
            System.out.println("1. Bergabung ke antrian");
            System.out.println("2. Lihat daftar pembeli");
            System.out.println("3. Lihat pembeli di depan");
            System.out.println("4. Lihat pembeli di belakang");
            System.out.println("5. Cari pembeli di antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama anda: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nomor HP anda: ");
                    int noHP = scanner.nextInt();
                    Pembeli pembeli = new Pembeli(nama, noHP);
                    antrian.enqueue(pembeli);
                    System.out.println("Anda berhasil bergabung ke antrian!");
                    break;
                case 2:
                    antrian.daftarPembeli();
                    break;
                case 3:
                    antrian.peek();
                    break;
              case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli yang ingin dicari: ");
                    scanner.nextLine();
                    String cariNama = scanner.nextLine();
                    antrian.peekPosition(cariNama);
                    break;
                case 6:
                    System.out.println("Terima kasih telah mengunjungi Warung Nasi Ayam Kami!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid, silakan coba lagi.");
            }
        }
    }
}
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
