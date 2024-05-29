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
# WEEK 02 - STACK
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 21<br>
Kelas : TI 1B

## LATIHAN PERCOBAAN 1

CONTOH CODE 1<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/befd6c60-e9ce-434f-8261-f60fb39ccd8a)



CONTOH CODE 2<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/b5006375-9f95-4a30-be7d-40f8969c3eca)


CONTOH CODE 3<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/3a0b96b5-39f9-43d8-bba2-c7336fc47c0f)


CONTOH CODE 4<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/2e48c854-65dc-4af7-9a15-636bccb473c7)


CONTOH CODE 5<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/315a9665-8ab2-4c03-a442-2ccb5bf258e7)


CONTOH CODE 6<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/9c086ef0-0294-4810-9870-dc326791cd85)


CONTOH OUTPUT 1<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/33dd2fa5-603e-4504-abbc-eff96bb18775)


CONTOH OUTPUT 2<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f5ec41e8-4ed1-4ab9-853e-364f32900780)



## PERTANYAAN:

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana saja yang perlu diperbaiki?<br>
JAWAB:<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/0a829dab-cacc-409d-a1d7-1cfc931cef29)

2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode
programnya!<br>
JAWAB:<br>
Variabel size diinisialisasi dengan nilai kapasitas, dan array tumpukan dibuat dengan panjang yang sesuai. Jadi, kapasitas tumpukan adalah sama dengan nilai yang diberikan saat objek Gudang21 dibuat.<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/9fd0008b-8a59-434b-8190-446539f6481e)


4. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi
tersebut dihapus, apa dampaknya?<br>
JAWAB:<br>
Pengecekan kondisi !cekkosong() pada method tampilkanBarang() dilakukan untuk memastikan bahwa tidak ada operasi yang mencoba untuk menampilkan barang jika gudang kosong.

Jika kondisi tersebut dihapus, dampaknya adalah bahwa method tampilkanBarang() akan selalu mencoba untuk menampilkan barang, bahkan jika gudang dalam keadaan kosong. Ini bisa menyebabkan output yang tidak diinginkan, seperti pesan yang tidak relevan atau kosong, atau mungkin terjadi error saat mencoba mengakses array tumpukan pada indeks yang tidak valid jika gudang kosong.

5. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat
barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
JAWAB:<br>
CONTOH CODE<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/11f8a849-57e3-4c0b-9f12-bbc5c91f3038)


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/01adf92d-d165-459a-be8c-9e81023784f1)

CONTOH OUTPUT<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/c360bd3a-b9fd-4b8a-825e-48f6b706d0c1)


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/c9d1d1c3-afd7-4e37-bada-e2c2afc223e4)




## LATIHAN PERCOBAAN 2

CONTOH CODE 1<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/0e849625-cd9a-4447-b212-23406a10f297)

CONTOH CODE 2<br>
Menambahkan perintah Println pada file gudang 21 


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/cb2e691b-173d-4e04-9097-416cb97d7e48)

CONTOH OUTPUT<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/66fba562-9d5a-4c62-b0f4-9d1ec44d187c)



## PERTANYAAN:


1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya!<br>
JAWAB:<br>
konversi ke biner dilakukan selama nilai kode tidak sama dengan nol. Setiap iterasi akan menghasilkan sisa dari pembagian kode dengan 2, dan sisa tersebut akan ditambahkan ke dalam stack. Kemudian, nilai kode akan dibagi dengan 2 untuk iterasi selanjutnya. Proses ini akan terus berlanjut hingga kode menjadi nol.<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/1b407ac3-78c4-402e-ad5e-12b1b8c723f9)


3. Jelaskan alur kerja dari method konversiDesimalKeBiner!<br>
JAWAB:<br>
Metode ConvertDecimalToBinary menerima satu parameter kode, yaitu nilai desimal yang dikonversi ke biner.Metode ini membuat objek StackConversion21 untuk menyimpan hasil pembagian yang tersisa dan melakukan konversi dalam urutan terbalik (sisa pembagian terendah ke tertinggi tertinggi ) .Selama nilai kodenya bukan nol, perulangan akan terus berlanjut. Dalam setiap iterasi:Sisa pembagian dengan dua kode dihitung menggunakan operator modulus (%) dan hasilnya disimpan dalam variabel sisa.Nilai yang tersisa dimasukkan ke tumpukan menggunakan metode push.Kemudian nilai kode dibagi dua, sehingga pada iterasi berikutnya Anda mendapatkan hasil sisa pembagian bawah.Ketika semua sisa pembagian dimasukkan ke dalam tumpukan dan nilai kode menjadi nol, proses ini selesai.Hasil konversi biner virus kemudian dicetak. Hal ini dilakukan dengan memunculkan tumpukan satu per satu hingga tumpukan tersebut kosong. Saat Anda muncul, nilai yang diambil dari tumpukan akan dicetak


## LATIHAN PERCOBAAN 3

CONTOH CODE 1<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/cdcbfcee-228c-451e-b972-1e420caed789)


CONTOH CODE 2<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/0c225abb-4dee-46f4-a91b-2ab754a94513)


CONTOH CODE 3<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/b0e6696c-d89a-4fcd-8341-fa0c3d87aead)


CONTOH OUTPUT<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/97377796-348a-40f3-a82a-9d01cd1648e4)



## PERTANYAAN:


1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return
value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?<br>
JAWAB<br>
Jika return value diubah dengan nilai yang berbeda untuk setiap case, maka metode ini akan memberikan prioritas yang berbeda untuk setiap operator. Misalnya, jika kita memberikan prioritas yang lebih tinggi untuk operator pangkat ^, maka kita dapat mengubah return value untuk case '^' menjadi 4. Ini berarti operator pangkat memiliki prioritas yang lebih tinggi daripada operator lainnya.
Perubahan seperti ini akan mempengaruhi cara ekspresi matematika dijalankan. Operator dengan prioritas yang lebih tinggi akan dievaluasi terlebih dahulu dalam ekspresi matematika, sesuai dengan urutan prioritas yang ditentukan dalam metode derajat.


2. Jelaskan alur kerja method konversi!<br>
JAWAB:<br>
Pemahaman Input: Tahap pertama adalah memahami input yang akan dikonversi. Ini melibatkan menentukan tipe data input dan formatnya.

Validasi Input: Memastikan bahwa input sesuai dengan persyaratan konversi. Misalnya, jika kita ingin mengonversi teks menjadi bilangan bulat, kita perlu memastikan bahwa teks yang dimasukkan dapat diinterpretasikan sebagai bilangan bulat.
Pemrosesan Input: Melakukan operasi untuk mengubah input ke dalam bentuk yang sesuai untuk konversi. Misalnya, jika input adalah string teks yang mengandung angka, kita mungkin perlu mengambil angka dari string tersebut.
Konversi: Melakukan konversi sesuai dengan aturan yang ditetapkan. Ini mungkin melibatkan penggunaan algoritma atau rumus matematika tergantung pada jenis konversi yang dilakukan.
Pengecekan Validitas Konversi Setelah konversi selesai, penting untuk memeriksa keabsahan hasil konversi. Ini bisa berarti memeriksa apakah hasil konversi dalam rentang yang valid atau memeriksa apakah hasilnya sesuai dengan ekspektasi.<br>

3. Pada method konversi, apa fungsi dari potongan kode berikut?<br>
JAWAB:<br>
fungsi yang mengubah angka menjadi karakter.
Kode tersebut bekerja dengan terlebih dahulu menetapkan nilai c ke 0. Kemudian, kode tersebut menggunakan metode charAt() pada objek Q untuk mengambil karakter pada indeks yang ditentukan oleh nilai c. Terakhir, kode tersebut mengembalikan nilai karakter.


## LATIHAN PRAKTIKUM

CONTOH CODE 1<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/5934cec7-d5ec-458c-bccc-b7b2681c9bbb)


CONTOH CODE 2<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/b8b1dfb6-aefa-409a-86f0-49657a794049)


CONTOH CODE 3<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/77818465-5dd2-409e-ad0b-5b30ee7732e5)


CONTOH OUTPUT<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/0dfbf79d-3c8e-48f4-bc42-4484e8254455)


>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
