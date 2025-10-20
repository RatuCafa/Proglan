package Modul_1;

import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class invalid_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka positif: ");
            int angka = sc.nextInt();

            if (angka <= 0) {
                throw new InvalidNumberException("Angka tidak valid! Harus positif.");
            }

            System.out.println("Valid, angka: " + angka);

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }

        sc.close();
    }
}

