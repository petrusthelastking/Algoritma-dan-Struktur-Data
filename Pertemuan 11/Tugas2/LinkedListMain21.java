package Tugas2;

public class LinkedListMain21 {
    public static void main(String[] args) {
        LinkedList21 linkedList = new LinkedList21();
        
        System.out.println("=============================================");
        System.out.println(" Selamat Datang di Aplikasi Layanan web kami!");
        System.out.println("=============================================");
        System.out.println("\nMengisi Antrian pertama:");
        
        linkedList.enqueue(new mhs21(111, "Anton"));
        linkedList.enqueue(new mhs21(112, "Prita"));
        linkedList.enqueue(new mhs21(113, "Yusuf"));
        linkedList.enqueue(new mhs21(114, "Doni"));
        
        System.out.println("\nAntrian saat ini:");
        linkedList.print();

        System.out.println("=============================================");
        System.out.println("Melakukan Operasi Dequeue (Mengurangi Antrian)");
        System.out.println("=============================================");
        linkedList.dequeue();
        System.out.println("\nAntrian setelah satu clien dilayani:");
        linkedList.print();

        System.out.println("=============================================");
        linkedList.dequeue();
        System.out.println("\nAntrian setelah satu clien lagi dilayani:");
        linkedList.print();

        System.out.println("=============================================");
        System.out.println("\nMenambahkan clien Baru ke Antrian:");
        linkedList.enqueue(new mhs21(115, "Sari"));
        System.out.println("\nAntrian saat ini:");
        linkedList.print();

        System.out.println("=============================================");
        System.out.println(" Terima Kasih telah menggunakan Aplikasi kami!");
        System.out.println("=============================================");
    }
}
