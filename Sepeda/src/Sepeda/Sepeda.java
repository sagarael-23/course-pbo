import java.util.Scanner;

public class Sepeda {
    
    String merk;
    int jarak = 0; 
    
    void bergerakMaju() {
        jarak = jarak + 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarak + " Km");
    }
    
    void bergerakMundur() {
        jarak = jarak - 5;
        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarak + " Km");
    }
    
    void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh akhir " + jarak + " Km");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Sepeda sepedaKu = new Sepeda();
        
        System.out.print("Masukan Object Merk Sepeda: ");
        sepedaKu.merk = input.nextLine();
        
        System.out.println("Object " + sepedaKu.merk + " dibuat, jarak tmpuh awal " + sepedaKu.jarak + " km");
        
        int pilihan;
        boolean isRunning = true;
        
        while(isRunning) {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");
            
            pilihan = input.nextInt();
            
            if(pilihan == 1) {
                sepedaKu.bergerakMaju();
            } else if (pilihan == 2) {
                sepedaKu.bergerakMundur();
            } else if (pilihan == 3) {
                sepedaKu.berhenti();
            } else if (pilihan == 0) {
                System.out.println("Keluar Program ..");
                System.out.println("Terimakasih sudah menggunakan program ini.");
                isRunning = false; 
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
        
        input.close();
    }
}