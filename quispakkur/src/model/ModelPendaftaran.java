package model;

import java.util.ArrayList;

import entity.*;

public class ModelPendaftaran {
    private static ArrayList<EntityPembayaranHer> arrayPembayaran = new ArrayList<>();
    private static ArrayList<EntityPendaftaran> arrayPendaftaran = new ArrayList<>();
    private static ArrayList<EntityMahasiswa> arrayMahasiswa = new ArrayList<>();
    private static ArrayList<EntityWaliMahasiswa> arrayWaliMahasiswa = new ArrayList<>();

    public static ArrayList<EntityPembayaranHer> allArrayPembayaran() {
        return arrayPembayaran;
    }

    public static ArrayList<EntityPendaftaran> allArrayPendaftran() {
        return arrayPendaftaran;
    }

    public static ArrayList<EntityMahasiswa> allArrayMahasiswa() {
        return arrayMahasiswa;
    }

    public static ArrayList<EntityWaliMahasiswa> allArrayWali() {
        return arrayWaliMahasiswa;
    }

    public static void tambahPendaftaran(EntityMahasiswa mahasiswa, EntityWaliMahasiswa wali,
            EntityPembayaranHer bayar) {
        arrayMahasiswa.add(mahasiswa);
        arrayWaliMahasiswa.add(wali);
        arrayPendaftaran.add(new EntityPendaftaran(mahasiswa, wali, bayar));
    }

    public static void tambahPembayaran(String kode, int bayar) {
        arrayPembayaran.add(new EntityPembayaranHer(kode, bayar));
    }

    public static EntityPembayaranHer cariPembayaran(String kode) {
        for (EntityPembayaranHer objPembayaran : arrayPembayaran) {
            if (objPembayaran.getKode().equals(kode)) {
                return objPembayaran;
            }
        }
        return null;
    }
}