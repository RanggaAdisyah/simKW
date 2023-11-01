package entity;

public class EntityPenentuanDosenWali {
    private EntityMahasiswa mahasiswa;
    private EntityDosenWali dosen;

    public EntityPenentuanDosenWali(EntityMahasiswa mahasiswa, EntityDosenWali dosen) {
        this.mahasiswa = mahasiswa;
        this.dosen = dosen;
    }

    public EntityMahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswwa(EntityMahasiswa mahasiswwa) {
        this.mahasiswa = mahasiswwa;
    }

    public EntityDosenWali getDosen() {
        return this.dosen;
    }

    public void setDosen(EntityDosenWali dosen) {
        this.dosen = dosen;
    }
}