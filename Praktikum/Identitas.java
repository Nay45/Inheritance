package Inheritance.Praktikum;

public class Identitas {
    // Deklarasi
    String name;
    String Jenis;
    int Nomor;

    // Method output
    void cetak(){
        System.out.println("Berikut Identitas Pegawai : ");
        System.out.println("============================================");
        System.out.println("Nama : " + this.name);
        System.out.println("Jenis Kelamin : " + this.Jenis);
    }
}
