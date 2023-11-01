import controller.MahasiswaControler;
import model.MahasiswaModel;

public class App {
    public static void main(String[] args) throws Exception {
        MahasiswaControler obj = new MahasiswaControler();
        MahasiswaModel.dataDummyMahasiswa();
        obj.menuToMain();
    }
}
