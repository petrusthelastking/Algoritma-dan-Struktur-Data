package MINGGU8C;
import java.util.Scanner;

public class PostfixMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p, Q;
        System.out.println("Masukkan Ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        Postfix21 post = new Postfix21(Q.length()); 
        try {
            p = post.konversi(Q);
            System.out.println("Postfix: " + p);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
