package com.juaracoding.ujian1;


import java.util.ArrayList;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> prices = new ArrayList<Integer>();
        int total = 0;
        System.out.print("Harga tiket film 1: ");
        int hargaFilm1 = input.nextInt();
        prices.add(hargaFilm1);
        System.out.print("Harga tiket film 2: ");
        int hargaFilm2 = input.nextInt();
        prices.add(hargaFilm2);
        System.out.print("Harga tiket film 3: ");
        int hargaFilm3 = input.nextInt();
        prices.add(hargaFilm3);
        System.out.print("Harga tiket film 4: ");
        int hargaFilm4 = input.nextInt();
        prices.add(hargaFilm4);
        System.out.print("Harga tiket film 5: ");
        int hargaFilm5 = input.nextInt();
        prices.add(hargaFilm5);
        input.close();
        for (int i = 0; i < prices.size(); i++) {
            total = total + prices.get(i);
        }

        System.out.println("Total harga tiket: " + total);



    }
}
