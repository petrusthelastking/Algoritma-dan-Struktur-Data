public class BukuMain22 {
    public static void main(String[] args) {
        Buku22 bk1 = new Buku22();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilinfromasi();
        bk1.terjual(5);
        bk1.gantiharga(60000);
        bk1.tampilinfromasi();

        Buku22 bk2 = new Buku22("self reword", "mahendra ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilinfromasi();

        
        Buku22 bukuMahasiswa = new Buku22("judulMahasiswa", "pengarangMahasiswa", 150, 10, 50000);
        bukuMahasiswa.tampilinfromasi();
        bukuMahasiswa.terjual(3);
        bukuMahasiswa.gantiharga(48000);
        bukuMahasiswa.tampilinfromasi();
    }
}
