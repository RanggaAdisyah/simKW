package node;

public class NodeMahasiswa {
    String npm;
    String nama;
    String kewarganegaraan ;
    String telp;

    public NodeMahasiswa(int i, String npm, String nama, String kewarganegaraan, String telp) {
        this.npm = npm;
        this.nama = nama;
        this.kewarganegaraan = kewarganegaraan;
        this.telp = telp;
    }

    public void viewMahasiswa(){
        System.out.println("NPM Mahasiswa : " + this.npm);
        System.out.println("Nama Mahasiswa : " + this.nama);
        System.out.println("Kewarganegaraan : " + this.kewarganegaraan);
        System.out.println("No Telp : " + this.telp);
    }

    public String getNama() {
        return nama;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}
