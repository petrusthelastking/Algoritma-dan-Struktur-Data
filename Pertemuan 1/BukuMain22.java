public class Buku22 {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    double harga;

    
    public Buku22() {
    }

    
    public Buku22(String judul, String pengarang, int halaman, int stok, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    
    public void tampilinfromasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
        System.out.println();
    }

    
    public void terjual(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
            System.out.println(jumlah + " buku terjual.");
        } else {
            System.out.println("Stok tidak mencukupi untuk penjualan.");
        }
    }

    
    public void gantiharga(double hargaBaru) {
        if (hargaBaru > 0) {
            harga = hargaBaru;
            System.out.println("Harga buku diperbarui menjadi " + hargaBaru);
        } else {
            System.out.println("Harga baru harus lebih dari 0.");
        }
    }

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
