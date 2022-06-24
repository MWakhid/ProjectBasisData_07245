package Controller;

import Entity.MahasiswaEntity;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class mahasiswaController {
    public ArrayList<MahasiswaEntity> getDatamahasiswa(int id){
        return allobjectcontroller.mhs.getMahasiswasatuan(id);
    }
    public DefaultTableModel matkuldiambil(int id){
        DefaultTableModel datadiambil = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        Object[] kolom = {"MATA KULIAH", "SKS","RUANG","HARI","JAM"};
        datadiambil.setColumnIdentifiers(kolom);
        int size = getDatamahasiswa(id).size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[5];
            data[0] = allobjectcontroller.mhs.getMahasiswasatuan(id).get(i).getMatkul();
            data[1] = allobjectcontroller.mhs.getMahasiswasatuan(id).get(i).getSks();
            data[2] = allobjectcontroller.mhs.getMahasiswasatuan(id).get(i).getRuang();
            data[3] = allobjectcontroller.mhs.getMahasiswasatuan(id).get(i).getHari();
            data[4] = allobjectcontroller.mhs.getMahasiswasatuan(id).get(i).getJam();
            datadiambil.addRow(data);
        }
        return datadiambil;
    }
    public ArrayList<MahasiswaEntity> getInfo(int id){
        return allobjectcontroller.mhs.getMahasiswainfo(id);
    }
    public void updatepass(String pass, int id){
        allobjectcontroller.mhs.updatepass(pass,id);
    }
}
