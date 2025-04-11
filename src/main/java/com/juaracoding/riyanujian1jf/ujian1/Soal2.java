package com.juaracoding.riyanujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Film : ");
        String namaFilm = input.next();
        input.close();
        System.out.println("Nama film dalam huruf besar: " + namaFilm.toUpperCase());
    }
}
