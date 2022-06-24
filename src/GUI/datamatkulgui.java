package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.*;
public class datamatkulgui extends component{
    JTable tabeldiambil = new JTable();
    JScrollPane spdiambil = new JScrollPane(tabeldiambil);
    matkulController mk = new matkulController();

    public datamatkulgui(){
        initComponent();
    }

    void initComponent() {
        setTitle("DATA MATA KULIAH");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        setVisible(true);

        spdiambil.setBounds(20, 50, 650, 350);
        tabeldiambil.setModel(mk.daftarmk());
        add(spdiambil);

        btnaddmatkul.setBounds(20,15,180,25);
        add(btnaddmatkul);

        btneditnama.setBounds(220,15,100,25);
        add(btneditnama);

        btneditsks.setBounds(330,15,100,25);
        add(btneditsks);

        btnhapusmatkul.setBounds(440,15,180,25);
        add(btnhapusmatkul);

        btnrefresh.setBounds(20,400,100,25);
        btnrefresh.setBorder(null);
        btnrefresh.setBackground(Color.white);
        add(btnrefresh);

        btnaddmatkul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nama = JOptionPane.showInputDialog("Nama : ");
                    int sks = Integer.parseInt(JOptionPane.showInputDialog("SKS : "));
                    if (nama.length() != 0) {
                        allobjectcontroller.mk.getinsert(nama,sks);
                        JOptionPane.showMessageDialog(null, "Data ditambahkan");
                        dispose();
                        initComponent();
                    } else {
                        JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Dibatalkan");
                }
            }
        });

        btneditnama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Masukan ID MATKUL yang akan diubah"));
                    String inputnama = JOptionPane.showInputDialog("Masukan NAMA MATKUL Baru");
                    if(inputnama.length() > 0){
                        allobjectcontroller.mk.updatenama(inputnama,id);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });

        btneditsks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Masukan ID MATKUL yang akan diubah"));
                    int sks = Integer.parseInt(JOptionPane.showInputDialog("Masukan SKS Baru"));
                    String cek = Integer.toString(sks);
                    if(cek.length() > 0){
                        allobjectcontroller.mk.updatesks(sks,id);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });

        btnhapusmatkul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Masukan ID MATKUL yang akan dihapus"));
                    String cek = Integer.toString(id);
                    if(cek.length() > 0){
                        allobjectcontroller.mk.delete(id);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
                datamatkulgui gui = new datamatkulgui();
                dispose();
            }
        });

        btnrefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datamatkulgui gui = new datamatkulgui();
                dispose();
            }
        });
    }
}