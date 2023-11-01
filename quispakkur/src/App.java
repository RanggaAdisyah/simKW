import controller.MahasiswaControler;
import model.ModelMahasiswa;

public class App {
    public static void main(String[] args) throws Exception {
        MahasiswaControler obj = new MahasiswaControler();
        ModelMahasiswa.dataDummyMahasiswa();
        obj.menuToMain();
    }
}
