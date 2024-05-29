<<<<<<< HEAD
import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        double tugas, kuis, uts, uas, nilaiAkhir;
        char nilaiHuruf;
        String keterangan;

        // Input nilai
        System.out.print("Masukkan nilai tugas: ");
        tugas = scanner.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        kuis = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = scanner.nextDouble();

        // Validasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        // Menghitung nilai akhir
        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

        // Konversi nilai akhir ke nilai huruf
        if (nilaiAkhir >= 80) {
            nilaiHuruf = 'A';
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = 'B+';
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = 'B';
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = 'C+';
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = 'C';
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = 'D';
        } else {
            nilaiHuruf = 'E';
        }

        // Menentukan keterangan lulus/tidak lulus
        if (nilaiHuruf == 'A' || nilaiHuruf == 'B+' || nilaiHuruf == 'B' || nilaiHuruf == 'C+' || nilaiHuruf == 'C') {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        // Output hasil
        System.out.println("Nilai akhir: " + String.valueOf(nilaiAkhir));
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
        
    }
}
=======
import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        double tugas, kuis, uts, uas, nilaiAkhir;
        char nilaiHuruf;
        String keterangan;

        // Input nilai
        System.out.print("Masukkan nilai tugas: ");
        tugas = scanner.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        kuis = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = scanner.nextDouble();

        // Validasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        // Menghitung nilai akhir
        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

        // Konversi nilai akhir ke nilai huruf
        if (nilaiAkhir >= 80) {
            nilaiHuruf = 'A';
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = 'B+';
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = 'B';
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = 'C+';
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = 'C';
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = 'D';
        } else {
            nilaiHuruf = 'E';
        }

        // Menentukan keterangan lulus/tidak lulus
        if (nilaiHuruf == 'A' || nilaiHuruf == 'B+' || nilaiHuruf == 'B' || nilaiHuruf == 'C+' || nilaiHuruf == 'C') {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        // Output hasil
        System.out.println("Nilai akhir: " + String.valueOf(nilaiAkhir));
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
        
    }
}
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
