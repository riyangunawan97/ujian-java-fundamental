package com.juaracoding.riyanujian1jf.ujian1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama film : ");
        String namaFilm = input.next();
        System.out.print("Masukan harga tiket: ");
        int hargaTiket = input.nextInt();
        System.out.print("Masukan jumlah tiket: ");
        int jumlahTiket = input.nextInt();
        input.close();

        System.out.println("Nama Film: " + namaFilm);
        System.out.println("Harga Tiket: " + hargaTiket);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
    }
}
