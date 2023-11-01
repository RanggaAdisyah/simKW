package view;

import controller.MahasiswaControler;
import entity.EntityMahasiswa;

import java.util.Scanner;

public class ViewMahasiwa {
    Scanner scan = new Scanner(System.in);
    MahasiswaControler mahasiswacontroler = new MahasiswaControler();

    public void tambahMahasiswa() {
        System.out.print("NPM Mahasiswa : ");
        String npm = scan.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String nama = scan.nextLine();
        System.out.print("Kewarganegaraan Mahasiswa : ");
        String kewarganegaraan = scan.nextLine();
        System.out.print("No Telp : ");
        String telp = scan.nextLine();

        mahasiswacontroler.tambahMahasiswa(npm, nama, kewarganegaraan, telp);
    }

    public void cetakMahasiswa() {
        if (mahasiswacontroler.arrayMahasiswa() == null) {
            System.out.println("Data Kosong");
        } else {
            for (EntityMahasiswa obj : mahasiswacontroler.arrayMahasiswa()) {
                System.out.println("Npm :" + obj.getNpm());
                System.out.println("Nama : " + obj.getNama());
                System.out.println("Kewarganegaraan : " + obj.getKewarganegaraan());
                System.out.println("Telp : " + obj.getTelp());
            }
        }
    }

    public void updateMahasiswa() {
        System.out.print("Masukkan NPM : ");
        String npm = scan.nextLine();

        EntityMahasiswa obj = mahasiswacontroler.cariMahasiswa(npm);
        if (obj != null) {
            System.out.print("NPM Mahasiswa : ");
            String npm1 = scan.nextLine();
            System.out.print("Nama Mahasiswa : ");
            String nama1 = scan.nextLine();
            System.out.print("Kewarganegaraan Mahasiswa : ");
            String kewarganegaraan1 = scan.nextLine();
            System.out.print("No Telp : ");
            String telp1 = scan.nextLine();

            mahasiswacontroler.updateMahasiswa(obj, npm1, nama1, kewarganegaraan1, telp1);
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    public void hapusMahasiswa() {
        System.out.print("Masukkan NPM : ");
        String npm = scan.nextLine();

        EntityMahasiswa obj = mahasiswacontroler.cariMahasiswa(npm);
        if (obj != null) {
            mahasiswacontroler.deleteMahasiswa(obj);
            System.out.println("Data Sudah Terhapus");
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    public void menuMahasiswa() {
        String pilihInput;
        do {
            System.out.println("""
                    1. Tambah Mahasiswa
                    2. Update Mahasiswa
                    3. View Mahasiswa
                    4. Delete Mahasiswa
                    5. exit
                    """);
            System.out.print("Masukkan Pilihan : ");
            pilihInput = scan.nextLine();
            switch (pilihInput) {
                case "1" -> tambahMahasiswa();
                case "2" -> updateMahasiswa();
                case "3" -> cetakMahasiswa();
                case "4" -> hapusMahasiswa();
                case "5" -> System.out.println("Program selesai");
                default -> System.out.println("Input Tidak Ada");
            }
        } while (!pilihInput.equals("5"));
    }
}
