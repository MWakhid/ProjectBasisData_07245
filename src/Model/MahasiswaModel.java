package Model;

import Entity.MahasiswaEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MahasiswaModel extends ModelAbstract{
    private String sql;
    public ArrayList<MahasiswaEntity> getMahasiswasatuan(int id){
        ArrayList<MahasiswaEntity> arrMahasiswa = new ArrayList<>();
        try {
            sql = "select matkul.nama_mk,matkul.sks,ruang.nama_ruang,jadwal.hari,jadwal.jam from mahasiswa inner join detail_mhs on mahasiswa.id_mhs=detail_mhs.mhs_id inner join matkul on matkul.id_matkul=detail_mhs.mk_id inner join detail_matkul on matkul.id_matkul = detail_matkul.jadwal_id inner join jadwal on detail_matkul.jadwal_id = jadwal.id_jadwal inner join detail_jadwal on jadwal.id_jadwal = detail_jadwal.jadwal_id inner join ruang on detail_jadwal.ruang_id =ruang.id_ruang where mahasiswa.id_mhs=?;";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                MahasiswaEntity mhs = new MahasiswaEntity();

                mhs.setMatkul(rs.getString("nama_mk"));
                mhs.setSks(rs.getInt("sks"));
                mhs.setRuang(rs.getString("nama_ruang"));
                mhs.setHari(rs.getString("hari"));
                mhs.setJam(rs.getString("jam"));
                arrMahasiswa.add(mhs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }return arrMahasiswa;
    }
    public ArrayList<MahasiswaEntity> getMahasiswainfo(int id) {
        ArrayList<MahasiswaEntity> arrMahasiswa = new ArrayList<>();
        try {
            sql = "SELECT * FROM mahasiswa where id_mhs =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                MahasiswaEntity mhs = new MahasiswaEntity();

                mhs.setId_mhs(rs.getInt("id_mhs"));
                mhs.setNama(rs.getString("nama"));
                mhs.setNpm(rs.getString("npm"));
                mhs.setEmail(rs.getString("email"));
                mhs.setPass(rs.getString("passmhs"));
                arrMahasiswa.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrMahasiswa;
    }
    public void updatepass(String pass, int id){
        try{
            sql = "update mahasiswa SET passmhs =? WHERE id_mhs =?";
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