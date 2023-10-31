package model;

import node.NodeDosenWali;

import java.util.ArrayList;

public class ModelDosenWali {
    ArrayList<NodeDosenWali> modelWali;

    public ModelDosenWali(){
        this.modelWali = new ArrayList<>();
    }

    public void insertDosenWali(String nama, String telp) {
        int index = modelWali.size();
        this.modelWali.add(new NodeDosenWali(index+1, nama, telp));
    }

    public void viewAllDosenWali(){
        for (int i=0; i<modelWali.size(); i++){
            this.modelWali.get(i).viewDosenWali();
            System.out.println("--------------");
        }
    }

    public void updateDosenWali(String nama, String new_telp){
        for (int i = 0; i<modelWali.size(); i++){
            if (nama.equals(modelWali.get(i).getNama_wali())){
                modelWali.get(i).setTelp(new_telp);
            }
        }
    }

    public void deleteJurusan(String nama){
        for (int i = 0; i<modelWali.size(); i++){
            if (nama.equals(modelWali.get(i).getNama_wali())){
                modelWali.remove(i);
            }
        }
    }
}
