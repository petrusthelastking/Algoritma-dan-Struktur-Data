import java.util.Scanner;

// Class untuk bangun ruang kerucut
class Kerucut {
    private double jariJari;
    private double sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return (1.0 / 3) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}

// Class untuk bangun ruang limas segi empat sama sisi
class LimasSegiEmpat {
    private double panjangSisiAlas;
    private double tinggiLimas;

    public LimasSegiEmpat(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (panjangSisiAlas * tinggiLimas / 2);
    }

    public double hitungVolume() {
        return (1.0 / 3) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}

// Class untuk bangun ruang bola
class Bola {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array of objects
        Kerucut kerucut = new Kerucut(0, 0);
        LimasSegiEmpat limas = new LimasSegiEmpat(0, 0);
        Bola bola = new Bola(0);

        System.out.println("Masukkan atribut untuk Kerucut:");
        System.out.print("Jari-Jari: ");
        kerucut = new Kerucut(scanner.nextDouble(), 0);
        System.out.print("Sisi Miring: ");
        kerucut = new Kerucut(kerucut.hitungLuasPermukaan(), scanner.nextDouble());

        System.out.println("Masukkan atribut untuk Limas Segi Empat Sama Sisi:");
        System.out.print("Panjang Sisi Alas: ");
        limas = new LimasSegiEmpat(scanner.nextDouble(), 0);
        System.out.print("Tinggi Limas: ");
        limas = new LimasSegiEmpat(limas.hitungLuasPermukaan(), scanner.nextDouble());

        System.out.println("Masukkan atribut untuk Bola:");
        System.out.print("Jari-Jari: ");
        bola = new Bola(scanner.nextDouble());

        // Menampilkan luas permukaan dan volume
        System.out.println("\nLuas Permukaan dan Volume:");
        System.out.println("Kerucut - Luas Permukaan: " + kerucut.hitungLuasPermukaan() + ", Volume: " + kerucut.hitungVolume());
        System.out.println("Limas Segi Empat Sama Sisi - Luas Permukaan: " + limas.hitungLuasPermukaan() + ", Volume: " + limas.hitungVolume());
        System.out.println("Bola - Luas Permukaan: " + bola.hitungLuasPermukaan() + ", Volume: " + bola.hitungVolume());

        scanner.close();
    }
}
