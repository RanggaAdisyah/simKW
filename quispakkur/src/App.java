import controller.ControllerMahasiswa;
import model.ModelMahasiswa;

public class App {
    public static void main(String[] args) throws Exception {
        ControllerMahasiswa obj = new ControllerMahasiswa();
        ModelMahasiswa.dataDummyMahasiswa();
        obj.menuToMain();
    }
}
