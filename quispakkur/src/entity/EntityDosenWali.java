package entity;

public class DosenWaliEntity {
    private String nip;
    private String nama;
    private JurusanEntity jurusan;
    private String telp;

    public DosenWaliEntity(String nip, String nama, JurusanEntity jurusan, String telp) {
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

    public JurusanEntity getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(JurusanEntity jurusan) {
        this.jurusan = jurusan;
    }

    public String getTelp() {
        return this.telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}