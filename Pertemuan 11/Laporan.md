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
# WEEK 12 - LINKED LIST
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 21<br>
Kelas : TI 1B

## PRAKTIKUM 1

Node.java<br>

![pertemuan 11 (1)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/b9c9a4ad-d593-4add-a0b2-8816f82a3833)

SingleLinkedList.java<br>

![pertemuan 11 (2)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/0597eaad-bb57-4642-ac16-ff09e4e05d57)


![pertemuan 11 (3)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/73638dfb-365a-4e23-83c5-972eb8439ca2)

SLLMain.java<br>

![pertemuan 11 (4)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/558604ad-0ff3-43b9-bfbb-47f8e07fa3fe)



## PERTANYAAN


1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?<br>\
   JAWAB:<br>
   pesan "Linked List Kosong" dicetak pada baris pertama hasil kompilasi karena implementasi metode print() tidak memeriksa apakah head adalah null sebelum mencoba mencetak elemen-elemen dalam linked list. Karena head belum ditetapkan ke node apa pun saat objek SingleLinkedList pertama kali dibuat di main() metode di kelas SLLMain, kondisi isEmpty() yang sebenarnya harusnya mengecek apakah linked list kosong atau tidak, tidak berfungsi sebagaimana mestinya<br>

2. Jelaskan kegunaan variable temp secara umum pada setiap method!<br>
   JAWAB:<br>
Variabel temp umumnya digunakan sebagai variabel sementara untuk menyimpan referensi ke node saat melakukan operasi pada linked list. Ini digunakan karena seringkali kita perlu mengubah pointer atau melakukan iterasi melalui linked list tanpa mengubah pointer asli yang menunjuk ke awal atau elemen khusus lainnya dalam linked list.<br>

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut<br>
   JAWAB<br>
kode tersebut berfungsi untuk memperbarui pointer tail pada linked list saat ada node baru yang disisipkan di akhir list. Ini penting untuk memastikan keakuratan struktur linked list dan memungkinkan akses cepat ke node terakhir dalam list.<br>


## PRAKTIKUM 2


![pertemuan 11 2 (5)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/542ab646-25e9-4ef1-a138-4c22a1f97470)

![pertemuan 11 2 (4)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/6091f324-1205-4fda-b264-8c59fb97350d)

![pertemuan 11 2 (3)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/876ec6df-0a84-4549-a509-e1601b4eb678)

![pertemuan 11 2 (2)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/599efa6f-da02-4b4d-a367-d5f8ce36a5f2)
\
![pertemuan 11 2 (1)](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/9e94bf30-af3d-4efa-bec4-132bac5e1ba0)


## PERTANYAAN

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!<br>
   JAWAB:<br>
penggunaan keyword break dalam metode remove(int key) digunakan untuk menghentikan iterasi atau perulangan loop saat elemen yang ingin dihapus telah ditemukan dan dihapus. Hal ini memastikan bahwa setelah tindakan penghapusan dilakukan, program tidak perlu lagi melanjutkan iterasi, sehingga meningkatkan efisiensi. Dengan kata lain, break memungkinkan keluar dari loop setelah tindakan penghapusan dilakukan, sehingga menghindari pengecekan yang tidak perlu dan menjaga kinerja program.<br>

2. Jelaskan kegunaan kode dibawah pada method remove<br>
   JAWAB:<br>
kode yang diberikan merupakan bagian dari method remove pada linked list di Java. Fungsinya untuk menghapus elemen tertentu dari linked list dengan cara melewatkan (skip) elemen tersebut dan menghubungkan elemen sebelumnya langsung ke elemen setelahnya.  Dengan kata lain, elemen yang memiliki data sama dengan key akan dihapus dari linked list.<br>


## TUGAS 1

![5555](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/d80a9b18-da98-4115-9fe3-d80cf1f680ad)


![4444](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/965fb5bf-4985-43e4-9089-26d130ea3acc)


![3333](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/011cff1a-5aec-458a-a406-9e1be0c03279)


![2222](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/67e7f20e-2f3e-473d-aa67-62a1116d6ea7)


![1111](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f2b2fe11-bca8-4df8-8137-183167e297ea)


OUTPUT


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8150a79e-9544-45b0-bbbb-fec54fe89846)


## TUGAS 2

![9999](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/914b30b6-713c-4462-be6f-6f1375c7e68b)


![8888](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/e756497a-d15a-4352-909b-477f31be2bc5)


![7777](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8cc975fd-1b0e-41b2-83b9-7bb9e5e2ce04)


![6666](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8ab3563d-87e1-40fd-b86e-7a06c9d0a264)



OUTPUTNYA<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/2aa1ec7d-f86e-4889-b1ca-448b688ceee6)
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
