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
## WEEK 6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT

# NAMA : PETRUS TYANG AGUNG ROSARIO
# NIM : 2341720227
# KELAS : TI 1B

## PERCOBAAN 1
CONTOH CODE 1<br>

![Percobaaan 1 (1)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a1de29da-4bc0-43d7-97e1-151a7e29563b)


CONTOH CODE 2<br>

![Percobaaan 1 (2)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/30490b84-f956-4d02-b547-04fa1fdb7b9b)


CONTOH CODE 3<br>

![Percobaaan 1 (3)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f1aa716f-94c2-40fb-be9b-dace5257530e)


OUTPUT CODE<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/d4c209e1-3229-4371-9381-7e3d3103b247)


## PERTANYAAN 

1. Terdapat di method apakah proses bubble sort?<br>
JAWAB:<br>

Proses Bubble Sort terdapat dalam sebuah method yang disebut dengan nama yang sama, yaitu "bubbleSort". Method ini merupakan salah satu algoritma sorting sederhana yang bekerja dengan cara membandingkan dan menukar elemen-elemen secara berpasangan dalam sebuah array sampai seluruh array terurut.<br>


2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:<br>
JAWAB:<br>

 baris kode tersebut berfungsi untuk melakukan penukaran posisi elemen dalam daftar listMhs pada algoritma Bubble Sort. Penukaran ini dilakukan berdasarkan IPK mahasiswa, di mana elemen dengan IPK lebih tinggi akan ditukar ke posisi kanan (indeks lebih besar) pada daftar.
Dengan proses penukaran berulang ini, elemen dengan IPK tertinggi akan terus "mengapung" ke akhir daftar (posisi indeks terbesar) pada setiap iterasi. Hal ini membuat keseluruhan daftar listMhs terurut secara descending (dari tinggi ke rendah) berdasarkan IPK mahasiswa.<br>


3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:<br>
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?<br>
JAWAB:<br>
Perulangan i dan j berfungsi sama untuk melakukan perbandingan dan penukaran elemen dalam bubble sort. Perbedaannya terletak pada posisi elemen yang dibandingkan. Perulangan i membandingkan elemen saat ini dengan elemen selanjutnya, sedangkan perulangan j membandingkan elemen saat ini dengan elemen-elemen setelahnya.

b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?<br>
JAWAB:<br>
Syarat dari perulangan i adalah i < listMhs.length - 1 karena perulangan ini hanya perlu berjalan sebanyak listMhs.length - 1 kali untuk mengurutkan semua elemen dalam array listMhs. Jumlah tahap bubble sort yang ditempuh juga tergantung pada jumlah elemen dalam array listMhs, yaitu listMhs.length - 1 tahap.

c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?<br>
JAWAB<br>
syarat perulangan j < listMhs.length - i pada bubble sort digunakan untuk:
Mencegah perbandingan elemen yang tidak perlu.
Memastikan elemen yang lebih besar "menguap" ke posisi akhir array pada setiap iterasi.
Hal ini dikarenakan pada setiap iterasi i, elemen yang lebih besar sudah dibandingkan dan ditukar pada iterasi sebelumnya. Oleh karena itu, perulangan j hanya perlu fokus pada elemen yang belum tentu berada pada posisi akhir.

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?<br>
JAWAB<br>
Perulangan i dalam bubble sort dengan 50 data akan berjalan sebanyak 49 kali.
Jumlah tahap bubble sort yang ditempuh adalah 49 tahap.
Jumlah perulangan dan tahap ini dihitung berdasarkan kasus di mana data belum terurut sama sekali.
Jika data sudah terurut sebagian atau seluruhnya, maka jumlah perulangan dan tahap bubble sort bisa lebih sedikit.


## PERCOBAAN 2

CONTOH CODE 1<br>

![Percobaaan 2 (1)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/067bddca-456f-4255-b6b6-18d6b27c4e3d)


CONTOH CODE 2<br>


![Percobaaan 2 (2)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f229997d-9acd-4a70-825f-d035f2cc95e6)


OUTPUT CODE<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/ac1614ff-08e6-4b2e-8664-d4154e914333)



## PERTANYAAN 

1. Di dalam method selection sort, terdapat baris program seperti di bawah ini:Untuk apakah proses tersebut, jelaskan!<br>
JAWAB<br>
Proses yang dilakukan oleh baris-baris program tersebut adalah mencari elemen terkecil dalam array listMhs mulai dari indeks i+1 dan menukar elemen tersebut dengan elemen listMhs pada indeks i. Proses ini diulang sebanyak listMhs.length-1 kali untuk mengurutkan seluruh elemen array listMhs.




## PERCOBAAN 3

CONTOH CODE 1<br>


![Percobaaan 3 (1)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/4a96416d-5d57-4773-87c3-ffd5b6e77aac)


CONTOH CODE 2<br>


![Percobaaan 3 (2)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a7181fd5-7a21-42f2-9d01-a933cc877c88)


OUTPUT CODE<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/295814e2-e75d-43fa-aed6-826e0d8e2d38)



## PERTANYAAN


1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.<br>
JAWAB<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/5c1fb71d-4c27-4713-b526-15b0fe2dcf5e)


OUTPUT CODE<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/25bc8106-4a6b-409c-9c83-4de5656228be)




## Latihan Praktikum


CONTOH CODE 1<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/fe8ff897-7892-4d62-8204-86eba5ad214d)



CONTOH CODE 2<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/107e1669-9ef5-4c3b-a85a-1a3fde8f3154)


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/c2d5bc88-b029-4d04-85b6-4efaaa163ebf)



CONTOH CODE 3<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7777ad73-a76f-4b94-8137-da856458f272)
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
