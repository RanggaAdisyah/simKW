package model;

import entity.MahasiswaEntity;

import java.util.ArrayList;

public class MahasiswaModel {
    private static ArrayList<MahasiswaEntity> objArrayMahasiswa = new ArrayList<>();
    public static ArrayList<MahasiswaEntity> all(){
        return objArrayMahasiswa;
    }

    public static void dataDummyMahasiswa(){
        objArrayMahasiswa.add(new MahasiswaEntity("1345134","dfagfd","qerager","dsfgds"));
        objArrayMahasiswa.add(new MahasiswaEntity("13451345","fgsdfghss","sdfghdfgh","dsdhdstgh"));
        objArrayMahasiswa.add(new MahasiswaEntity("35673","shfghsfghsfh","sfghfghhfsg","rsthstfhsfd"));

    }

    public static void tambahMahasiswa(String npm, String nama, String kewarganegaraan, String telp){
        objArrayMahasiswa.add(new MahasiswaEntity(npm, nama, kewarganegaraan, telp));
    }

    public static MahasiswaEntity cariMahasiswa(String npm){
        for (MahasiswaEntity mahasiswaentity : objArrayMahasiswa){
            if (mahasiswaentity.getNpm().equals(npm)) {
                return mahasiswaentity;
            }
        }
        return null;
    }

//    public static boolean cariMahasiswaBool(String npm){
//        for (MahasiswaEntity mahasiswaentity : objArrayMahasiswa){
//            if (mahasiswaentity.equals(npm)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void deleteMahasiswa(MahasiswaEntity delMahasiswa){
        objArrayMahasiswa.remove(delMahasiswa);
    }

    public static void upMahasiswa(MahasiswaEntity upMahasiswa, String npm, String nama, String kewarganegaraan, String telp){
        upMahasiswa.setNpm(npm);
        upMahasiswa.setNama(nama);
        upMahasiswa.setKewarganegaraan(kewarganegaraan);
        upMahasiswa.setTelp(telp);
    }
}
