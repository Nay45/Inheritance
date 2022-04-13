package Inheritance.Praktikum;

public class Gaji extends Identitas{

    // Overloading method
    public static int gaji (int uang){
        return uang;
    }

    public static double gaji (double uang){
        return(int) uang;
    }

    // Methiod output
    void cetak(){
        System.out.println("Nomor Pegawai : " + super.Nomor);
        System.out.println("Bekerja dibagian admin");
    }
}
