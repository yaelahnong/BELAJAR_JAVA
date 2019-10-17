package XIRPL3;

import java.util.Scanner;   // <-- Mengimport Scanner class

public class Kondisi {

    public static void main(String[] args){

        Scanner inputNilai = new Scanner(System.in); // <-- Membuat sebuah Scanner Object
        System.out.print("Masukkan Nilai : ");

        int nilai = inputNilai.nextInt(); // <-- Membaca Inputan Nilai

        if ( nilai > 90 ) {
            System.out.println("A");
        } else if ( nilai > 80 ) {
            System.out.println("AB");
        } else if ( nilai > 70 ) {
            System.out.println("B");
        } else if ( nilai > 60 ) {
            System.out.println("BC");
        } else {
            System.out.println("C");
        }


    }

}
