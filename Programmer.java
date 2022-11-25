    package Praktikum5 ;
    public class Programmer extends Pegawai {
    double Bonus;

    //Subclass Construktor
    public Programmer(String Name,double GajiPokok) {
        super(Name, GajiPokok);
    }
    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }
    public double getBonus() {
        return this.Bonus;
    }
    
    @Override
    public void cetakinfo() {
        super.cetakinfo();
    }

    public void cetakBonus() {
        Bonus = 4000000;
        System.out.println("Bonus : Rp." + this.Bonus);
    }
}
