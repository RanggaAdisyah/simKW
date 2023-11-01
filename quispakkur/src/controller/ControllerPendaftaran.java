package controller;

import java.util.ArrayList;

import entity.*;
import model.*;

public class ControllerPendaftaran {
    public void tambahDaftar(EntityMahasiswa mahasiswa, EntityWaliMahasiswa wali, EntityPembayaranHer bayar) {
        ModelPendaftaran.tambahPendaftaran(mahasiswa, wali, bayar);
    }

    public void tambahPembayaran(String kode, int bayar) {
        ModelPendaftaran.tambahPembayaran(kode, bayar);
    }

    public EntityPembayaranHer cariData(String kode) {
        return ModelPendaftaran.cariPembayaran(kode);
    }

    public ArrayList<EntityPembayaranHer> allArray() {
        return ModelPendaftaran.allArrayPembayaran();
    }

    public ArrayList<EntityMahasiswa> arrayMahasiswa() {
        return ModelPendaftaran.allArrayMahasiswa();
    }

    public ArrayList<EntityPendaftaran> arrayPendaftar() {
        return ModelPendaftaran.allArrayPendaftran();
    }
}