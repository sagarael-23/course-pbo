import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Massa benda (m)         : ");
        double m = input.nextDouble();
        System.out.print("Kecepatan (v)           : ");
        double v = input.nextDouble();
        System.out.print("Jari-jari lintasan (r)  : ");
        double r = input.nextDouble();

        // Fc = (m x v x v) / r
        double fc = (m * v * v) / r;

        System.out.println("Gaya sentripetal (Fc)   : " + fc + " N");
    }
}