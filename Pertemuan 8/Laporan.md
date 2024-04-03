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


