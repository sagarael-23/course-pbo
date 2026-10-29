import java.io.*;

public class Soal5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah mangga dibeli          : ");
        int mangga = Integer.parseInt(br.readLine());
        System.out.print("Jumlah tetangga               : ");
        int tetangga = Integer.parseInt(br.readLine());
        System.out.print("Jambu untuk tiap tetangga     : ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());
        System.out.print("Mangga busuk (dikembalikan)   : ");
        int busuk = Integer.parseInt(br.readLine());

        int jambu = tetangga * jambuPerTetangga;     // 4 x 30 = 120
        int manggaBagus = mangga - busuk;            // 70 - 15 = 55
        int totalBuah = manggaBagus + jambu;         // 55 + 120 = 175

        System.out.println("\nJambu dibeli      : " + jambu);
        System.out.println("Mangga yang baik  : " + manggaBagus);
        System.out.println("Total buah dibeli : " + totalBuah + " pcs");
    }
}