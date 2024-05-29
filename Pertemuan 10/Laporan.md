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
# WEEK 10 - QUEUE
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 21<br>
Kelas : TI 1B

## CODE PERCOBAAN 1

# Queue

![10](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/20c9d971-e495-49ef-866b-1ba63b9bcfb8)



![9](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/9e5b54a3-22b0-40f7-a90d-4e1898c940a5)



![8](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/2297ccd6-84ed-4eb0-95e8-555ce19a6d1a)


# QueueMain

![12](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/6f9c2f70-591c-42b8-b89d-b698d556a2af)



![11](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/fd107be6-71c1-4cff-90e3-85186b8b3480)



## PERTANYAAN
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?<br>
JAWAB<br>
Pada konstruktor kelas Queue, atribut front dan rear diberi nilai -1 untuk menandakan bahwa antrian (queue) pada awalnya kosong. konvensi umum dalam implementasi antrian menggunakan array di mana ketika front dan rear sama-sama -1, menunjukkan bahwa tidak ada elemen dalam antrian.

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>
JAWAB<br>
menangani kondisi ketika rear (penunjuk belakang) mencapai nilai maksimal (max - 1). Dalam konteks queue, rear menunjuk ke elemen terakhir dalam queue. Nilai maksimal (max) adalah batas kapasitas queue dan kegunaan nya Ketika rear mencapai nilai maksimal, artinya queue telah penuh dan tidak dapat lagi menampung elemen baru.

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>
JAWAB<br>
- Kode ini memeriksa apakah nilai variabel front sama dengan max - 1.
- Jika benar, maka kode ini akan mengubah nilai front menjadi 0.
dan kegunaannya
Kode ini digunakan untuk mengatur ulang indeks front ketika elemen terakhir dari antrian telah dikeluarkan.
Hal ini diperlukan karena antrian menggunakan array melingkar untuk menyimpan elemen-elemennya.
Array melingkar adalah array yang dapat diakses dari kedua ujungnya.
Dalam antrian, elemen pertama (yang akan dikeluarkan pertama kali) diwakili oleh indeks front, dan elemen terakhir (yang akan dikeluarkan terakhir kali) diwakili oleh indeks max - 1.

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?<br>
JAWAB<br>
Pada method print, perulangan dimulai dari nilai front karena nilai front menunjukkan indeks dari elemen pertama dalam antrian. Dengan memulai perulangan dari front, kita dapat mencetak semua elemen dalam antrian secara berurutan, sesuai dengan urutan penyimpanan mereka dalam array.
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!<br>
JAWAB<br>
metode cetak yang digunakan untuk mencetak string angka. Namun, metode cetak tidak digunakan dalam potongan kode yang Anda berikan. Sebaliknya, potongan kode tersebut menggunakan operator bitwise untuk menghitung nilai maksimum dari dua angka.

6. Tunjukkan potongan kode program yang merupakan queue overflow!<br>
JAWAB<br>

![111](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/38a6f17c-2470-40ee-9326-5e500d67c82e)


7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!<br>
JAWAB<br>

![222](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/580b9482-92e6-4518-9ec2-34772151c616)


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/ce3320f7-dda9-43a3-9fae-d38b27b1edfe)



## CODE PERCOBAAN 2

# Nasabah

![5](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/cf134d0f-28bf-4788-a815-6d3fdafc104f)



![4](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8f81c3e7-56c6-446a-aaca-034c7874a3c8)



![3](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/64a7e138-7147-4cd4-890c-981b80bf165a)


# QueueMain

![7](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/84f64cd4-4614-4d63-849d-bd5bf1f52ea0)



![6](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/23c5e45f-321a-4f06-8856-e7a681311be5)



## PERTANYAAN

1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!<br>
JAWAB<br>
Fungsi IF pada potongan kode program QueueMain berfungsi untuk memastikan bahwa data yang dikeluarkan dari antrian memiliki informasi yang lengkap dan valid. Hal ini penting untuk menjaga kualitas data dan mencegah kesalahan dalam pengolahan data.

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!<br>
JAWAB<br>

![555](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f2db6a32-0c98-49ce-9158-15a668fd773b)



![444](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f0f6a42a-4b63-4280-a9d1-c5e731f7593e)



![333](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/b55bde07-624c-4337-ab9c-b2cf9df4ecb8)


## TUGAS

1 Buatlah program antrian untuk mengilustasikan pesanan disebuah warung. Ketika seorang
pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang<br>

# CONTOH PERCOBAAN DARI CODE DIATAS

![21](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/133d9876-acdc-4f6a-86d2-22197a7a91a1)



![20](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a29ec2a1-766e-4985-bdff-940198760888)



![19](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/5b7c8e27-9e11-41c4-9f57-96e30459a511)



![18](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/78707dad-3127-4484-a12e-29ea9ad80632)



![17](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a107efcf-4246-4220-a0e7-53381371d266)



![16](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/0bef1a68-c284-4628-9f33-68daafe7cf34)



# CONTOH PERCOBAAN DARI CODE DIATAS

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/37473125-ed2a-465f-88bc-e0d24c45b1fa)



![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/0c83e101-e393-4539-8074-26e781c61f2d)



![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/23261948-29c6-4147-abaf-82e512a81a64)



![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/b9029a20-2b84-4720-84f0-ab7006fcb580)
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
