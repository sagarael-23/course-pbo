package latihanjava;

import java.util.Scanner;

public class Latihan2B {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            float jari;
            float luas;
            float keliling;
            
            final float PI = 3.14f;
            
            System.out.print("Masukkan jari-jari: ");
            jari = input.nextFloat();
            
            luas = PI * jari * jari;
            keliling = 2 * PI * jari;
            
            System.out.println("Luas = " + luas);
            System.out.println("Keliling = " + keliling);
        }
    }
}