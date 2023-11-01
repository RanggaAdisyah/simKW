package entity;

public class EntityMahasiswa extends EntityMaba {
    private String npm;

    public EntityMahasiswa(String npm, String nama, String kewarganegaraan, String telp) {
        super(nama, kewarganegaraan, telp);
        this.npm = npm;
    }

    public String getNpm() {
        return this.npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
}