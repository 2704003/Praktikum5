package Praktikum5;
public class Main {
    public static void main(String[] args) {
        //Membuat Objek
        Manager manager = new Manager("Abdul",5500000);
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("---------------------------------");
        Programmer programer = new Programmer("Ferdi",8000000);
        programer.cetakinfo();
        programer.cetakBonus();

    }
    
}

