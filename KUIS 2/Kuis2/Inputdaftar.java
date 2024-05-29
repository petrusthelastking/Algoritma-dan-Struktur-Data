package Kuis2;

import java.util.*;
public class Inputdaftar {
    class Pembalap {
        String nama;
        int nomor;
        int totalPoin;
    
        Pembalap(String nama, int nomor) {
            this.nama = nama;
            this.nomor = nomor;
            this.totalPoin = 0;
        }
    
        void tambahPoin(int poin) {
            this.totalPoin += poin;
        }
    
        void resetPoin() {
            this.totalPoin = 0;
        }
    }
    
    // Kelas untuk merepresentasikan Balapan
    class Balapan {
        String namaSirkuit;
        LinkedList<Pembalap> hasil;
    
        Balapan(String namaSirkuit) {
            this.namaSirkuit = namaSirkuit;
            this.hasil = new LinkedList<>();
        }
    
        void tambahHasil(Pembalap pembalap, int poin) {
            pembalap.tambahPoin(poin);
            this.hasil.add(pembalap);
        }

        void tampilkanHasil() {
            System.out.println("Hasil Balapan di " + namaSirkuit + ":");
            for (Pembalap pembalap : hasil) {
                System.out.println(pembalap.nomor + "\t" + pembalap.nama + "\t\t" + pembalap.totalPoin + " poin");
            }
        }
    }
    
    // Kelas untuk merepresentasikan Klasemen
    class Klasemen {
        LinkedList<Pembalap> daftarPembalap;
    
        Klasemen() {
            this.daftarPembalap = new LinkedList<>();
        }
    
        void tambahPembalap(Pembalap pembalap) {
            // Cek apakah pembalap sudah ada sebelumnya
            boolean sudahAda = false;
            for (Pembalap p : daftarPembalap) {
                if (p.nomor == pembalap.nomor) {
                    sudahAda = true;
                    break;
                }
            }
            // Jika belum ada, tambahkan pembalap
            if (!sudahAda) {
                this.daftarPembalap.add(pembalap);
                Collections.sort(this.daftarPembalap, (a, b) -> b.totalPoin - a.totalPoin);
            } else {
                System.out.println("Pembalap dengan nomor " + pembalap.nomor + " sudah ada dalam daftar.");
            }
        }
    
        void resetPoinPembalap() {
            for (Pembalap pembalap : daftarPembalap) {
                pembalap.resetPoin();
            }
        }

        int hitungTotalPoin() {
            int total = 0;
            for (Pembalap pembalap : daftarPembalap) {
                total += pembalap.totalPoin;
            }
            return total;
        }
    
        void tampilkanKlasemen() {
            System.out.println("\nKlasemen MotoGP:");
            System.out.println("Posisi\tNomor\tNama Pembalap\tTotal Poin");
            for (int i = 0; i < daftarPembalap.size(); i++) {
                Pembalap pembalap = daftarPembalap.get(i);
                System.out.println((i + 1) + "\t" + pembalap.nomor + "\t" + pembalap.nama + "\t\t" + pembalap.totalPoin);
            }
            System.out.println("Total poin semua pembalap: " + hitungTotalPoin());
        }

        Pembalap getPemenang() {
            Random rand = new Random();
            int index = rand.nextInt(daftarPembalap.size());
            return daftarPembalap.get(index);
        }

        void updatePosisi() {
            Collections.sort(this.daftarPembalap, (a, b) -> b.totalPoin - a.totalPoin);
        }
    }
}