package Model;

import Entity.MatkulEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MatkulModel extends ModelAbstract {
    private String sql;

    public ArrayList<MatkulEntity> getmatkul() {
        ArrayList<MatkulEntity> arrMatkul = new ArrayList<>();
        try {
            sql = "select * from matkul;";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                MatkulEntity mk = new MatkulEntity();

                mk.setId_mk(rs.getInt("id_matkul"));
                mk.setNama(rs.getString("nama_mk"));
                mk.setSks(rs.getInt("sks"));
                arrMatkul.add(mk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrMatkul;
    }
    public ArrayList<MatkulEntity> getinsert(String nama, int sks) {
        ArrayList<MatkulEntity> arraylistMatkul = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            // query simpan
            String sql = "INSERT INTO matkul (nama_mk,sks) VALUE('%s','%d')";
            sql = String.format(sql, nama, sks);
            stat.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return arraylistMatkul;
    }
    public void updateNama(String nama, int id){
        try{
            sql = "update matkul SET nama_mk =? WHERE id_matkul =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setInt(2, id);
            stat.executeUpdate();
        } catch (SQLException e){
            System.out.println("GAGAL RUBAH NAMA!");
            e.printStackTrace();
        }
    }

    public void updateSks(int sks, int id){
        try{
            sql = "update matkul SET sks =? WHERE id_matkul =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, sks);
            stat.setInt(2, id);
            stat.executeUpdate();
        } catch (SQLException e){
            System.out.println("GAGAL RUBAH SKS!");
            e.printStackTrace();
        }
    }
    public void deleteData(int id){
        try {
            sql = "DELETE FROM matkul where id_matkul =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println("GAGAL Hapus DATA!!!");
        }
    }
}