<<<<<<< HEAD
# WEEK 02 - OBJEK
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 22<br>
Kelas : TI 1B

## PRAKTIKUM
JOBSHEET II<br>
OBJECT<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/cd4f87c5-adcb-4822-8668-01c002bf8fb9)

Percobaan 1: Deklarasi Class, Atribut dan Method<br>
Contoh code nya<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/e5c4d4b1-b025-4881-bf80-1b6b97cc9722)

Contoh hasil dari code diatas<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/80d4e025-ab25-449b-a34f-d7d267482828)

## PERTANYAAN
1. Sebutkan dua karakteristik class atau object!
   Jawab:
    -Atribut (State)
Atribut merupakan data atau informasi yang mendeskripsikan keadaan atau karakteristik dari sebuah object. Atribut dapat berupa nilai statis seperti nama, warna, dan ukuran, atau nilai dinamis yang dapat berubah-ubah seperti kecepatan, posisi, dan waktu.
    - methode
     yang mendefinisikan perilaku objek. Di class Buku16.java method nya adalah tampilInformasi(), terjual(int jml), restock(int jml), dan gantiHarga(int hrg).
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class 
Buku? Sebutkan apa saja atributnya!
   Jawab:
- judul: Bertipe data String, menyimpan judul buku.
- pengarang: Bertipe data String, menyimpan nama pengarang buku.
- halaman: Bertipe data int, menyimpan jumlah halaman buku.
- stok: Bertipe data int, menyimpan jumlah stok buku yang tersedia.
- harga: Bertipe data int, menyimpan harga buku.
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
   Jawab:
- tampilinformasi(): Method ini tidak mengembalikan nilai (void) dan berfungsi untuk menampilkan informasi buku, seperti judul, pengarang, jumlah halaman, stok, dan harga.
- terjual(int jml): Method ini tidak mengembalikan nilai (void) dan berfungsi untuk mengurangi stok buku berdasarkan jumlah yang terjual.
- restock(int jml): Method ini tidak mengembalikan nilai (void) dan berfungsi untuk menambah stok buku berdasarkan jumlah yang direstock.
- gantiharga(int hrg): Method ini tidak mengembalikan nilai (void) dan berfungsi untuk mengubah harga buku dengan nilai baru.
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut 
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!<br>
  Jawab:
  
  ![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/856143cc-87f3-4c9a-a26a-5491536ee45b)
  
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?
    Jawab:
- Jumlah barang adalah besaran diskrit: Jumlah barang tidak bisa dipecah menjadi bagian-bagian kecil, melainkan harus berupa bilangan bulat. Oleh karena itu, tipe data int yang hanya dapat menyimpan bilangan bulat adalah pilihan yang tepat.
- Efisiensi: Penggunaan tipe data int lebih efisien dibandingkan tipe data lain seperti float atau double karena hanya membutuhkan memori yang lebih sedikit.
- Kemudahan: Penggunaan bilangan bulat lebih mudah dipahami dan digunakan dalam perhitungan stok.



Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

contoh Percobaan Code

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/65eb5a7f-cfb0-4080-9b22-69d2e6a3b3fe)

contohh hasil

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/c27b64bf-9d9c-49f5-842c-848aeddb24eb)


## PERTANYAAN
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!
Apa nama object yang dihasilkan?<br>
   Jawab:
   ![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/ca22bdf9-f6cb-4501-a16c-e720e1431d5e)

2. Bagaimana cara mengakses atribut dan method dari suatu objek?<br>
   Jawab:
   1. Melalui Objek:
Atribut: namaObjek.namaAtribut
Method: namaObjek.namaMethod(parameter)
2. Melalui Konstruktor:
new NamaKelas(parameter1, parameter2, ...)

3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda? <br>
   Jawab:
- Penjualan buku: Pada baris ke-7, method terjual(5) dipanggil untuk mengurangi stok buku bk1 sebanyak 5 buah. Hal ini menyebabkan nilai atribut stok berubah dari 13 menjadi 8.
- Perubahan harga: Pada baris ke-9, method gantiharga(60000) dipanggil untuk mengubah harga buku bk1 menjadi 60.000. Hal ini menyebabkan nilai atribut harga berubah dari 71.000 menjadi 60.000.



Percobaan 3: Membuat Konstruktor

contoh Percobaan Code ke 1

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/946e66f4-e9af-466c-8808-9a4d5f00f348)

contoh Percobaan Code ke 2

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/4563a04a-9503-4665-956d-4c6842cdae1d)

hasil code 1

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/6d465889-c9ee-4a4e-8c8f-04dcc2e11f9d)


## PERTANYAAN
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk 
mendeklarasikan konstruktor berparameter!<br>
   Jawab:
   ![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/7a565e2e-668a-4523-9018-2792dcf32fb5)

2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?<br>
   Jawab:
baris program ini membuat sebuah objek baru dari kelas Buku22 dengan judul "self reword", penulis "mahendra ayesha", 160 halaman, diskon 29%, dan harga Rp 59.000. Objek ini kemudian disimpan dalam variabel bk2 untuk digunakan di kemudian hari.

3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana 
hasilnya? Jelaskan mengapa hasilnya demikian!<br>
   Jawab: code akan Error kenapa?
   BukuMain22.java:10: error: no suitable constructor found for Buku22(String,String,int,int,int)
        Buku22 bk2 = new Buku22("self reword", "mahendra ayesha", 160, 29, 59000);
        ^
  constructor Buku22() is not visible
  constructor Buku22(String) is not visible
1 error

a. Ketidakmampuan Menciptakan Objek: Konstruktor default diperlukan untuk membuat objek baru dari class tersebut. Tanpa konstruktor default, tidak ada cara untuk menginisialisasi variabel instance class.
b. Kesalahan Kompilasi: Saat mencoba mengkompilasi program, compiler Java akan mendeteksi missing default constructor dan menghasilkan error.
c. Pentingnya Konstruktor: Konstruktor memungkinkan Anda menginisialisasi nilai awal untuk variabel instance saat membuat objek baru.

4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses 
secara berurutan? Jelaskan alasannya!<br>
   Jawab:
Tidak, method di dalam class Buku tidak harus diakses secara berurutan setelah melakukan instansiasi object. Akses method bebas dilakukan dalam urutan apa pun, sesuai kebutuhan program.

5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor 
berparameter dari class Buku!<br>
   Jawab:
   ![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/610a3463-a64f-4900-ae21-a83e5b542062)

   ![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/e5f8c6f2-064a-4e2d-8f78-d6e4b67eb252)

contoh output dari code diatas
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/d468eaa1-6c5d-414f-9845-559189f0c42f)
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/1129aabd-f02e-4a30-8e1d-6d9d087fd010)


## Latihan Praktikum

Contoh Program
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/1e8cecf0-8b57-49b7-b735-01f6ac6247d2)


Contoh Output code

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/f3136766-78be-46a9-8bd8-43c4fe7e6c90)



Contoh code dari Dragon

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/ce009204-e3b4-44d5-b8ce-a12ccdd31ed3)


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/7311b9dd-d0bd-4c3d-af3c-f84b4e29d2c5)


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/ece457ea-624f-4147-9381-a21cd5c14c41)



Output dari program di atas

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-Data/assets/143620112/cc19d17a-2993-48cd-a35a-050477d0e8a6)

=======
# WEEK 05 - BRUTE FORCE DAN DIVIDE CONQUER
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 22<br>
Kelas : TI 1B

## PRAKTIKUM 1
Contoh code 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/3c020648-5480-4adb-9ced-52b777b5f1b5)

Contoh Code 2<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/722c4f41-c5d0-4783-bd26-8bf05c87e30e)


Contoh Outputnya<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/34b65b34-e5cc-40a1-897d-16e6094f4947)


##PERTANYAAN
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else!<br>
JAWAB:<br>
perbedaan dalam penggunaan if dan else dapat mempengaruhi bagaimana algoritma beroperasi terutama dalam hal bagaimana algoritma membagi masalah menjadi submasalah dan bagaimana submasalah tersebut digabungkan kembali.

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan!<br>
JAWAB:<br>
Ya, memungkinkan untuk merubah perulangan pada method faktorialBF() selain menggunakan for menggunakan pendekatan rekursif.<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8dcb9f85-6ada-4579-a906-49420dca5b8b)


5. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

perbedaan utama antara keduanya adalah bahwa yang pertama menggunakan perulangan untuk mengakumulasi hasil perkalian, sedangkan yang kedua menggunakan rekursi untuk memecah masalah dan menghitung faktorial.


## PRAKTIKUM 2
Contoh Code 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/af390c71-4c09-4ba1-bb95-0517823664db)


Contoh Code 2<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/cc52e2d4-2e45-4f2d-ad03-6295e865ee04)


Contoh Output<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/1844b47e-b72b-481f-a46c-f4bca9f3f06a)



# PERTANYAAN 

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!<br>
JAWAB:<br>
perbedaan utama antara keduanya adalah dalam pendekatan perhitungan: PangkatBF() menggunakan pendekatan iteratif sederhana, sementara PangkatDC() menggunakan pendekatan rekursif yang memanfaatkan sifat-sifat matematis untuk mengurangi jumlah operasi yang diperlukan.

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!<br>
JAWAB:<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/09e22e81-be6e-484a-af77-2da5c3bb8aa3)

3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.<br>
JAWAB:<br>

![12345](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/ab510a90-2bcf-4b02-b96c-50ed2d7c14c6)


![123456](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/bdc0be00-9fe3-4092-bc04-c680c88f733c)


4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case!<br>
JAWAB:<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8d5297fa-1dcd-45de-bf55-fa97c94d37e5)



## PRAKTIKUM 3
Contoh Code 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/68dbf4f5-b13d-4d35-a6a6-6bbdac04703b)


Contoh Code 2<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/25312943-354c-42b8-9194-8c7d4b8ddcc6)



## PERTANYAAN


1. Mengapa terdapat formulasi return value berikut?Jelaskan!<br>
JAWAB:<br>
Formulasi return value digunakan untuk menghitung jumlah elemen dalam array dengan menggunakan algoritma divide-and-conquer.

3. Kenapa dibutuhkan variable mid pada method TotalDC()? <br>
JAWAB:<br>
penggunaan variabel mid dalam metode TotalDC() sangat tergantung pada konteks dan implementasi spesifik dari metode tersebut.

4. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program!<br>
JAWAB:<br>

public class mainSum_26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc26.nextInt();
        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = sc26.nextInt();

        double[][] keuntunganPerusahaan = new double[jumlahPerusahaan][jumlahBulan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1) + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan bulan " + (j + 1) + " (dalam juta): ");
                keuntunganPerusahaan[i][j] = sc26.nextDouble();
            }
        }

        for (int i = 0; i < jumlahPerusahaan; i++) {
            double totalKeuntungan = 0;
            for (int j = 0; j < jumlahBulan; j++) {
                totalKeuntungan += keuntunganPerusahaan[i][j];
            }
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " adalah: " + totalKeuntungan + " juta");
        }

        sc26.close();
    }
}


## Latihan Praktikum
Contoh code 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/3d11ae9d-abef-4bd9-ba81-eafc1d80f386)


Contoh Code 2<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/ea8e59df-89ab-47a8-9a1e-ce216095ba9c)

>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
