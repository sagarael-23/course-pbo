package Informatika;

import java.util.Scanner;

public class Informatika {

    String nama;

    void inputNama() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        nama = input.nextLine();
    }

    void mahasigma() {
        System.out.println("Saya, " + nama + " adalah Mahasiswa Teknik Informatika");
    }

    void sigma() {
        System.out.println("Jujur, Amanah, dan Informatikawan");
    }

    void belajar() {
        System.out.println("Senang Belajar PBO");
    }

    void info() {
        inputNama();
        mahasigma();
        sigma();
        belajar();
    }
}