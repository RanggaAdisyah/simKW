package entity;

import utils.Date;

public class EntityPembayaranHer {
    private String tanggal;
    private EntityKasir kasir;

    public EntityPembayaranHer(EntityKasir kasir) {
        this.tanggal = Date.now();
        this.kasir = kasir;
    }

    public EntityKasir getKasir() {
        return this.kasir;
    }

    public void setKasir(EntityKasir kasir) {
        this.kasir = kasir;
    }

}
