package model;

import java.util.ArrayList;

import entity.*;

public class ModelPenentuanDosenWali {
    private static ArrayList<EntityPenentuanDosenWali> arrayPenentuanDosenWali = new ArrayList<>();
    private static ArrayList<EntityMahasiswa> arrayMahasiswa = new ArrayList<>();
    private static ArrayList<EntityDosenWali> arrayDosenWaliMahasiswa = new ArrayList<>();

    public static ArrayList<EntityPenentuanDosenWali> allArrayPenentuanDosenWalis() {
        return arrayPenentuanDosenWali;
    }

    public static ArrayList<EntityMahasiswa> allArrayMahasiswa() {
        return arrayMahasiswa;
    }

    public static ArrayList<EntityDosenWali> allArrayDosenWali() {
        return arrayDosenWaliMahasiswa;
    }

    public static void tambahDosenWali(EntityMahasiswa mahasiswa, EntityDosenWali dosenWali) {
        arrayMahasiswa.add(mahasiswa);
        arrayDosenWaliMahasiswa.add(dosenWali);
        arrayPenentuanDosenWali.add(new EntityPenentuanDosenWali(mahasiswa, dosenWali));
    }

    public static EntityPenentuanDosenWali cariPenentuanDosenWali(String mahasiswa) {
        for (EntityPenentuanDosenWali objPenentuanDosenWali : arrayPenentuanDosenWali) {
            if (objPenentuanDosenWali.getMahasiswa().equals(mahasiswa)) {
                return objPenentuanDosenWali;
            }
        }
        return null;
    }
}
