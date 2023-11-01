package entity;

import utils.Date;

public class EntityPembayaranHer {
    private String kode;
    private String tanggal;
    private int bayar;

    public EntityPembayaranHer(String kode, int bayar) {
        this.kode = kode;
        this.tanggal = Date.now();
        this.bayar = bayar;
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getBayar() {
        return this.bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

}
