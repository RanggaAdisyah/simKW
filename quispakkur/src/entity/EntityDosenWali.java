package entity;

public class EntityDosenWali {
    private String nip;
    private String nama;
    private EntityJurusan jurusan;
    private String telp;

    public EntityDosenWali(String nip, String nama, EntityJurusan jurusan, String telp) {
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        this.telp = telp;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public EntityJurusan getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(EntityJurusan jurusan) {
        this.jurusan = jurusan;
    }

    public String getTelp() {
        return this.telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}