package controller;

import entity.EntityMahasiswa;
import model.ModelMahasiswa;
import view.ViewMahasiwa;

import java.util.ArrayList;

public class ControllerWaliMahasiswa {
    public ArrayList<EntityMahasiswa> arrayMahasiswa() {
        return ModelMahasiswa.all();
    }

    public void tambahWaliMahasiswa(String npm, String nama, String kewarganegaraan, String telp) {
        ModelMahasiswa.tambahMahasiswa(npm, nama, kewarganegaraan, telp);
    }

    public void updateWaliMahasiswa(EntityMahasiswa upMahasiswa, String npm, String nama, String kewarganegaraan,
            String telp) {
        ModelMahasiswa.upMahasiswa(upMahasiswa, npm, nama, kewarganegaraan, telp);
    }

    public void deleteWaliMahasiswa(EntityMahasiswa delMahasiswa) {
        ModelMahasiswa.deleteMahasiswa(delMahasiswa);
    }

    public EntityMahasiswa cariWaliMahasiswa(String npm) {
        return ModelMahasiswa.cariMahasiswa(npm);
    }

    public void menuToMain() {
        ViewMahasiwa obj = new ViewMahasiwa();
        obj.menuMahasiswa();
    }
}
