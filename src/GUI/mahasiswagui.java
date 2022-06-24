package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.*;
public class mahasiswagui extends component{
    JTable tabeldiambil = new JTable();
    JScrollPane spdiambil = new JScrollPane(tabeldiambil);
    mahasiswaController mhs = new mahasiswaController();

    public mahasiswagui(int id){
        initComponent(id);
    }

    void initComponent(final int id) {
        setTitle("KRS MAHASISWA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        setVisible(true);

        spdiambil.setBounds(20, 50, 650, 350);
        tabeldiambil.setModel(mhs.matkuldiambil(id));
        add(spdiambil);

        btninfo.setBounds(150,15,120,25);
        add(btninfo);

        btnback.setBounds(20,15,120,25);
        btnback.setBackground(Color.red);
        add(btnback);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logingui gui = new logingui();
                dispose();
            }
        });

        btninfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datamahasiswa gui = new datamahasiswa(id);
            }
        });
    }
}