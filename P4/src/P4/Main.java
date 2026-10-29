package P4;

public class Main {
    public static void main(String[] args) {

        Lingkaran lingkaranSatu = new Lingkaran();

        lingkaranSatu.jari = 7;

        System.out.println("Jari-jari : " + lingkaranSatu.jari);
        System.out.println("Phi       : " + lingkaranSatu.phi);

        System.out.println("Luas      : " + lingkaranSatu.hitungLuas());
        System.out.println("Keliling  : " + lingkaranSatu.hitungKeliling());
        
        Lingkaran lingkaranDua = new Lingkaran();
        System.out.println("Jari-jari : " + lingkaranDua.jari);
        System.out.println("Phi       : " + lingkaranDua.phi);

        System.out.println("Luas      : " + lingkaranDua.hitungLuas());
        System.out.println("Keliling  : " + lingkaranDua.hitungKeliling());
        

    }
}

class Lingkaran {

    double jari;
    double luas;
    double keliling;
    final double phi = 3.14;

    double hitungLuas() {
        luas = phi * jari * jari;
        return luas;
    }

    double hitungKeliling() {
        keliling = 2 * phi * jari;
        return keliling;
    }
}