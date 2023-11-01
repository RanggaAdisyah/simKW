package entity;

public class EntityPenentuanDosenWali {
    private EntityMahasiswa mahasiswwa;
    private EntityDosenWali dosen;

    public EntityPenentuanDosenWali(EntityMahasiswa mahasiswwa, EntityDosenWali dosen) {
        this.mahasiswwa = mahasiswwa;
        this.dosen = dosen;
    }

    public EntityMahasiswa getMahasiswwa() {
        return this.mahasiswwa;
    }

    public void setMahasiswwa(EntityMahasiswa mahasiswwa) {
        this.mahasiswwa = mahasiswwa;
    }

    public EntityDosenWali getDosen() {
        return this.dosen;
    }

    public void setDosen(EntityDosenWali dosen) {
        this.dosen = dosen;
    }
}