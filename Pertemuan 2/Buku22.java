<<<<<<< HEAD
/**
 * Buku22
 */
public class Buku22 {

        String judul, pengarang;
        int halaman , stok, harga;

        void tampilinfromasi() {
            System.out.println("judul: " + judul);
            System.out.println("pengarang: " + pengarang);
            System.out.println("jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: Rp " + harga);
        }

        void terjual(int jml) {
            stok -= jml;
        }
        
        void restock(int jml) {
            stok -= jml;
        }
        void gantiharga(int hrg) {
            harga = hrg;
        }
        public Buku22() {

        }
        public Buku22(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
            

        }
=======
/**
 * Buku22
 */
public class Buku22 {

        String judul, pengarang;
        int halaman , stok, harga;

        void tampilinfromasi() {
            System.out.println("judul: " + judul);
            System.out.println("pengarang: " + pengarang);
            System.out.println("jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: Rp " + harga);
        }

        void terjual(int jml) {
            stok -= jml;
        }
        
        void restock(int jml) {
            stok -= jml;
        }
        void gantiharga(int hrg) {
            harga = hrg;
        }
        public Buku22() {

        }
        public Buku22(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
            

        }
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
    }