package ArrayBalok;

public class segitiga {

    public double alas;
    public double tinggi;

    public segitiga(double a, double t) {
        this.alas = a;
        this.tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    public static void main(String[] args) {
        segitiga[] sgArray = new segitiga[4];

        // Inisialisasi elemen-elemen sgArray
        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);

        // Menampilkan informasi setiap segitiga dalam sgArray
        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("sgArray ke-" + i + " Alas segitiga: " + sgArray[i].alas);
            System.out.println("sgArray ke-" + i + " Tinggi segitiga: " + sgArray[i].tinggi);
            System.out.println("sgArray ke-" + i + " Luas segitiga: " + Math.round(sgArray[i].hitungLuas()));
            System.out.println("sgArray ke-" + i + " Keliling segitiga: " + Math.round(sgArray[i].hitungKeliling()));
            System.out.println();
        }

        // Cetak luas dan keliling menggunakan looping
        System.out.println("Menggunakan Looping:");
        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("sgArray ke-" + i + " Luas segitiga: " + Math.round(sgArray[i].hitungLuas()));
            System.out.println("sgArray ke-" + i + " Keliling segitiga: " + Math.round(sgArray[i].hitungKeliling()));
            System.out.println();
        }
    }
}
