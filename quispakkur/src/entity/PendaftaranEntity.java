package entity;
import utils.Date;

public class PendaftaranEntity {
    private MahasiswaEntity mahasiswa;
    private WaliMahasiswaEntity wali;
    private PembayaranHerEntity bayar;
    private String tanggalDaftar;

    public PendaftaranEntity(MahasiswaEntity mahasiswa, WaliMahasiswaEntity wali, PembayaranHerEntity bayar) {
        this.tanggalDaftar = Date.now();
        this.mahasiswa = mahasiswa;
        this.wali = wali;
        this.bayar = bayar;
    }

    public MahasiswaEntity getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(MahasiswaEntity mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public WaliMahasiswaEntity getWali() {
        return this.wali;
    }

    public void setWali(WaliMahasiswaEntity wali) {
        this.wali = wali;
    }

    public PembayaranHerEntity getBayar() {
        return this.bayar;
    }

    public void setBayar(PembayaranHerEntity bayar) {
        this.bayar = bayar;
    }

    public String getTanggalDaftar() {
        return this.tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

}