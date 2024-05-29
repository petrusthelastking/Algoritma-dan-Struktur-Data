import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menginputkan jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        // Menginputkan nama matakuliah, nilai dan SKS setiap mata kuliah
        System.out.println("Masukkan nama matakuliah, nilai dan SKS setiap mata kuliah:");
        String[] namaMK = new String[jumlahMataKuliah];
        String[] nilai = new String[jumlahMataKuliah];
        int[] sks = new int[jumlahMataKuliah];
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Nama Matakuliah ke-" + (i + 1) + ": ");
            namaMK[i] = scanner.next();
            System.out.print("Nilai mata kuliah ke-" + (i + 1) + ": ");
            nilai[i] = scanner.next();
            System.out.print("SKS mata kuliah ke-" + (i + 1) + ": ");
            sks[i] = scanner.nextInt();
        }

        // Menghitung nilai setara
        double[] nilaiSetara = new double[jumlahMataKuliah];
        for (int i = 0; i < jumlahMataKuliah; i++) {
            nilaiSetara[i] = getNilaiSetara(nilai[i]);
        }

        // Menghitung IP Semester
        double ipSemester = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            ipSemester += nilaiSetara[i] * sks[i];
        }
        ipSemester /= getTotalSks(sks);

        // Menampilkan tabel hasil
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("| Nama Matakuliah | Nilai Huruf | Bobot Nilai | SKS |");
        System.out.println("-------------------------------------");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.printf("| %-15s | %-10s | %-10.2f | %2d |\n", namaMK[i], nilai[i], nilaiSetara[i], sks[i]);
        }
        System.out.println("-------------------------------------");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }

    private static double getNilaiSetara(String nilai) {
        switch (nilai) {
            case "A":
                return 4;
            case "B+":
                return 3.5;
            case "B":
                return 3;
            case "C+":
                return 2.5;
            case "C":
                return 2;
            case "D":
                return 1;
            default:
                return 0;
        }
    }

    private static int getTotalSks(int[] sks) {
        int totalSks = 0;
        for (int i : sks) {
            totalSks += i;
        }
        return totalSks;
    }
}
