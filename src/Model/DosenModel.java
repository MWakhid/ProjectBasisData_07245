package Model;

import Entity.DosenEntity;
import Entity.MahasiswaEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DosenModel extends ModelAbstract {
    private String sql;

    public ArrayList<DosenEntity> getDosenSatuan(int id) {
        ArrayList<DosenEntity> arrDosen = new ArrayList<>();
        try {
            sql = "select matkul.nama_mk,matkul.sks,ruang.nama_ruang,jadwal.hari,jadwal.jam from dosen inner join detail_dsn on dosen.id_dosen=detail_dsn.dsn_id inner join matkul on matkul.id_matkul=detail_dsn.mk_id inner join detail_matkul on matkul.id_matkul = detail_matkul.jadwal_id inner join jadwal on detail_matkul.jadwal_id = jadwal.id_jadwal inner join detail_jadwal on jadwal.id_jadwal = detail_jadwal.jadwal_id inner join ruang on detail_jadwal.ruang_id =ruang.id_ruang where dosen.id_dosen=?;";            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                DosenEntity dsn = new DosenEntity();

                dsn.setMatkul(rs.getString("nama_mk"));
                dsn.setSks(rs.getInt("sks"));
                dsn.setRuang(rs.getString("nama_ruang"));
                dsn.setHari(rs.getString("hari"));
                dsn.setJam(rs.getString("jam"));
                arrDosen.add(dsn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrDosen;
    }
    public ArrayList<DosenEntity> getDoseninfo(int id) {
        ArrayList<DosenEntity> arrDosen = new ArrayList<>();
        try {
            sql = "SELECT * FROM dosen where id_dosen =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                DosenEntity dsn = new DosenEntity();
                dsn.setId_dosen(rs.getInt("id_dosen"));
                dsn.setNama(rs.getString("nama"));
                dsn.setNip(rs.getString("nip"));
                dsn.setEmail(rs.getString("email"));
                dsn.setPass(rs.getString("passdsn"));
                arrDosen.add(dsn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrDosen;
    }

    public void updatepass(String pass, int id){
        try{
            sql = "update dosen SET passdsn =? WHERE id_dosen =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, pass);
            stat.setInt(2, id);
            stat.executeUpdate();
        } catch (SQLException e){
            System.out.println("GAGAL RUBAH PASSWORD!");
            e.printStackTrace();
        }
    }
}