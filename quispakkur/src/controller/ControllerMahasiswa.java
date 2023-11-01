package controller;

import entity.MahasiswaEntity;
import model.MahasiswaModel;
import view.ViewMahasiwa;

import java.util.ArrayList;

public class MahasiswaControler {
    public ArrayList<MahasiswaEntity> arrayMahasiswa(){
        return MahasiswaModel.all();
    }

    public void tambahMahasiswa(String npm, String nama, String kewarganegaraan, String telp){
        MahasiswaModel.tambahMahasiswa(npm, nama, kewarganegaraan, telp);
    }

    public void updateMahasiswa(MahasiswaEntity upMahasiswa, String npm, String nama, String kewarganegaraan, String telp){
        MahasiswaModel.upMahasiswa(upMahasiswa, npm, nama, kewarganegaraan, telp);
    }

    public void deleteMahasiswa(MahasiswaEntity delMahasiswa){
        MahasiswaModel.deleteMahasiswa(delMahasiswa);
    }

    public MahasiswaEntity cariMahasiswa(String npm){
        return MahasiswaModel.cariMahasiswa(npm);
    }

    public void menuToMain(){
        ViewMahasiwa obj = new ViewMahasiwa();
        obj.menuMahasiswa();
    }
}

