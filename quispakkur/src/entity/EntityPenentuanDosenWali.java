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

    public void setMahasiswa(EntityMahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public EntityDosenWali getDosen() {
        return this.dosen;
    }

    public void setDosen(EntityDosenWali dosen) {
        this.dosen = dosen;
    }
}