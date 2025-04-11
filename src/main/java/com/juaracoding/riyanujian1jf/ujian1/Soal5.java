package com.juaracoding.riyanujian1jf.ujian1;


import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Harga tiket film 1: ");
        int hargaFilm1 = input.nextInt();
        System.out.print("Harga tiket film 2: ");
        int hargaFilm2 = input.nextInt();
        System.out.print("Harga tiket film 3: ");
        int hargaFilm3 = input.nextInt();
        System.out.print("Harga tiket film 4: ");
        int hargaFilm4 = input.nextInt();
        System.out.print("Harga tiket film 5: ");
        int hargaFilm5 = input.nextInt();
        input.close();
        int total = hargaFilm1 + hargaFilm2 + hargaFilm3 + hargaFilm4 + hargaFilm5;
        System.out.println("Total harga tiket: " + total);



    }
}
