package Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cylinder cylinderSatu = new Cylinder();

        System.out.print("Masukkan jari-jari : ");
        cylinderSatu.r = input.nextDouble();

        System.out.print("Masukkan tinggi     : ");
        cylinderSatu.h = input.nextDouble();

        System.out.println("Jari-jari : " + cylinderSatu.r);
        System.out.println("Tinggi    : " + cylinderSatu.h);
        System.out.println("Phi       : " + cylinderSatu.phi);
        System.out.println("Volume    : " + cylinderSatu.hitungVolume());

        input.close();
    }
}