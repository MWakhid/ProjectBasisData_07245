package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel extends ModelAbstract{
    private String sql;
    public LoginModel(){};
    public int cekLogin(String email, String password){
        int cek = 0;
        try{
            sql = "SELECT * FROM mahasiswa where email = ? and passmhs = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, email);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id_mhs");
            } else {
                cek = 0;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } return cek;
    }

    public int cekLogindosen(String email, String password){
        int cek = 0;
        try{
            sql = "SELECT * FROM dosen where email = ? and passdsn = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, email);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id_dosen");
            } else {
                cek = 0;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } return cek;
    }
}