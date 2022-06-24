package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class logindosengui extends component {

    public logindosengui() {
        initComponent();
    }

    void initComponent() {
        setTitle("Login Dosen");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);

        labelemail.setBounds(30, 150, 140, 25);
        add(labelemail);
        fieldemail.setBounds(230, 150, 130, 25);
        add(fieldemail);

        labelpassword.setBounds(30, 190, 140, 25);
        add(labelpassword);
        fieldpassword.setBounds(230, 190, 130, 25);
        add(fieldpassword);

        btnlogin.setBounds(50, 250, 280, 50);
        btnlogin.setBackground(Color.black);
        btnlogin.setForeground(Color.white);
        btnlogin.setBorder(null);
        add(btnlogin);

        btnlogmhs.setBounds(30,360,150,25);
        btnlogmhs.setBorder(null);
        btnlogmhs.setBackground(Color.white);
        add(btnlogmhs);
        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = fieldemail.getText();
                String password = fieldpassword.getText();
                int cek = allobjectcontroller.login.logindosen(email, password);
                if (cek > 0) {
                    menudosengui gui = new menudosengui(cek);
                    gui.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "AKUN TIDAK DITEMUKAN");
                    kosong();
                }
            }
        });

        btnlogmhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logingui gui = new logingui();
                dispose();
            }
        });
    }
}