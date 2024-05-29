<<<<<<< HEAD
public class Buku22 {

    private String nama;
    private String penulis;
    private int tahunTerbit;


    public Buku22(String nama, String penulis, int tahunTerbit) {
        if (nama.isBlank()) {
            throw new IllegalArgumentException("Nama buku tidak boleh kosong.");
        }
        if (penulis.isBlank()) {
            throw new IllegalArgumentException("Nama penulis tidak boleh kosong.");
        }
        if (tahunTerbit <= 0) {
            throw new IllegalArgumentException("Tahun terbit harus positif.");
        }

        this.nama = nama;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama.isBlank()) {
            throw new IllegalArgumentException("Nama buku tidak boleh kosong.");
        }
        this.nama = nama;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        if (penulis.isBlank()) {
            throw new IllegalArgumentException("Nama penulis tidak boleh kosong.");
        }
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        if (tahunTerbit <= 0) {
            throw new IllegalArgumentException("Tahun terbit harus positif.");
        }
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "nama='" + nama + '\'' +
                ", penulis='" + penulis + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                '}';
    }

    public static void main(String[] args) {
        String namaMahasiswa = "Alice";

        try {
            Buku22 bukuMahasiswa = new Buku22("Buku " + namaMahasiswa, namaMahasiswa, 2024);
            System.out.println(bukuMahasiswa.toString());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
=======
public class Buku22 {

    private String nama;
    private String penulis;
    private int tahunTerbit;


    public Buku22(String nama, String penulis, int tahunTerbit) {
        if (nama.isBlank()) {
            throw new IllegalArgumentException("Nama buku tidak boleh kosong.");
        }
        if (penulis.isBlank()) {
            throw new IllegalArgumentException("Nama penulis tidak boleh kosong.");
        }
        if (tahunTerbit <= 0) {
            throw new IllegalArgumentException("Tahun terbit harus positif.");
        }

        this.nama = nama;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama.isBlank()) {
            throw new IllegalArgumentException("Nama buku tidak boleh kosong.");
        }
        this.nama = nama;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        if (penulis.isBlank()) {
            throw new IllegalArgumentException("Nama penulis tidak boleh kosong.");
        }
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        if (tahunTerbit <= 0) {
            throw new IllegalArgumentException("Tahun terbit harus positif.");
        }
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "nama='" + nama + '\'' +
                ", penulis='" + penulis + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                '}';
    }

    public static void main(String[] args) {
        String namaMahasiswa = "Alice";

        try {
            Buku22 bukuMahasiswa = new Buku22("Buku " + namaMahasiswa, namaMahasiswa, 2024);
            System.out.println(bukuMahasiswa.toString());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
