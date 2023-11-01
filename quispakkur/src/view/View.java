package view;

import java.util.Scanner;

import controller.*;

public class View {
    Scanner input = new Scanner(System.in);
    ControllerPendaftaran pendaftar = new ControllerPendaftaran();
    ViewPendaftaran view = new ViewPendaftaran();

    public void menu() {
        String pilih;
        do {
            System.out.println("""
                    1. Pendaftaran Mahasiswa
                    2. Dosen
                    3. Exit
                    """);
            System.out.print("Masukkan Pilihan Anda: ");
            pilih = input.nextLine();
            switch (pilih) {
                case "1" -> view.tambahPendaftaran();
                case "2" -> menuDosen();
                case "3" -> System.out.println("Exit");
                default -> System.out.println("Inputan Tidak Ada!");
            }
        } while (!pilih.equals("3"));
        System.out.println("Program Selesai!");
    }

    public void menuDosen() {
        String pilih;
        do {
            System.out.println("""
                    1. Dosen Wali
                    2. Dosen SekJur
                    3. Kasir
                    4. Exit
                    """);
            System.out.print("Masukkan Pilihan Anda: ");
            pilih = input.nextLine();
            switch (pilih) {
                case "1" -> System.out.println();
                case "2" -> System.out.println();
                case "3" -> menuPembayaran();
                case "4" -> System.out.println("Exit");
                default -> System.out.println("Inputan Tidak Ada!");
            }
        } while (!pilih.equals("4"));
    }

    public void menuPembayaran() {
        String pilih;
        do {
            System.out.println("""
                    1. Bayar
                    2. Lihat Data Pembayar
                    3. Exit
                    """);
            System.out.print("Masukkan Pilihan Anda: ");
            pilih = input.nextLine();
            switch (pilih) {
                case "1" -> view.pembayaranHer();
                case "2" -> view.cetak();
                case "3" -> System.out.println("Exit");
                default -> System.out.println("Inputan Tidak Ada!");
            }
        } while (!pilih.equals("3"));
    }
}
