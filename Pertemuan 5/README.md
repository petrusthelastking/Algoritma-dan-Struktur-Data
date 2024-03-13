# WEEK 05 - BRUTE FORCE DAN DIVIDE CONQUER
Nama: Petrus Tyang Agung Rosario<br>
Nim : 2341720227 <br>
Absen : 22<br>
Kelas : TI 1B

## PRAKTIKUM 1
Contoh code 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/3c020648-5480-4adb-9ced-52b777b5f1b5)

Contoh Code 2<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/722c4f41-c5d0-4783-bd26-8bf05c87e30e)


Contoh Outputnya<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/34b65b34-e5cc-40a1-897d-16e6094f4947)


##PERTANYAAN
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else!<br>
JAWAB:<br>
perbedaan dalam penggunaan if dan else dapat mempengaruhi bagaimana algoritma beroperasi terutama dalam hal bagaimana algoritma membagi masalah menjadi submasalah dan bagaimana submasalah tersebut digabungkan kembali.

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan!<br>
JAWAB:<br>
Ya, memungkinkan untuk merubah perulangan pada method faktorialBF() selain menggunakan for menggunakan pendekatan rekursif.<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8dcb9f85-6ada-4579-a906-49420dca5b8b)


5. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

perbedaan utama antara keduanya adalah bahwa yang pertama menggunakan perulangan untuk mengakumulasi hasil perkalian, sedangkan yang kedua menggunakan rekursi untuk memecah masalah dan menghitung faktorial.


## PRAKTIKUM 2
Contoh Code 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/af390c71-4c09-4ba1-bb95-0517823664db)


Contoh Code 2<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/cc52e2d4-2e45-4f2d-ad03-6295e865ee04)


Contoh Output<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/1844b47e-b72b-481f-a46c-f4bca9f3f06a)



# PERTANYAAN 

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!<br>
JAWAB:<br>
perbedaan utama antara keduanya adalah dalam pendekatan perhitungan: PangkatBF() menggunakan pendekatan iteratif sederhana, sementara PangkatDC() menggunakan pendekatan rekursif yang memanfaatkan sifat-sifat matematis untuk mengurangi jumlah operasi yang diperlukan.

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!<br>
JAWAB:<br>
![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/09e22e81-be6e-484a-af77-2da5c3bb8aa3)

3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.<br>
JAWAB:<br>

![12345](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/ab510a90-2bcf-4b02-b96c-50ed2d7c14c6)


![123456](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/bdc0be00-9fe3-4092-bc04-c680c88f733c)


4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case!<br>
JAWAB:<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/8d5297fa-1dcd-45de-bf55-fa97c94d37e5)



## PRAKTIKUM 3
Contoh Code 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/68dbf4f5-b13d-4d35-a6a6-6bbdac04703b)


Contoh Code 2<br>


![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/25312943-354c-42b8-9194-8c7d4b8ddcc6)



## PERTANYAAN


1. Mengapa terdapat formulasi return value berikut?Jelaskan!<br>
JAWAB:<br>
Formulasi return value digunakan untuk menghitung jumlah elemen dalam array dengan menggunakan algoritma divide-and-conquer.

3. Kenapa dibutuhkan variable mid pada method TotalDC()? <br>
JAWAB:<br>
penggunaan variabel mid dalam metode TotalDC() sangat tergantung pada konteks dan implementasi spesifik dari metode tersebut.

4. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program!<br>
JAWAB:<br>

public class mainSum_26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc26.nextInt();
        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = sc26.nextInt();

        double[][] keuntunganPerusahaan = new double[jumlahPerusahaan][jumlahBulan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1) + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan bulan " + (j + 1) + " (dalam juta): ");
                keuntunganPerusahaan[i][j] = sc26.nextDouble();
            }
        }

        for (int i = 0; i < jumlahPerusahaan; i++) {
            double totalKeuntungan = 0;
            for (int j = 0; j < jumlahBulan; j++) {
                totalKeuntungan += keuntunganPerusahaan[i][j];
            }
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " adalah: " + totalKeuntungan + " juta");
        }

        sc26.close();
    }
}


## Latihan Praktikum
Contoh code 1<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/3d11ae9d-abef-4bd9-ba81-eafc1d80f386)


Contoh Code 2<br>

![image](https://github.com/petrusthelastking/Algoritma-dan-Struktur-data/assets/143620112/ea8e59df-89ab-47a8-9a1e-ce216095ba9c)
