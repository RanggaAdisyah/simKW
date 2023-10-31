package model;

import node.NodeJurusan;
import node.NodeMahasiswa;

import java.util.ArrayList;

public class ModelMahasiswa {
    ArrayList<NodeMahasiswa> modelMahasiswa;

    public ModelMahasiswa(){
        this.modelMahasiswa = new ArrayList<>();
    }

    public void insertMahasiswa(String nama, String kewarganegaraan,String npm ,String telp) {
        int index = modelMahasiswa.size();
        this.modelMahasiswa.add(new NodeMahasiswa(index+1, nama, kewarganegaraan, npm, telp));
    }

    public void viewAllJurusan(){
        for (int i=0; i<modelMahasiswa.size(); i++){
            this.modelMahasiswa.get(i).viewMahasiswa();
            System.out.println("--------------");
        }
    }

    public void updateJurusan(String nama_jurusan, String new_nama){
        for (int i = 0; i<modelMahasiswa.size(); i++){
            if (nama_jurusan.equals(modelMahasiswa.get(i).getNama())){
                modelMahasiswa.get(i).setTelp(new_nama);
            }
        }
    }

    public void deleteJurusan(String nama_jurusan){
        for (int i = 0; i<modelMahasiswa.size(); i++){
            if (nama_jurusan.equals(modelMahasiswa.get(i).getNama())){
                modelMahasiswa.remove(i);
            }
        }
    }
}
