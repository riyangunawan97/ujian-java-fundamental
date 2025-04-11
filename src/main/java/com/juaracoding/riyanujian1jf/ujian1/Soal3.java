package com.juaracoding.riyanujian1jf.ujian1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] day = {"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
        System.out.print("Masukan hari pembelian (Weekend Jumat,Sabtu,Minggu): ");
        String hari = input.next();
        boolean cekHari= Arrays.asList(day).contains(hari.toLowerCase());
        if (!cekHari){
            System.exit(0);
        }
        System.out.print("Masukan jumlah tiket: ");
        int jumlahTiket = input.nextInt();
        input.close();
        int total = 0;
        int harga = 0;
        if (hari.equalsIgnoreCase("jumat")||
            hari.equalsIgnoreCase("sabtu")||
            hari.equalsIgnoreCase("minggu")){
            harga = 45000;
        }else{
            harga = 35000;
        }

        if (jumlahTiket > 5){
            total = harga * jumlahTiket;
            total = (total*9)/10;
        }else{
            total = harga * jumlahTiket;
        }

        System.out.println("Jumlah tiket : " + jumlahTiket);
        System.out.println("Total harga (dengan diskon): " + total);
    }
}
