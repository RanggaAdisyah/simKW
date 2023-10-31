package node;

public class NodeDosenWali {
    int nip;
    String nama_wali;
    NodeJurusan jurusan;
    String telp;

    public NodeDosenWali(int nip, String nama_wali, String telp) {
        this.nip = nip;
        this.nama_wali = nama_wali;
        this.jurusan = jurusan;
        this.telp = telp;
    }

    public void viewDosenWali(){
        System.out.println("NIP Wali Dosen : " + this.nip);
        System.out.println("Nama Wali Dosen : " + this.nama_wali);
        System.out.println("Jurusan : " + this.jurusan);
    }

    public String getNama_wali() {
        return nama_wali;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}