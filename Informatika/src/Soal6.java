import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Waktu pertama");
        System.out.print("Jam    : ");
        int jam1 = input.nextInt();
        System.out.print("Menit  : ");
        int menit1 = input.nextInt();
        System.out.print("Detik  : ");
        int detik1 = input.nextInt();

        System.out.println("Waktu kedua");
        System.out.print("Jam    : ");
        int jam2 = input.nextInt();
        System.out.print("Menit  : ");
        int menit2 = input.nextInt();
        System.out.print("Detik  : ");
        int detik2 = input.nextInt();

        // ubah semua ke detik
        int total1 = jam1 * 3600 + menit1 * 60 + detik1;
        int total2 = jam2 * 3600 + menit2 * 60 + detik2;

        // selisih (dibuat positif)
        int selisih = total2 - total1;
        if (selisih < 0) {
            selisih = -selisih;
        }

        // ubah balik ke jam, menit, detik
        int jam = selisih / 3600;
        int sisa = selisih % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("\nSelisih waktu: " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}