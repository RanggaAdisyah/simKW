package entity;

import utils.Date;

public class PembayaranHerEntity {
    private String tanggal;
    private KasirEntity kasir;

    public PembayaranHerEntity(KasirEntity kasir) {
        this.tanggal = Date.now();
        this.kasir = kasir;
    }

    public KasirEntity getKasir() {
        return this.kasir;
    }

    public void setKasir(KasirEntity kasir) {
        this.kasir = kasir;
    }

}
