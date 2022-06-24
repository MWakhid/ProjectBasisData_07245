package GUI;
import javax.swing.*;

public class component extends JFrame {
    protected JButton btnlogin = new JButton("LOG IN");
    protected JButton btnback = new JButton("<< LOG OUT");
    protected JButton btninfo = new JButton("INFO");
    protected JButton btnubahpass = new JButton("UBAH PASSWORD");
    protected JButton btnlogmhs = new JButton("LOGIN AS MAHASISWA");
    protected JButton btnlogdsn = new JButton("LOGIN AS DOSEN");
    protected JButton btncekmatkul = new JButton("MATA KULIAH AJAR");
    protected JButton btndatamatkul = new JButton("DATA MATA KULIAH");
    protected JButton btnaddmatkul = new JButton("TAMBAH MATA KULIAH");
    protected JButton btneditnama = new JButton("EDIT NAMA");
    protected JButton btneditsks = new JButton("EDIT SKS");
    protected JButton btnhapusmatkul = new JButton("HAPUS MATKUL");
    protected JButton btnrefresh = new JButton("REFRESH");

    protected JLabel labelnama = new JLabel("NAMA");
    protected JLabel labelnpm = new JLabel("NPM");
    protected JLabel labelnip = new JLabel("NIP");
    protected JLabel labelemail = new JLabel("EMAIL");
    protected JLabel labelpassword = new JLabel("PASSWORD");

    protected JTextField fieldnama = new JTextField();
    protected JTextField fieldnpm = new JTextField();
    protected JTextField fieldnip = new JTextField();
    protected JTextField fieldemail = new JTextField();
    protected JTextField fieldpasswordlihat = new JTextField();
    protected JPasswordField fieldpassword = new JPasswordField();

    void kosong(){
        fieldemail.setText(null);
        fieldpassword.setText(null);
    }
}
