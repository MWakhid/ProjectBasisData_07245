package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class menudosengui extends component {

    public menudosengui(int id) {
        initComponent(id);
    }

    void initComponent(final int id) {
        setTitle("Menu dosen");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);

        btncekmatkul.setBounds(50, 80, 280, 50);
        btncekmatkul.setBorder(null);
        add(btncekmatkul);

        btninfo.setBounds(50, 140, 280, 50);
        btninfo.setBorder(null);
        add(btninfo);

        btndatamatkul.setBounds(50, 200, 280, 50);
        btndatamatkul.setBorder(null);
        add(btndatamatkul);

        btnback.setBounds(50, 260, 200, 50);
        btnback.setBackground(Color.red);
        add(btnback);

        btncekmatkul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dosengui gui = new dosengui(id);
                gui.setVisible(true);
            }
        });
        btninfo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                datadosen gui = new datadosen(id);
                gui.setVisible(true);
            }
        });
        btndatamatkul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datamatkulgui gui = new datamatkulgui();
            }
        });

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logindosengui gui = new logindosengui();
                dispose();
            }
        });

    }


}

