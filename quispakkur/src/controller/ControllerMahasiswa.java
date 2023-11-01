package controller;

import entity.EntityMahasiswa;
import model.ModelMahasiswa;
import view.View;

import java.util.ArrayList;

public class ControllerMahasiswa {
    public ArrayList<EntityMahasiswa> arrayMahasiswa() {
        return ModelMahasiswa.all();
    }

    public void tambahMahasiswa(String npm, String nama, String kewarganegaraan, String telp) {
        ModelMahasiswa.tambahMahasiswa(npm, nama, kewarganegaraan, telp);
    }

    public void updateMahasiswa(EntityMahasiswa upMahasiswa, String npm, String nama, String kewarganegaraan,
            String telp) {
        ModelMahasiswa.upMahasiswa(upMahasiswa, npm, nama, kewarganegaraan, telp);
    }

    public void deleteMahasiswa(EntityMahasiswa delMahasiswa) {
        ModelMahasiswa.deleteMahasiswa(delMahasiswa);
    }

    public EntityMahasiswa cariMahasiswa(String npm) {
        return ModelMahasiswa.cariMahasiswa(npm);
    }

    public void menuToMain() {
        View obj = new View();
        obj.menuMahasiswa();
    }
}
