package view;

import java.util.Scanner;
import controller.*;
import entity.*;

public class ViewPendaftaran {
    ControllerPendaftaran pendaftar = new ControllerPendaftaran();
    Scanner input = new Scanner(System.in);

    public void tambahPendaftaran() {
        System.out.print("Masukkan Npm Mahasiswa: ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kewarganegaraan Mahasiswa: ");
        String Kewarganegaraan = input.nextLine();
        System.out.print("Masukkan No Telpon Mahasiswa: ");
        String noTelp = input.nextLine();
        System.out.print("Masukkan Nama Wali Mahasiswa: ");
        String nama1 = input.nextLine();
        System.out.print("Masukkan Kewarganegaraan Wali Mahasiswa: ");
        String kewarganegaraan1 = input.nextLine();
        System.out.print("Masukkan No Telpon Wali Mahasiswa: ");
        String noTelp1 = input.nextLine();
        System.out.println("Masukkan Kode: ");
        String kode = input.nextLine();
        EntityPembayaranHer bayar = pendaftar.cariData(kode);
        if (bayar != null) {
            pendaftar.tambahDaftar(new EntityMahasiswa(npm, nama, Kewarganegaraan, noTelp),
                    new EntityWaliMahasiswa(nama1, kewarganegaraan1, noTelp1), bayar);
            System.out.println("Pendaftaran Selesai!");
        }
    }

    public void pembayaranHer() {
        System.out.print("Kode: ");
        String kode = input.nextLine();
        System.out.print("Bayar: ");
        int bayar = input.nextInt();
        input.nextLine();

        pendaftar.tambahPembayaran(kode, bayar);
    }

    public void cetak() {
        if (pendaftar.arrayPendaftar() != null) {
            for (EntityPendaftaran objPendaftar : pendaftar.arrayPendaftar()) {
                System.out.print("Tanggal Pendaftar = " + objPendaftar.getTanggalDaftar());
            }
        } else {

        }
    }
}
