package entity;

public class PenentuanDosenWaliEntity {
    private MahasiswaEntity mahasiswwa;
    private DosenWaliEntity dosen;

    public PenentuanDosenWaliEntity(MahasiswaEntity mahasiswwa, DosenWaliEntity dosen) {
        this.mahasiswwa = mahasiswwa;
        this.dosen = dosen;
    }

    public MahasiswaEntity getMahasiswwa() {
        return this.mahasiswwa;
    }

    public void setMahasiswwa(MahasiswaEntity mahasiswwa) {
        this.mahasiswwa = mahasiswwa;
    }

    public DosenWaliEntity getDosen() {
        return this.dosen;
    }

    public void setDosen(DosenWaliEntity dosen) {
        this.dosen = dosen;
    }
}