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
    }