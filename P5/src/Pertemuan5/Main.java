package Pertemuan5;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(5520, "Dadang", "Informatika");
        
        
    }
}

class Mahasiswa{
    // Instance Variabel
    int npm;
    String nama;
    String prodi;
    
    //overload
    public double penjumlahan(int bilangan) {
    return (bilangan + 5);
    }
    
    public double penjumlahan(double angka1, double angka2) {
    return (angka1 + angka2);
    }
    
    public double penjumlahan(double angka1, int angka2) {
    return (angka1 + angka2);
    }
    
    //Constructor
    public Mahasiswa(int npm, String nama, String prodi) {
    this.npm = npm;
    this.nama = nama;
    this.prodi = prodi;
    }
    
    // Parameter
    public void setData(int npm, String nama, String prodi){
    this.npm = npm;
    this.nama = nama;
    this.prodi = prodi;
    }
    
    public void infoMahasiswa() {
        System.out.println("NPM     : " + this.npm);
        System.out.println("NAMA    : " + this.nama);
        System.out.println("PRODI   : " + this.prodi);
    }
    
}