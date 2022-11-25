package Praktikum5;

public class Pegawai {
    String Nama;
    double GajiPokok;

    //Construktor
    public Pegawai(String Nama, double GajiPokok) {
        this.Nama = Nama;
        this.GajiPokok = GajiPokok;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return this.Nama;
    }
    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }   
    public double getGajiPokok(){
        return this.GajiPokok;
    }

    public void cetakinfo() {
        System.out.println("Nama : " + this.Nama);
        System.out.println("GajiPokok : Rp." + this.GajiPokok);
    }  
}