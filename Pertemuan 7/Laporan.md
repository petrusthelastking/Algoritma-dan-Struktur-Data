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
# WEEK 07 - SEARCHING
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 22<br>
Kelas : TI 1B


## TUGAS PRAKTEK 1
CONTOH CODE 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7159225c-8dac-4842-84e3-b15fec82725d)

CONTOH CODE 2<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a025c85f-13cb-44c1-9bac-ac442dfeec43)


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/06086737-0549-408a-9b4a-158b2d46650b)


CONTOH CODE 3<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/523f74e7-b248-4a7a-a84a-6ae8ce472d32)


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/64a497b1-13ce-4deb-a5be-8539dd523ad7)


CONTOH OUTPUT<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a6f5555a-5df8-45be-8626-311e43e77026)



## PERTANYAAN

1. Jelaskan fungsi break yang ada pada method FindSeqSearch!<br>
JAWAB<br>
- Digunakan untuk menghentikan proses pencarian ketika elemen yang dicari telah ditemukan.
- Meningkatkan efisiensi dan mencegah iterasi yang tidak perlu.
- Tidak selalu diperlukan dalam semua kasus.
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?<br>
JAWAB: Iya masih bisa dapat berjalan:<br>
contoh nya:
Data kode buku: [103, 215, 312, 451, 502, 624, 718, 834]
Kode buku 312 ditemukan di indeks 2
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :<br>
JAWAB:<br>

public class BukuMain {
    public static void main(String[] args) {
        PencarianBuku21 pencarian = new PencarianBuku21();
        // Menambahkan buku ke dalam listBk

        // Mencari buku berdasarkan nomor absen
        Buku21 bukuDitemukan = pencarian.FindBuku(12345);

        if (bukuDitemukan != null) {
            System.out.println("Buku ditemukan:");
            bukuDitemukan.tampilDataBuku();
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}


## TUGAS PRAKTEK 2

CONTOH CODE 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/2ebff287-3844-4218-933b-11d7eddf521a)


CONTOH CODE 2<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/1a01313f-077a-4f39-85a7-d5855443e791)


CONTOH OUTPUT<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/c35a2a0b-5d8d-4887-b3ec-bf9711aefcb3)



## PERTANYAAN


1. Tunjukkan pada kode program yang mana proses divide dijalankan!<br>
JAWAB<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/80745c3d-92d5-414c-bdba-8aac6f82b8de)

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!<br>
JAWAB<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/bc4cb7a7-3530-4e16-a2f1-09dac97d2e57)


4. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan
Mengapa hal tersebut bisa terjadi?<br>
JAWAB<br>

Ya, program masih dapat berjalan meskipun data Kode Buku yang dimasukkan tidak urut. Hal ini karena algoritma pencarian biner (binary search) bekerja dengan cara membagi data menjadi dua bagian dan mencari nilai target di salah satu bagian berdasarkan perbandingan dengan nilai tengah. Namun, ini hanya berlaku jika pencarian dilakukan dalam array yang sudah diurutkan.<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/013fdd8b-f6b8-4986-b57b-43beac18b240)


3. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214,
20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search?
Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!<br>
JAWAB<br>
dari binary search tidak akan sesuai jika kode buku tidak dalam urutan yang terurut. Binary search mengharapkan bahwa elemen dalam array sudah dalam urutan dari terkecil ke terbesar atau sebaliknya agar dapat bekerja secara efisien.




## LATIHAN PRAKTEK


1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
Ubah tipe data dari kode Buku yang awalnya int menjadi String<br>
JAWAB<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/040a648e-5042-4599-86b9-159445e507ba)



Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan sequential search dan binary search.<br>



![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/1d9b5bbd-5eb8-4559-97ea-40e5daec70a1)



CONTOH OUTPUT PERCOBAAN<br>



![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/eefcb147-15c4-479c-b7fe-cec361c9cef2)




2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini<br>
Tambahkan method pencarian judul buku menggunakan sequential search dan binary search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga ketika input data acak, maka algoritma searching akan tetap berjalan<br>
JAWAB:<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/e4018991-ae07-4f52-9b52-e30a9ce6b928)



![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/0bc5bf90-522b-45b2-be6f-48d0afc55b09)



![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/26f17807-18ba-4c13-b918-872bbbbed9ea)



CONTOH OUTPUT PERCOBAAN<br>


![TUGAS ASD SC](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/00407e4b-3477-418b-9462-cf3b625f63c0)



![TUGAS ASD SC 2](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/cf172a00-638f-4fb4-aff5-bc06f7b083ed)



![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a2cd48a1-6f3b-45d3-9251-0c65415d2e37)





>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
