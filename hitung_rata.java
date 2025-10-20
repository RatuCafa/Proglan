package Modul_1;

import java.util.Scanner;
// perubahan setelah di edit
public class hitung_rata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka");
        int n = scanner.nextInt();

        int[] angka = new int[n];
        System.out.println("Masukkan angka-angka:");
        for (int i = 0; i < n; i++){
            angka[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 1; i < n; i++){
            total += angka[i];
        }

//        int total = 0;
//        for (int i = 0; i < n; i++){
//            total += angka[i];
//        }
//
        double ratarata = (double) total / n;
        System.out.println("Rata-rata adalah:" + ratarata);
    }
}
