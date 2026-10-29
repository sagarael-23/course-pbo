import java.util.Scanner;

public class QuisPBO {

    // Method untuk menghitung nilai akhir
    public static double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (0.30 * tugas) + (0.30 * uts) + (0.40 * uas);
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("================================================");
            System.out.println("       SISTEM PENGOLAHAN NILAI MAHASISWA");
            System.out.println("================================================");
            
            // Input jumlah mahasiswa
            System.out.print("Masukkan jumlah mahasiswa : ");
            int jumlah = input.nextInt();
            input.nextLine();
            
            // Array untuk menyimpan data mahasiswa
            String[] npm = new String[jumlah];
            String[] nama = new String[jumlah];
            
            double[] tugas = new double[jumlah];
            double[] uts = new double[jumlah];
            double[] uas = new double[jumlah];
            double[] nilaiAkhir = new double[jumlah];
            
            char[] huruf = new char[jumlah];
            String[] status = new String[jumlah];
            
            // Loop input data mahasiswa
            for (int i = 0; i < jumlah; i++) {
                
                System.out.println();
                System.out.println("Data Mahasiswa Ke-" + (i + 1));
                System.out.println("--------------------------------");
                
                System.out.print("NPM         : ");
                npm[i] = input.nextLine();
                
                System.out.print("Nama        : ");
                nama[i] = input.nextLine();
                
                // Input nilai Tugas dengan validasi
                tugas[i] = inputNilai(input, "Nilai Tugas");
                
                // Input nilai UTS dengan validasi
                uts[i] = inputNilai(input, "Nilai UTS");
                
                // Input nilai UAS dengan validasi
                uas[i] = inputNilai(input, "Nilai UAS");
                
                // Hitung nilai akhir
                nilaiAkhir[i] = hitungNilaiAkhir(tugas[i], uts[i], uas[i]);
                
                // Menentukan nilai huruf
                if (nilaiAkhir[i] >= 80) {
                    huruf[i] = 'A';
                } else if (nilaiAkhir[i] >= 70) {
                    huruf[i] = 'B';
                } else if (nilaiAkhir[i] >= 60) {
                    huruf[i] = 'C';
                } else if (nilaiAkhir[i] >= 50) {
                    huruf[i] = 'D';
                } else {
                    huruf[i] = 'E';
                }
                
                // Menentukan status kelulusan
                if (huruf[i] == 'A' || huruf[i] == 'B' || huruf[i] == 'C') {
                    status[i] = "LULUS";
                } else {
                    status[i] = "TIDAK LULUS";
                }
            }
            
            // Menampilkan hasil
            System.out.println();
            System.out.println("===============================================================");
            System.out.println("                    DAFTAR NILAI MAHASISWA");
            System.out.println("===============================================================");
            
            System.out.printf("%-4s %-12s %-15s %7s %7s %7s %8s %7s %-12s%n",
                    "No", "NPM", "Nama", "Tugas", "UTS", "UAS",
                    "Akhir", "Huruf", "Status");
            
            System.out.println("-----------------------------------------------------------------------");
            
            for (int i = 0; i < jumlah; i++) {
                
                System.out.printf("%-4d %-12s %-15s %7.0f %7.0f %7.0f %8.1f %7c %-12s%n",
                        (i + 1),
                        npm[i],
                        nama[i],
                        tugas[i],
                        uts[i],
                        uas[i],
                        nilaiAkhir[i],
                        huruf[i],
                        status[i]);
            }
            
            System.out.println("===============================================================");
            
            // Statistik nilai
            int jumlahLulus = 0;
            int jumlahTidakLulus = 0;
            
            double nilaiTertinggi = nilaiAkhir[0];
            double nilaiTerendah = nilaiAkhir[0];
            double totalNilai = 0;
            
            for (int i = 0; i < jumlah; i++) {
                
                totalNilai += nilaiAkhir[i];
                
                if (nilaiAkhir[i] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiAkhir[i];
                }
                
                if (nilaiAkhir[i] < nilaiTerendah) {
                    nilaiTerendah = nilaiAkhir[i];
                }
                
                if (status[i].equals("LULUS")) {
                    jumlahLulus++;
                } else {
                    jumlahTidakLulus++;
                }
            }
            
            double rataRata = totalNilai / jumlah;
            
            System.out.println();
            System.out.println("STATISTIK NILAI");
            System.out.println("--------------------------------");
            System.out.println("Jumlah Mahasiswa       : " + jumlah);
            System.out.println("Jumlah Mahasiswa Lulus : " + jumlahLulus);
            System.out.println("Jumlah Tidak Lulus     : " + jumlahTidakLulus);
            System.out.printf("Nilai Tertinggi        : %.1f%n", nilaiTertinggi);
            System.out.printf("Nilai Terendah         : %.1f%n", nilaiTerendah);
            System.out.printf("Rata-rata Kelas        : %.2f%n", rataRata);
            
            System.out.println("===============================================================");
            System.out.println("              PROGRAM SELESAI");
            System.out.println("===============================================================");
        }
    }

    // Method untuk input dan validasi nilai
    public static double inputNilai(Scanner input, String jenisNilai) {

        double nilai;

        while (true) {

            System.out.print(jenisNilai + " : ");
            nilai = input.nextDouble();

            if (nilai >= 0 && nilai <= 100) {
                break;
            } else {
                System.out.println("Nilai tidak valid!");
                System.out.println("Nilai harus berada pada rentang 0 - 100.");
                System.out.println("Silakan masukkan nilai kembali.");
            }
        }

        input.nextLine();

        return nilai;
    }
}