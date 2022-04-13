package Inheritance.Praktikum;

public class Output {
    public static void main(String[] args) {

        // Nilai param a b
        int a = Gaji.gaji(1200000);
        int b = Gaji.gaji(2400000);

        // Make var IIdentitas
        Identitas pegawai = new Identitas();
        pegawai.name = " Nayottama";
        pegawai.Jenis = " Laki-Laki";

        // Make var Gaji
        Gaji uang = new Gaji();
        uang.Nomor = 666;

        // Output hasil
        pegawai.cetak();
        uang.cetak();
        System.out.println("Gaji utama yang didapat : " + a);
        System.out.println("Gaji yang didapat jika bekerja secara baik menjadi : " + b);

    }
}
