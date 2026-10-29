import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyaknya novel yang dicetak : ");
        long banyakNovel = input.nextLong();
        System.out.print("Tebal tiap novel (lembar)    : ");
        long tebal = input.nextLong();

        // kecepatan 1 lembar/detik, jadi total lembar = total detik
        long totalDetik = banyakNovel * tebal;

        long hari = totalDetik / 86400;
        long sisa = totalDetik % 86400;
        long jam = sisa / 3600;
        sisa = sisa % 3600;
        long menit = sisa / 60;
        long detik = sisa % 60;

        System.out.println("\nWaktu yang diperlukan:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}