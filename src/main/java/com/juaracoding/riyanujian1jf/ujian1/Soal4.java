package com.juaracoding.riyanujian1jf.ujian1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> films = new ArrayList<String>();
        System.out.println("Daftar film bioskop ");
        System.out.print("Masukan nama film 1: ");
        String namaFilm1 = input.next();
        films.add(namaFilm1);
        System.out.print("Masukan nama film 2: ");
        String namaFilm2 = input.next();
        films.add(namaFilm2);
        System.out.print("Masukan nama film 3: ");
        String namaFilm3 = input.next();
        films.add(namaFilm3);
        System.out.print("Masukan nama film 4: ");
        String namaFilm4 = input.next();
        films.add(namaFilm4);
        System.out.print("Masukan nama film 5: ");
        String namaFilm5 = input.next();
        films.add(namaFilm5);
        input.close();
        System.out.println("Daftar film ditonton: ");
        for (int i = 0; i < films.size(); i++) {
            System.out.println(i+1 +". " + films.toArray()[i]);
        }
    }
}
