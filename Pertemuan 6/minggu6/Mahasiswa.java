package minggu6;

public class Mahasiswa {
    String nama;
    int thnMasuk, unur;
    double ipk;
    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        unur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun masuk = "+thnMasuk);
        System.out.println("Umur = "+unur);
        System.out.println("Ipk = "+ipk);
    }
}
