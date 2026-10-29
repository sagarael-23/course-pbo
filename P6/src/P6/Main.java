package P6;


public class Main {
    
    public static void main(String[] args) {
    Employee e = new Employee();
    e.nip = 123;
    e.nama = "Eva";
    e.gaji = 2000000;
    e.info();
        
    Staff s = new Staff();
    s.nip = 321;
    s.nama = "Agus";
    s.gaji = 300000;
    s.bagian = "Lelaki Cadangan";
    s.info();
    s.infoBagian();
    }
    
}
