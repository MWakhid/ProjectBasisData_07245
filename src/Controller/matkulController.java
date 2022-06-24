package Controller;

import Entity.MatkulEntity;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class matkulController {
    public ArrayList<MatkulEntity> getDatamatkul(){
        return allobjectcontroller.mk.getmatkul();
    }
    public DefaultTableModel daftarmk(){
        DefaultTableModel daftarmk = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        Object[] kolom = {"ID", "MATA KULIAH","SKS",};
        daftarmk.setColumnIdentifiers(kolom);
        int size = getDatamatkul().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[3];
            data[0] = allobjectcontroller.mk.getmatkul().get(i).getId_mk();
            data[1] = allobjectcontroller.mk.getmatkul().get(i).getNama();
            data[2] = allobjectcontroller.mk.getmatkul().get(i).getSks();
            daftarmk.addRow(data);
        }
        return daftarmk;
    }
    public ArrayList<MatkulEntity>getinsert(String nama, int sks) {
        return allobjectcontroller.mk.getinsert(nama, sks);
    }

    public void updatenama(String nama, int id){
        allobjectcontroller.mk.updateNama(nama,id);
    }

    public void updatesks(int sks, int id){
        allobjectcontroller.mk.updateSks(sks,id);
    }

    public void delete(int id){
        allobjectcontroller.mk.deleteData(id);
    }
}
