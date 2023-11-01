package entity;

public class Maba {
    private String nama;
    private String kewarganegaraan;
    private String telp;

    public Maba(String nama, String kewarganegaraan, String telp) {
        this.nama = nama;
        this.kewarganegaraan = kewarganegaraan;
        this.telp = telp;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKewarganegaraan() {
        return this.kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getTelp() {
        return this.telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }   
}