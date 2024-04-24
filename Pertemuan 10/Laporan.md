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
pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang 
