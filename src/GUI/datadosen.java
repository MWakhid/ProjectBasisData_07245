package GUI;

import Entity.DosenEntity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datadosen extends component{
    int id;
    String nama,nip,email,password;

    public datadosen(int id) {
        initComponent(id);
    }

    void initComponent(final int id) {
        for (DosenEntity dsn : allobjectcontroller.dosen.getInfo(id)) {
            this.id = dsn.getId_dosen();
            this.nama = dsn.getNama();
            this.nip = dsn.getNip();
            this.email = dsn.getEmail();
            this.password = dsn.getPass();
        }
        setTitle("INFO DOSEN");
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

        labelnip.setBounds(25, 90, 150, 25);
        add(labelnip);
        fieldnip.setBounds(160, 90, 150, 25);
        fieldnip.setText(nip);
        fieldnip.setEditable(false);
        add(fieldnip);

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
                        allobjectcontroller.dosen.updatepass(pass,id);
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