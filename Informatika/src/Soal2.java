import java.io.*;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama         : ");
        String nama = input.nextLine();
        System.out.print("Total Belanja: ");
        double totalBelanja = input.nextDouble();
        System.out.print("Diskon (%)   : ");
        double diskon = input.nextDouble();

        // 1. TULIS data ke file pakai DataOutputStream
        DataOutputStream out = new DataOutputStream(new FileOutputStream("belanja.dat"));
        out.writeUTF(nama);
        out.writeDouble(totalBelanja);
        out.writeDouble(diskon);
        out.close();

        // 2. BACA data dari file pakai DataInputStream (urutan harus sama!)
        DataInputStream in = new DataInputStream(new FileInputStream("belanja.dat"));
        String namaBaca = in.readUTF();
        double belanjaBaca = in.readDouble();
        double diskonBaca = in.readDouble();
        in.close();

        // 3. Hitung
        double potongan = belanjaBaca * diskonBaca / 100;
        double total = belanjaBaca - potongan;

        System.out.print("Bayar        : ");
        double bayar = input.nextDouble();
        double kembali = bayar - total;

        System.out.println("\n===== STRUK BELANJA =====");
        System.out.println("Nama         : " + namaBaca);
        System.out.println("Total Belanja: " + belanjaBaca);
        System.out.println("Diskon (%)   : " + diskonBaca);
        System.out.println("Total        : " + total);
        System.out.println("Bayar        : " + bayar);
        System.out.println("Kembalian    : " + kembali);
    }
}