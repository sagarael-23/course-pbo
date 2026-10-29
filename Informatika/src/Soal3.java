import java.io.*;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) throws IOException {
        // ---------- Pakai Scanner ----------
        Scanner sc = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan umur  : ");
        int umur1 = sc.nextInt();          // langsung bisa baca angka
        System.out.print("[Scanner] Masukkan nama  : ");
        sc.nextLine();                     // buang sisa 'enter' dari nextInt
        String nama1 = sc.nextLine();
        System.out.println("Hasil Scanner        : " + nama1 + ", " + umur1 + " tahun");

        // ---------- Pakai BufferedReader ----------
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n[BufferedReader] Masukkan umur : ");
        int umur2 = Integer.parseInt(br.readLine());   // harus diubah manual dari String
        System.out.print("[BufferedReader] Masukkan nama : ");
        String nama2 = br.readLine();
        System.out.println("Hasil BufferedReader : " + nama2 + ", " + umur2 + " tahun");
    }
}