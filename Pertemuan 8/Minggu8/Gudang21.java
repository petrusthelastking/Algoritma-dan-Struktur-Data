<<<<<<< HEAD
package Minggu8;

import java.util.Stack;

public class Gudang21 {
    Barang21[] tumpukan;
    int size;
    int top;

public Gudang21(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang21[size];
        top = -1;
    }
public boolean cekkosong(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    public boolean cekpenuh(){
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }

public void tambahBarang(Barang21 brg) {
    if (!cekpenuh()) {
        top++;
        tumpukan[top] = brg;
        System.out.println("barang " + brg.nama + "Berhasil Ditambahkan ke Gudang");
    }else{
        System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
    }
}
public Barang21 ambilbarang() {
    if (!cekkosong()) {
        Barang21 delete = tumpukan[top];
        top--;
        System.out.println("Barang " + delete.nama + "diambil dari Gudang");
        System.out.println("Kode unik dalam biner: " + konversiDecimalkeBiner(delete.kode));
        return delete;
    }else{
        System.out.println("tumpukan barang kosong");
        return null;
    }
}
public Barang21 lihatBarangTeratas() {
    if (!cekkosong()) {
        Barang21 barangTeratas = tumpukan[top];
        System.out.println("Barang teratas: " + barangTeratas.nama);
        return barangTeratas;
    }else{
        System.out.println("Tumpukan Barang Kosong.");
        return null;
    }
}
public void tampilkanBarang(){
    if (!cekkosong()) {
        System.out.println("Rincian tumpukan barang di gudang");
        for (int i = 0; i <= top; i++) {
            System.out.printf("kode %s, nama %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
        }
    }else{
        System.out.println("tumpukan barang kosong");
    }
}
public String konversiDecimalkeBiner(int kode) {
    Stack<Integer> stack = new Stack<>();
    while (kode > 0) {
        int sisa = kode % 2;
        stack.push(sisa);
        kode = kode / 2;
    }
    StringBuilder biner = new StringBuilder();
    while (!stack.isEmpty()) {
        biner.append(stack.pop());
    }
    return biner.toString();
}
public Barang21 lihatBarangTerbawah() {
    if (!cekkosong()) {
        Barang21 barangTerbawah = tumpukan[0];
        System.out.println("Barang terbawah: " + barangTerbawah.nama);
        return barangTerbawah;
    } else {
        System.out.println("Tumpukan Barang Kosong.");
        return null;
    }
}

public boolean cariBarang(int kode, String nama) {
    if (!cekkosong()) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == kode || tumpukan[i].nama.equals(nama)) {
                System.out.println("Barang ditemukan:");
                System.out.printf("Kode: %s, Nama: %s, Kategori: %s\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
                return true;
            }
        }
        System.out.println("Barang tidak ditemukan.");
        return false;
    } else {
        System.out.println("Tumpukan Barang Kosong.");
        return false;
    }
}
}

=======
package Minggu8;

import java.util.Stack;

public class Gudang21 {
    Barang21[] tumpukan;
    int size;
    int top;

public Gudang21(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang21[size];
        top = -1;
    }
public boolean cekkosong(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    public boolean cekpenuh(){
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }

public void tambahBarang(Barang21 brg) {
    if (!cekpenuh()) {
        top++;
        tumpukan[top] = brg;
        System.out.println("barang " + brg.nama + "Berhasil Ditambahkan ke Gudang");
    }else{
        System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
    }
}
public Barang21 ambilbarang() {
    if (!cekkosong()) {
        Barang21 delete = tumpukan[top];
        top--;
        System.out.println("Barang " + delete.nama + "diambil dari Gudang");
        System.out.println("Kode unik dalam biner: " + konversiDecimalkeBiner(delete.kode));
        return delete;
    }else{
        System.out.println("tumpukan barang kosong");
        return null;
    }
}
public Barang21 lihatBarangTeratas() {
    if (!cekkosong()) {
        Barang21 barangTeratas = tumpukan[top];
        System.out.println("Barang teratas: " + barangTeratas.nama);
        return barangTeratas;
    }else{
        System.out.println("Tumpukan Barang Kosong.");
        return null;
    }
}
public void tampilkanBarang(){
    if (!cekkosong()) {
        System.out.println("Rincian tumpukan barang di gudang");
        for (int i = 0; i <= top; i++) {
            System.out.printf("kode %s, nama %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
        }
    }else{
        System.out.println("tumpukan barang kosong");
    }
}
public String konversiDecimalkeBiner(int kode) {
    Stack<Integer> stack = new Stack<>();
    while (kode > 0) {
        int sisa = kode % 2;
        stack.push(sisa);
        kode = kode / 2;
    }
    StringBuilder biner = new StringBuilder();
    while (!stack.isEmpty()) {
        biner.append(stack.pop());
    }
    return biner.toString();
}
public Barang21 lihatBarangTerbawah() {
    if (!cekkosong()) {
        Barang21 barangTerbawah = tumpukan[0];
        System.out.println("Barang terbawah: " + barangTerbawah.nama);
        return barangTerbawah;
    } else {
        System.out.println("Tumpukan Barang Kosong.");
        return null;
    }
}

public boolean cariBarang(int kode, String nama) {
    if (!cekkosong()) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == kode || tumpukan[i].nama.equals(nama)) {
                System.out.println("Barang ditemukan:");
                System.out.printf("Kode: %s, Nama: %s, Kategori: %s\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
                return true;
            }
        }
        System.out.println("Barang tidak ditemukan.");
        return false;
    } else {
        System.out.println("Tumpukan Barang Kosong.");
        return false;
    }
}
}

>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
