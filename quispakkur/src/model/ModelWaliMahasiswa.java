package model;

import entity.EntityMahasiswa;

import java.util.ArrayList;

public class ModelWaliMahasiswa {
    private static ArrayList<EntityMahasiswa> objArrayMahasiswa = new ArrayList<>();

    public static ArrayList<EntityMahasiswa> all() {
        return objArrayMahasiswa;
    }

    public static void dataDummyMahasiswa() {
        objArrayMahasiswa.add(new EntityMahasiswa("1345134", "dfagfd", "qerager", "dsfgds"));
        objArrayMahasiswa.add(new EntityMahasiswa("13451345", "fgsdfghss", "sdfghdfgh", "dsdhdstgh"));
        objArrayMahasiswa.add(new EntityMahasiswa("35673", "shfghsfghsfh", "sfghfghhfsg", "rsthstfhsfd"));

    }

    public static void tambahMahasiswa(String npm, String nama, String kewarganegaraan, String telp) {
        objArrayMahasiswa.add(new EntityMahasiswa(npm, nama, kewarganegaraan, telp));
    }

    public static EntityMahasiswa cariMahasiswa(String npm) {
        for (EntityMahasiswa mahasiswaentity : objArrayMahasiswa) {
            if (mahasiswaentity.getNpm().equals(npm)) {
                return mahasiswaentity;
            }
        }
        return null;
    }

    // public static boolean cariMahasiswaBool(String npm){
    // for (MahasiswaEntity mahasiswaentity : objArrayMahasiswa){
    // if (mahasiswaentity.equals(npm)) {
    // return true;
    // }
    // }
    // return false;
    // }

    public static void deleteMahasiswa(EntityMahasiswa delMahasiswa) {
        objArrayMahasiswa.remove(delMahasiswa);
    }

    public static void upMahasiswa(EntityMahasiswa upMahasiswa, String npm, String nama, String kewarganegaraan,
            String telp) {
        upMahasiswa.setNpm(npm);
        upMahasiswa.setNama(nama);
        upMahasiswa.setKewarganegaraan(kewarganegaraan);
        upMahasiswa.setTelp(telp);
    }
}
