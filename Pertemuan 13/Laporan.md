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
# WEEK 13 - Double Linked Lists
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 21<br>
Kelas : TI 1B

## PERCOBAAN 1

CODE 1<br>

![code1](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/595aa231-9912-4c26-b0d5-29378e680a62)

CODE 2<br>

![code2](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/b575c9e8-3ccb-456d-8512-a5acd7e27f9e)

CODE 3<br>

![code3](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/99144faf-1c7b-47bd-a6ab-70bc13400897)

CODE 4<br>

![code4](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/092f6cc6-509f-46d3-9504-671075c7f5ed)

OUTPUT DARI CODE DIATAS<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/bf540608-aedb-4b19-8d50-8260e7374e20)


## PERTANYAAN:

1. Jelaskan perbedaan antara single linked list dengan double linked lists!
JAWAB:<br>
- Single linked list lebih sederhana dan hemat memori, cocok untuk kasus di mana hanya diperlukan traversing satu arah.
- Double linked list lebih fleksibel dalam hal traversing dan manipulasi data, tetapi menggunakan lebih banyak memori karena menyimpan dua pointer tambahan per node.

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut 
tersebut?<br>
JAWAB:<br>
Atribut next dan prev adalah komponen kunci dari Doubly Linked List yang memungkinkan traversal dua arah dan operasi penyisipan/penghapusan yang efisien di mana saja dalam daftar.

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan 
size seperti pada gambar berikut ini?<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/db61e2cb-3c22-49d6-9409-0b1b329121c2)

JAWAB:<br>
- head = null
Inisialisasi ini dilakukan untuk memastikan bahwa saat instance dari DoubleLinkedLists pertama kali dibuat, daftar (list) tersebut dalam keadaan kosong. Atribut head menunjuk pada node pertama dalam linked list.
- size = 0
Inisialisasi ini dilakukan untuk mengatur ukuran (jumlah elemen) dari linked list menjadi nol saat instance dari DoubleLinkedLists pertama kali dibuat. Atribut size digunakan untuk melacak jumlah elemen dalam linked list. 

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev 
dianggap sama dengan null?<br>
JAWAB:<br>
- Pada metode addFirst(), inisialisasi prev dari node baru ke null adalah untuk menandai bahwa node tersebut adalah node pertama dalam linked list dan tidak ada node sebelumnya yang dapat dihubungkan melalui atribut prev. Ini adalah karakteristik penting dari node pertama dalam doubly linked list.
Node newNode = new Node(null, item, head);

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?<br>
JAWAB:<br>
- head.prev = newNode dalam metode addFirst() berfungsi untuk mengatur node yang sebelumnya menjadi head dari linked list agar menunjuk ke node baru sebagai node sebelumnya (prev).
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan 
parameter prev dengan current, dan next dengan null?
Node newNode = new Node(current, item, null);<br>
JAWAB:<br>
- method addLast() yang menggunakan objek Node dengan mengisikan parameter prev dengan current dan next dengan null, kita membuat node baru yang akan menjadi node terakhir dalam linked list. Ini dilakukan dengan mengaitkan node baru dengan node terakhir yang sudah ada, dan menetapkannya sebagai node terakhir dengan menetapkan next-nya menjadi null.
7. Pada method add(), terdapat potongan kode program sebagai berikut:<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f745a42e-9755-4839-9a31-43c3c3a8478b)
jelaskan maksud dari bagian yang ditandai dengan kotak kuning.<br>
JAWAB:<br>
- Baris pertama kode memeriksa apakah variabel current.prev bernilai null. Variabel current.prev menunjuk ke modul sebelumnya dalam daftar modul. Jika variabel current.prev bernilai null, maka modul baru akan menjadi modul pertama dalam daftar.prev: Referensi ke modul sebelumnya dalam daftar. Dalam kasus ini, variabel prev bernilai null karena modul baru adalah modul pertama dalam daftar.
item: Item yang disimpan dalam modul. Item ini dapat berupa nilai apa pun, seperti string, angka, atau objek.
next: Referensi ke modul berikutnya dalam daftar. Dalam kasus ini, variabel next bernilai null karena modul baru adalah modul terakhir dalam daftar.


## PERCOBAAN 2

CODE 1<br>
![code5](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7e95bacf-3f3e-4f13-8593-7ddccd7f73ce)


CODE 2<br>

![code6](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/cf3eaf48-a4ff-493d-b03b-0c1308a9b882)


OUTPUT DARI CODE DIATAS<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/4e914caf-5e08-4b17-842e-67ba8102fd2e)



## PERTANYAAN:

1. Apakah maksud statement berikut pada method removeFirst()?
head = head.next;
head.prev = null;
JAWAB:<br>
Pada metode removeFirst(), pernyataan head = head.next; bertujuan untuk memindahkan kepala dari linked list ke elemen berikutnya setelah kepala yang sekarang. Dengan kata lain, ini menghapus elemen pertama dari linked list dengan memindahkan kepala ke elemen berikutnya.
Selanjutnya, head.prev = null; mengatur referensi sebelumnya dari kepala ke null. Ini penting karena elemen baru yang menjadi kepala tidak memiliki elemen sebelumnya, sehingga referensi sebelumnya harus dihapus atau diatur menjadi null.
Secara keseluruhan, pernyataan ini mengubah kepala linked list menjadi elemen kedua dalam linked list, dan menghapus hubungan sebelumnya dari elemen pertama ke elemen kedua tersebut.

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?<br>
JAWAB:
- dengan memeriksa nilai atribut next dari node current, jika nilai atribut next dari node current adalah null. maka node current adalah node terakhir dalam list.
- memeriksa nilai atribut size dari list, jika nilai atribut size dari list adalah 1. maka node curent adalah node terakhir dalam list.

3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f0b9d337-0595-40ea-a515-6aaebe2050e9)
JAWAB:<br>
karena kode tersebut hanya memperberui pointer node head, tetapi tidak memperbarui pointer prev dari node head dan pointer next dari node yang dihapus.

5. Jelaskan fungsi kode program berikut ini pada fungsi remove!<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/e02522ec-fdaf-4c25-82a3-af20a06bda59)
JAWAB:<br>

- Statement current.prev.next = current.next; digunakan untuk memperbarui pointer next dari node sebelumnya dari node yang dihapus agar menunjuk ke node berikutnya dari node yang dihapus.
- Statement current.next.prev = current.prev; digunakan untuk memperbarui pointer prev dari node berikutnya dari node yang dihapus agar menunjuk ke node sebelumnya dari node yang dihapus.



## PERCOBAAN 3

CODE 1<br>

![code5](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a78e671d-22de-4f30-9566-e67ecaa4fb00)

CODE 2<br>

![code6](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/12fd975c-e7e0-4039-9333-faa0c3c13659)


## PERTANYAAN:

1. Jelaskan method size() pada class DoubleLinkedLists!<br>
JAWAB:<br>
Metode size() dalam kelas DoubleLinkedLists bertujuan untuk mengembalikan jumlah elemen yang ada dalam linked list pada saat itu. Ini memberikan informasi tentang seberapa besar linked list pada saat itu, yang berguna untuk memantau jumlah elemen yang dimasukkan, dihapus, atau diakses dalam linked list.

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1!
JAWAB:<br>
Pada method removeLast(), posisi data ada pada bagian akhir dapat dideteksi dengan cara:
- Memeriksa nilai atribut next dari node current: Jika nilai atribut next dari node current adalah null, maka node current adalah node terakhir dalam list.
- Memeriksa nilai atribut size dari list: Jika nilai atribut size dari list adalah 1, maka node current adalah node terakhir dalam list.
  
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!
JAWAB:<br>
Potongan kode program di atas tidak cocok untuk perintah remove karena kode tersebut hanya memperbarui pointer next dari node head dan pointer prev dari node berikutnya dari node head, tetapi tidak memperbarui pointer prev dari node head dan pointer next dari node yang dihapus.

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f44363a8-4bbe-431a-a852-3be386d7e03d)

JAWAB:<br>
Kode program di atas pada fungsi remove digunakan untuk memperbarui pointer next dan prev dari node-node yang berdekatan dengan node yang dihapus.
- Statement current.prev.next = current.next;: Statement ini digunakan untuk memperbarui pointer next dari node sebelumnya dari node yang dihapus agar menunjuk ke node berikutnya dari node yang dihapus.
- Statement current.next.prev = current.prev;: Statement ini digunakan untuk memperbarui pointer prev dari node berikutnya dari node yang dihapus agar menunjuk ke node sebelumnya dari node yang dihapus.


## TUGAS 1

CODE <br>
![code14](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/78dfa289-5dbb-4c27-8abd-2764163d9659)
![code13](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/87fd883b-e02e-4728-b26b-d4bc6b4bc5b6)
![code12](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/f84eb05e-3f13-45db-a923-6ca6ceea7877)
![code11](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/d10b4113-de0e-4f4a-8e3f-0ca741901578)
![code10](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/b60cfa0e-49ea-4f77-94a6-54a03063940a)
![code9](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/243fc412-abbd-400d-b449-db8d9d9e3c60)


## TUGAS 2

![code19](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/805b8df3-392b-4742-93f4-20bbe181e150)
![code18](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/bfd6ac9d-31e5-407d-b465-41b2d13f6ee8)
![code17](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/17771e39-9333-47f3-8f50-9b256c7702f1)
![code16](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/1482503f-2868-4e34-b25b-3c267a5fea34)
![code15](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/5de8cb49-59a0-43c1-9831-ba40ba2d75d4)

>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
