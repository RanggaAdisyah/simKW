package entity;

import utils.Date;

public class EntityPendaftaran {
    private EntityMahasiswa mahasiswa;
    private EntityWaliMahasiswa wali;
    private EntityPembayaranHer bayar;
    private String tanggalDaftar;

    public EntityPendaftaran(EntityMahasiswa mahasiswa, EntityWaliMahasiswa wali, EntityPembayaranHer bayar) {
        this.tanggalDaftar = Date.now();
        this.mahasiswa = mahasiswa;
        this.wali = wali;
        this.bayar = bayar;
    }

    public EntityMahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(EntityMahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public EntityWaliMahasiswa getWali() {
        return this.wali;
    }

    public void setWali(EntityWaliMahasiswa wali) {
        this.wali = wali;
    }

    public EntityPembayaranHer getBayar() {
        return this.bayar;
    }

    public void setBayar(EntityPembayaranHer bayar) {
        this.bayar = bayar;
    }

    public String getTanggalDaftar() {
        return this.tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

}