package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Masukkan Jumlah Elemen");
        int iJml = sc.nextInt();
        Faktorial[] fk = new Faktorial[iJml];
        for(int i=0; i < iJml; i++){
            System.out.println("Masukkan Nilai Data Ke-" +(i+1)+":");
            int iNilai = sc.nextInt();
            fk[i] = new Faktorial(iNilai);
        }
        System.out.println("Hasil - BRUTE FORCE");
            for(int i=0; i < iJml;i++){
            System.out.println("Hasil Perhitungan Faktorial Menggunakan Brute Force Adalah " + fk[i].FaktorialBF());
}

        System.out.println("Hasil - DIVIDE AND CONQUER");
            for(int i=0; i < iJml;i++){
            System.out.println("Hasil Perhitungan Faktorial Menggunakan Divide and Conquer " + fk[i].FaktorialDC());
}

}
}
