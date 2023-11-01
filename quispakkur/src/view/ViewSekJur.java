package view;

import java.util.Scanner;

public class ViewSekJur {
    public void tambahDosenWali() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMahasiswa = scan.nextLine();
        System.out.print("Masukkan NPM Mahasiswa: ");
        String npmMahasiswa = scan.nextLine();

        System.out.print("Masukkan Nama Dosen Wali: ");
        String namaDosenWali = scan.nextLine();
        System.out.print("Masukkan NIP Dosen Wali: ");
        String nipDosenWali = scan.nextLine();

    }
}
