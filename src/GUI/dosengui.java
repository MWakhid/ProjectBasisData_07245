package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.dosenController;
public class dosengui extends component {
    JTable tabeldiambil = new JTable();
    JScrollPane spdiambil = new JScrollPane(tabeldiambil);
    dosenController dsn = new dosenController();
    public dosengui(int id) {
        initComponent(id);
    }

    void initComponent(final int id) {
        setTitle("KRS DOSEN");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        setVisible(true);

        spdiambil.setBounds(20, 50, 650, 350);
        tabeldiambil.setModel(dsn.matkulajar(id));
        add(spdiambil);

    }
}
