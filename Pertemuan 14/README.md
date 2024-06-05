# WEEK 14 - Tree
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 22<br>
Kelas : TI 1B

## PRAKTIKUM 1

![code25](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/2c7818a2-fe81-40dd-8642-f5a5df753241)

![code24](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/4fcae230-7f47-418a-bf1f-786cba68240a)

![code23](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/58d2ff80-feea-44a6-861f-11c3f29d9a9b)

![code22](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/260e832c-b647-4198-820b-85530c70b7e0)

![code21](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/c6566140-aea3-41bf-a4ed-64dcd309608e)

![code20](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7d7ee37e-9f0d-42b2-8590-94d84a311fe9)


## PERTANYAAN:
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding 
binary tree biasa?<br>
JAWAB:<br>
karena BST memiliki struktur yang lebih terorganisir berdasarkan nilai data. Struktur tersebut memungkinkan algoritma pencarian untuk membagi ruang pencaian secara efisien dengan membuang setengah kemungkinan pada setiap langkah
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?<br>
JAWAB:<br>
left untuk menunjuk ke node anak kiri node saat ini dan right untuk menunjuk node anak kanan dari node saat ini
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?<br>
JAWAB:<br>
root adalah null
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?<br>
JAWAB:<br>
Pengecekan Apakah Tree Kosong:

Program mengecek apakah tree kosong dengan memeriksa apakah root adalah null menggunakan metode isEmpty().
Inisialisasi Node Baru sebagai Root:

Jika tree kosong (root == null), maka node baru yang akan ditambahkan akan menjadi root dari tree tersebut.
Penugasan Node Baru ke Root:

Node baru dengan data yang diberikan dibuat dan diinisialisasi, kemudian ditetapkan sebagai root.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan 
secara detil untuk apa baris program tersebut?
if(data<current.data){
 if(current.left!=null){
 current = current.left;
 }else{
 current.left = new Node(data);
 break;
 }
}

JAWAB:<br>
 blok kode ini adalah bagian dari logika untuk menambahkan node baru ke dalam Binary Search Tree. Khususnya, ini menangani kasus di mana nilai data baru lebih kecil dari nilai data pada node saat ini (current). Jika ada tempat kosong di subtree sebelah kiri, node baru akan ditempatkan di sana; jika tidak, proses traversal berlanjut ke node berikutnya di sebelah kiri hingga menemukan posisi yang tepat untuk node baru.



## PRAKTIKUM 2

![code27](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/1e387720-01b2-439b-afb4-6a5416a5191b)

![code26](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/db19ab26-f377-4ecd-baec-dfcb713cad01)


## PERTANYAAN:

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?<br>
JAWAB:<br>
atribut data digunakan untuk menyimpan data data dalam array dan idxLast berguna untuk mencatat index terakhir yang digunakan dalam array
2. Apakah kegunaan dari method populateData()?<br>
JAWAB<br>
untuk mengisi array data
3. Apakah kegunaan dari method traverseInOrder()?<br>
JAWAB:<br>
untuk melakukan tranversal pada binary tree array dengan urutan in-order
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi 
left child dan rigth child masin-masing?<br>
JAWAB:<br>
Left child: Posisi left child dari node dengan indeks 2 adalah 2 * 2 + 1 = 5. Right child: Posisi right child dari node dengan indeks 2 adalah 2 * 2 + 2 = 6. Formula umum untuk menghitung indeks left child dan right child dalam binary tree array adalah: Left child: 2 * index + 1 Right child: 2 * index + 2

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?<br>
JAWAB:<br>
untuk menginisialisasi nilai atribut idxlast


## TUGAS 

Code 1
![code28](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/a4869f58-79a3-448f-9ece-0acc9b443bbc)


Code 2

![code29](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/fbf19fdd-4c9a-496e-9820-11f57d9d143b)

Code 3

![code30](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8de06f76-2647-4044-bd1c-079e26f2abcb)

Code 4

![code31](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/3295a345-53c6-478d-a368-9d33e3ac51fb)

Code 5

![code32](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/c384685d-35e3-4367-8858-97ef5f781648)

Code 6

![code34](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/02d814cb-468f-4ce7-8325-b34cc20ec890)


![code33](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/7b36641f-9b06-4b82-a854-5f924e1c40f9)

