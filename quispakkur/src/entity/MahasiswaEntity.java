package entity;

public class MahasiswaEntity extends Maba{
    private String npm;

    public MahasiswaEntity(String npm, String nama, String kewarganegaraan, String telp) {
        super(nama,kewarganegaraan,telp);
        this.npm = npm;
    }

    public String getNpm() {
        return this.npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
}