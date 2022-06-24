package GUI;

import Entity.MahasiswaEntity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datamahasiswa extends component{
    int id;
    String nama, npm,email,password;

    public datamahasiswa(int id) {
        initComponent(id);
    }

    void initComponent(final int id) {
        for (MahasiswaEntity mahasiswa : allobjectcontroller.mhs.getInfo(id)) {
            this.id = mahasiswa.getId_mhs();
            this.nama = mahasiswa.getNama();
            this.npm = mahasiswa.getNpm();
            this.email = mahasiswa.getEmail();
            this.password = mahasiswa.getPass();
        }
        setTitle("INFO MAHASISWA");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);

        labelnama.setBounds(25, 50, 150, 25);
        add(labelnama);
        fieldnama.setBounds(160, 50, 150, 25);
        fieldnama.setText(nama);
        fieldnama.setEditable(false);
        add(fieldnama);

        labelnpm.setBounds(25, 90, 150, 25);
        add(labelnpm);
        fieldnpm.setBounds(160, 90, 150, 25);
        fieldnpm.setText(npm);
        fieldnpm.setEditable(false);
        add(fieldnpm);

        labelemail.setBounds(25, 130, 150, 25);
        add(labelemail);
        fieldemail.setBounds(160, 130, 150, 25);
        fieldemail.setText(email);
        fieldemail.setEditable(false);
        add(fieldemail);

        labelpassword.setBounds(25, 170, 150, 25);
        add(labelpassword);
        fieldpasswordlihat.setBounds(160, 170, 150, 25);
        fieldpasswordlihat.setText(password);
        fieldpasswordlihat.setEditable(false);
        add(fieldpasswordlihat);

        btnubahpass.setBounds(320,170,150,25);
        add(btnubahpass);

        btnubahpass.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    String pass = JOptionPane.showInputDialog("Masukan PASSWORD Baru");
                    if(pass.length() > 0){
                        allobjectcontroller.mhs.updatepass(pass,id);
                        fieldpasswordlihat.setText(pass);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });

    }
}