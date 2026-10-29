package LatihanJava;

import java.util.Scanner;

public class LatihanJavaClass {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        String alamat;
        
        System.out.println("Kamu Siapa?");
        nama = input.nextLine();
        
        System.out.println("Halo, " + nama + "!" );
        
        System.out.println("Kamu Orang Mana:");
        alamat = input.nextLine();
        
        System.out.println("Oh, kamu orang " + alamat + "!");

//     Number
    byte iniByte = 10;
    short iniShort = 12345;
    int iniInt = 1234_431_321;
    long iniLong = 123456;
    float iniFloat = (float) 3.14;
    double iniDouble = 4.12;
    
    // Character x String
    char iniChar = 'a';
    String iniString = "Kalimat";
    
    // boolean
    boolean benar = true;
    boolean salah = false;
     
        System.out.println("Byte " + iniByte);
        System.out.println("Short " + iniShort);
        System.out.println("Integer " +  iniInt);
        System.out.println("Long " + iniLong);
        System.out.println("Float " + iniFloat);
        System.out.println("Double " + iniDouble);
        System.out.println("Char " + iniChar);
        System.out.println("String " + iniString);
        System.out.println("boolean true" + benar);
        System.out.println("boolean false" + salah);
        
     
    }
}
