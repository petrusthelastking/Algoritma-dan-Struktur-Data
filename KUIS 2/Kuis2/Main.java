package Kuis2;

import java.util.Random;
import java.util.Scanner;

import Kuis2.Inputdaftar.Balapan;
import Kuis2.Inputdaftar.Klasemen;
import Kuis2.Inputdaftar.Pembalap;


public class Main {
    public static void main(String[] args) {
        Inputdaftar inputdaftar = new Inputdaftar();
        Klasemen klasemen = inputdaftar.new Klasemen();

        // Membuat pembalap
        Pembalap pembalap1 = inputdaftar.new Pembalap("Valentino Rossi", 46);
        Pembalap pembalap2 = inputdaftar.new Pembalap("Marc Marquez", 93);
        Pembalap pembalap3 = inputdaftar.new Pembalap("Fabio Quartararo", 20);
        Pembalap pembalap4 = inputdaftar.new Pembalap("Andrea Dovizioso", 4); // Nomor unik
        Pembalap pembalap5 = inputdaftar.new Pembalap("Jorge Lorenzo", 99);   // Nomor unik
        Pembalap pembalap6 = inputdaftar.new Pembalap("Maverick Vinales", 12); // Nomor unik

        // Menambahkan pembalap ke klasemen
        klasemen.tambahPembalap(pembalap1);
        klasemen.tambahPembalap(pembalap2);
        klasemen.tambahPembalap(pembalap3);
        klasemen.tambahPembalap(pembalap4);
        klasemen.tambahPembalap(pembalap5);
        klasemen.tambahPembalap(pembalap6);

        // Melakukan update hasil balapan setiap beberapa detik
        for (int i = 1; i <= 20; i++) {
            System.out.println("\nBalapan ke-" + i + ":");
            Balapan balapan = inputdaftar.new Balapan("Sirkuit " + i);
            // Simulasi hasil balapan
            for (Pembalap pembalap : klasemen.daftarPembalap) {
                Random rand = new Random();
                int poin = rand.nextInt(26); // Random poin antara 0 hingga 25
                balapan.tambahHasil(pembalap, poin);
                pembalap.tambahPoin(poin); // Tambahkan poin pada setiap pembalap
            }
            // Menampilkan hasil balapan
            balapan.tampilkanHasil();
            // Menampilkan klasemen setelah balapan
            klasemen.tampilkanKlasemen();
            // Menampilkan pemenang balapan
            Pembalap pemenang = klasemen.getPemenang();
            System.out.println("Pemenang balapan ini adalah: " + pemenang.nama);
            // Mengupdate posisi pembalap
            klasemen.updatePosisi();
            try {
                Thread.sleep(5000);  // Menunggu 5 detik sebelum update balapan selanjutnya
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}