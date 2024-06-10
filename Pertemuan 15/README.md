# WEEK 15 - Graph
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 21<br>
Kelas : TI 1B

## PRAKTIKUM 1

![code42](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/5b40f9b8-eab1-4125-b84f-ed75e423574f)

![code35](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/e2175a01-71f6-4379-bb63-b203b63839ec)

![code36](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7c43a473-7b1a-445b-8f8a-7da85459e8c7)

![code37](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/04e3bcc1-e5e0-4612-a85b-8b7e31d6c7db)

![code38](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/5e30412c-8104-4dfe-8f87-51ad0ef0777c)

![code39](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/10c1e2ad-b48d-49ca-accb-ee8f28b9bb86)

![code40](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/76ffb1d1-02c9-4a74-9c98-d3625698abe4)

![code41](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/ecbeca09-bb71-461e-b089-474bc9a04a09)



## PERTANYAAN 1

1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!<br>
JAWAB:<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/2eb1124a-1773-45fb-b26f-203cb1e8fe2a)

2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan
variabel tersebut!<br>
JAWAB:<br>

1. Merepresentasikan Struktur Graph: Dalam konteks graph, list[] biasanya digunakan untuk merepresentasikan adjacency list. Setiap elemen dalam array list (yang mungkin merupakan array atau daftar lainnya) akan merepresentasikan sebuah node atau vertex dalam graph, dan DoubleLinkedList pada masing-masing elemen tersebut akan merepresentasikan daftar dari node-node tetangga (atau edge) yang terhubung ke node tersebut.

2. Efisiensi dalam Penyimpanan dan Akses Data: Penggunaan DoubleLinkedList memungkinkan penyimpanan data yang lebih efisien dibandingkan menggunakan struktur data seperti array sederhana, terutama jika graph bersifat sparse (memiliki sedikit edge dibandingkan dengan jumlah node). DoubleLinkedList memungkinkan operasi penambahan dan penghapusan node yang lebih efisien, dengan kompleksitas waktu rata-rata O(1) untuk operasi tersebut.

3. Navigasi Dua Arah: Dengan menggunakan DoubleLinkedList, setiap node dalam daftar memiliki pointer ke node sebelumnya dan node berikutnya. Ini memungkinkan navigasi dua arah yang lebih fleksibel dan efisien dalam traversal dan modifikasi adjacency list, yang bisa sangat berguna dalam beberapa algoritma graph.

3. Jelaskan alur kerja dari method removeEdge!<br>
JAWAB<br>
1. Pengecekan Input: Method removeEdge biasanya menerima dua parameter yang merepresentasikan dua node atau vertex dalam graph, katakanlah src (sumber) dan dest (tujuan). Langkah pertama adalah memvalidasi bahwa kedua node tersebut ada dalam graph. Jika salah satu dari node tersebut tidak ada, method dapat mengembalikan pesan kesalahan atau melakukan tidak ada tindakan lebih lanjut.

2. Navigasi ke Node Sumber: Akses ke node sumber (src) dalam list[]. Misalkan list[src] adalah DoubleLinkedList yang merepresentasikan adjacency list dari node src.

3. Pencarian Node Tujuan: Dalam DoubleLinkedList yang merepresentasikan adjacency list dari node src, carilah node yang merepresentasikan dest. Ini biasanya dilakukan dengan iterasi melalui elemen-elemen dalam DoubleLinkedList.

4. Penghapusan Node Tujuan: Setelah menemukan node yang merepresentasikan dest, hapus node tersebut dari DoubleLinkedList. Karena DoubleLinkedList memungkinkan operasi penghapusan dalam O(1) waktu setelah node ditemukan, operasi ini bisa dilakukan dengan cepat. Penghapusan node dari DoubleLinkedList melibatkan penyesuaian pointer dari node sebelumnya dan node berikutnya untuk melewatkan node yang dihapus.


4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add
jenis lain saat digunakan pada method addEdge pada class Graph?<br>
JAWAB:<br>
1. Pengecekan Input: Method removeEdge biasanya menerima dua parameter yang merepresentasikan dua node atau vertex dalam graph, katakanlah src (sumber) dan dest (tujuan). Langkah pertama adalah memvalidasi bahwa kedua node tersebut ada dalam graph. Jika salah satu dari node tersebut tidak ada, method dapat mengembalikan pesan kesalahan atau melakukan tidak ada tindakan lebih lanjut.

2. Navigasi ke Node Sumber: Akses ke node sumber (src) dalam list[]. Misalkan list[src] adalah DoubleLinkedList yang merepresentasikan adjacency list dari node src.

3. Pencarian Node Tujuan: Dalam DoubleLinkedList yang merepresentasikan adjacency list dari node src, carilah node yang merepresentasikan dest. Ini biasanya dilakukan dengan iterasi melalui elemen-elemen dalam DoubleLinkedList.

4. Penghapusan Node Tujuan: Setelah menemukan node yang merepresentasikan dest, hapus node tersebut dari DoubleLinkedList. Karena DoubleLinkedList memungkinkan operasi penghapusan dalam O(1) waktu setelah node ditemukan, operasi ini bisa dilakukan dengan cepat. Penghapusan node dari DoubleLinkedList melibatkan penyesuaian pointer dari node sebelumnya dan node berikutnya untuk melewatkan node yang dihapus.

5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara
suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner).<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/04722ca0-73b8-418d-a1c6-22a5db97127f)

jawab

![code46](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/712f6e2f-39d1-4fc0-8764-9e03d912eeed)

![code45](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/350f8710-1b24-423b-aeb3-d920ef734fb9)

![code44](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/823d3db9-dad6-4eea-bc4c-b22f4d6aa4be)

![code43](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/44b8136e-97fe-4497-9ec9-2d6e15e73964)


OUTPUT<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/6f57b60b-1886-48b5-b1e0-247fe3ef9333)


## PRAKTIKUM 2

![code47](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/4e8a9137-d595-4ddb-95ce-2f22399cbc90)


## PERTANYAAN 2

1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!<br>
JAWAB:<br>
![code48](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/bd769eab-95db-40e0-81e7-eb8a0e6eb1fc)

2. Apa jenis graph yang digunakan pada Percobaan 2?<br>
JAWAB:<br>
jenis graph berbentuk Matriks yang direpresentasikan menggunakan matriks adjacency. Setiap elemen matriks menyimpan nilai jarak antara dua simpul yang terhubung.

3. Apa maksud dari dua baris kode berikut?<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7b4e2ad9-a1bc-4bf9-837b-63df8496c981)
JAWAB:<br>
digunakan untuk menambahkan edge antara simpul 1 dan 2 dengan jarak masing-masing 70 dan 80
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk
inDegree dan outDegree!
JAWAB:

![code49](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/93033abd-f62c-4bca-8e09-ca33ef06a467)



## LATIHAN PRAKTIKUM

1. Soal Pertama
![code50](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a24e9c20-f8fc-4ea0-bb17-1c7e1c2f2ddc)

![code52](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7bea468f-b36d-4705-a9e9-f441cf548dbe)

![code51](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/98db81e6-dfa8-4063-ab64-7263d3b984e5)


2. Soal 2
public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
        Node21 current = list[asal].getHead();
        while (current != null) {
            if (current.data == tujuan) {
                current.jarak = jarak;
                break;
            }
            current = current.next;
        }
    }


3 soal 3

![code53](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7a525ba3-8aee-4460-9b4d-f337c69d8882)


