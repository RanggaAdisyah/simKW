package entity;

public class EntityJurusan {
    private int kodeJurusan;
    private String nama;

    public EntityJurusan(int kodeJurusan, String nama) {
        this.kodeJurusan = kodeJurusan;
        this.nama = nama;
    }

    public int getKodeJurusan() {
        return this.kodeJurusan;
    }

    public void setKodeJurusan(int kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}