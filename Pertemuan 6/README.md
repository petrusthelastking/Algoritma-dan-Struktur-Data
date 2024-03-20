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
