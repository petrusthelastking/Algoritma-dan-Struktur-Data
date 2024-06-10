package PERTEMUAN15;

import java.util.Scanner;

public class GraphMain21 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah gedung: ");
            int numVertices = scanner.nextInt();
            Graph21 gedung = new Graph21(numVertices);

            char choice;
            do {
                System.out.println("\nMenu Program:");
                System.out.println("a) Add Edge");
                System.out.println("b) Remove Edge");
                System.out.println("c) Degree");
                System.out.println("d) Print Graph");
                System.out.println("e) Cek Edge");
                System.out.println("f) Tambah Gedung");
                System.out.println("g) Keluar");
                System.out.print("Pilih menu: ");
                choice = scanner.next().charAt(0);

                switch (choice) {
                    case 'a':
                        System.out.print("Masukkan asal gedung: ");
                        int source = scanner.nextInt();
                        System.out.print("Masukkan tujuan gedung: ");
                        int destination = scanner.nextInt();
                        System.out.print("Masukkan bobot edge: ");
                        int weight = scanner.nextInt();
                        gedung.addEdge(source, destination, weight);
                        break;
                    case 'b':
                        System.out.print("Masukkan asal gedung yang ingin dihapus edge-nya: ");
                        int sourceRemove = scanner.nextInt();
                        System.out.print("Masukkan tujuan gedung yang ingin dihapus edge-nya: ");
                        int destinationRemove = scanner.nextInt();
                        gedung.removeEdge(sourceRemove, destinationRemove);
                        break;
                    case 'c':
                        System.out.print("Masukkan gedung yang ingin diketahui derajatnya: ");
                        int vertex = scanner.nextInt();
                        gedung.degree(vertex);
                        break;
                    case 'd':
                        gedung.printGraph21();
                        break;
                    case 'e':
                        System.out.print("Masukkan gedung asal: ");
                        int src = scanner.nextInt();
                        System.out.print("Masukkan gedung tujuan: ");
                        int dest = scanner.nextInt();
                        if (gedung.isReachable(src, dest)) {
                            System.out.println("Gedung " + (char) ('A' + src) + " dan " + (char) ('A' + dest) + " bertetangga");
                        } else {
                            System.out.println("Gedung " + (char) ('A' + src) + " dan " + (char) ('A' + dest) + " tidak bertetangga");
                        }
                        break;
                    case 'f':
                        System.out.print("Masukkan jumlah gedung yang ingin ditambahkan: ");
                        int numNewVertices = scanner.nextInt();
                        gedung.addVertex(numNewVertices);
                        break;
                    case 'g':
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            } while (choice != 'g');

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace for debugging purposes
        }
    }
}
