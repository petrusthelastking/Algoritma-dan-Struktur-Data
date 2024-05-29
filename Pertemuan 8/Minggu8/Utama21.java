package Minggu8;
import java.util.Scanner;
import java.util.Scanner;

public class Utama21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kapasitas Gudang: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();

        Gudang21 gudang = new Gudang21(kapasitas);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Nama Kategori: ");
                    String kategori = scanner.nextLine();
                    Barang21 barangbaru = new Barang21(kode, nama, kategori);
                    gudang.tambahBarang(barangbaru);
                    break;
                case 2:
                    gudang.ambilbarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    Barang21 barangTeratas = gudang.lihatBarangTeratas();
                    if (barangTeratas != null) {
                        System.out.println("Barang Teratas: " + barangTeratas.nama);
                    } else {
                        System.out.println("Gudang kosong, tidak ada barang.");
                    }
                    break;
                case 5:
                    Barang21 barangTerbawah = gudang.lihatBarangTerbawah();
                    if (barangTerbawah != null) {
                        System.out.println("Barang Terbawah: " + barangTerbawah.nama);
                    } else {
                        System.out.println("Gudang kosong, tidak ada barang.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan Kode Barang atau Nama Barang: ");
                    String input = scanner.nextLine();
                    try {
                        int kodeCari = Integer.parseInt(input);
                        gudang.cariBarang(kodeCari, "");
                    } catch (NumberFormatException e) {
                        gudang.cariBarang(0, input);
                    }
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak Valid. Silakan coba lagi");
            }
        }
    }
}

