import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tahun (1909 - 2024): ");
        int tahun = input.nextInt();

        if (tahun >= 1909 && tahun <= 2024) {
            if (tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)) {
                System.out.println(tahun + " adalah tahun kabisat");
            } else {
                System.out.println(tahun + " bukan tahun kabisat");
            }
        } else {
            System.out.println("Tahun harus berada di antara 1909 - 2024");
        }

        input.close();
    }
}