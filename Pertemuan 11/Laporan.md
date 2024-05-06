# WEEK 02 - OBJEK
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

