package Modul_1;

import java.util.Scanner;

public class informal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = sc.nextInt();

        String status;
        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        System.out.println("Nama: " + nama + ", Status: " + status);

        sc.close();
    }
}

