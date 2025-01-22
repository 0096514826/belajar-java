import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);
        
        // Meminta user memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        
        // Mengecek apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka tersebut adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka tersebut adalah negatif.");
        } else {
            System.out.println("Angka tersebut adalah nol.");
        }
        
        // Menutup scanner
        scanner.close();
    }
}
