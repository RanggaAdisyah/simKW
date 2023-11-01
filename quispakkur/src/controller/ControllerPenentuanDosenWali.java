package controller;

import entity.*;
import model.ModelPenentuanDosenWali;

public class ControllerPenentuanDosenWali {
    public void tambahDosenWali(EntityMahasiswa mahasiswa, EntityDosenWali dosenWali) {
        ModelPenentuanDosenWali.tambahDosenWali(mahasiswa, dosenWali);
    }

}
