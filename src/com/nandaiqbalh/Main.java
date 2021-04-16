package com.nandaiqbalh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t\t====================================");
        System.out.println("\t\t\t======= DATABASE KELOMPOK 28 =======");
        System.out.println("\t\t\t====================================");

        // Membuat Scanner untuk mengambil input dari user
        Scanner userInput = new Scanner(System.in);

        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            System.out.println("\nDATABASE KELOMPOK 28\n");
            System.out.println("1.\tNama dan NIM");
            System.out.println("2.\tAsal daerah");
            System.out.println("3.\tHobi");
            System.out.println("4.\tMedia sosial");

            System.out.print("\nPilihan anda [1-4] : ");
            pilihanUser = userInput.next();
        }
    }
}
