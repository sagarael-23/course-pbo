import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan : ");
        String npm = input.nextLine();
        System.out.print("Nama Karyawan        : ");
        String nama = input.nextLine();
        System.out.print("Alamat               : ");
        String alamat = input.nextLine();
        System.out.print("Jabatan              : ");
        String jabatan = input.nextLine();
        System.out.print("Gaji Pokok           : ");
        double gajiPokok = input.nextDouble();
        System.out.print("Tunjangan Jabatan    : ");
        double tunjJabatan = input.nextDouble();
        System.out.print("Tunjangan Istri      : ");
        double tunjIstri = input.nextDouble();
        System.out.print("Tunjangan Anak       : ");
        double tunjAnak = input.nextDouble();

        // P1 = gaji pokok, P2 = tunj jabatan, P3 = tunj istri, P4 = tunj anak
        double totalGaji = gajiPokok + tunjJabatan + tunjIstri + tunjAnak;
        // Pajak = 10% x (P1 + P2 + P4)  (sesuai rumus di soal)
        double pajak = 0.10 * (gajiPokok + tunjJabatan + tunjAnak);
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n===== SLIP GAJI =====");
        System.out.println("NIK          : " + npm);
        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Jabatan      : " + jabatan);
        System.out.println("Total Gaji   : " + totalGaji);
        System.out.println("Pajak        : " + pajak);
        System.out.println("Gaji Bersih  : " + gajiBersih);
    }
}