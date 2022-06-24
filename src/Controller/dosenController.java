package Controller;

import Entity.DosenEntity;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class dosenController {
    public ArrayList<DosenEntity> getDatadosen(int id) {
        return allobjectcontroller.dosen.getDosenSatuan(id);
    }

    public DefaultTableModel matkulajar(int id) {
        DefaultTableModel matkulajar = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        Object[] kolom = {"MATA KULIAH", "SKS", "RUANG", "HARI", "JAM"};
        matkulajar.setColumnIdentifiers(kolom);
        int size = getDatadosen(id).size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[5];
            data[0] = allobjectcontroller.dosen.getDosenSatuan(id).get(i).getMatkul();
            data[1] = allobjectcontroller.dosen.getDosenSatuan(id).get(i).getSks();
            data[2] = allobjectcontroller.dosen.getDosenSatuan(id).get(i).getRuang();
            data[3] = allobjectcontroller.dosen.getDosenSatuan(id).get(i).getHari();
            data[4] = allobjectcontroller.dosen.getDosenSatuan(id).get(i).getJam();
            matkulajar.addRow(data);
        }
        return matkulajar;
    }
    public ArrayList<DosenEntity> getInfo(int id){
        return allobjectcontroller.dosen.getDoseninfo(id);
    }

    public void updatepass(String pass, int id){
        allobjectcontroller.dosen.updatepass(pass, id);
    }
}
