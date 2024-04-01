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

