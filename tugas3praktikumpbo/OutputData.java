/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3praktikumpbo;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OutputData {
    public OutputData(String nama, String jeniskelamin, String agama, String hobby){
        JFrame bingkai = new JFrame ("Data Diri");
        JLabel lnama = new JLabel ("Nama Lengkap");
        JLabel rnama = new JLabel(nama);
        JLabel ljeniskelamin = new JLabel ("Jenis Kelamin");
        JLabel rjeniskelamin = new JLabel(jeniskelamin);
        JLabel lagama = new JLabel ("Agama");
        JLabel ragama = new JLabel(agama);
        JLabel lhobby = new JLabel ("Hobby");
        JLabel rhobby = new JLabel (hobby);
        
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bingkai.setSize(350, 200);
        bingkai.setVisible(true);
        bingkai.setLayout(null);
        bingkai.add(lnama);
        bingkai.add(rnama);
        bingkai.add(ljeniskelamin);
        bingkai.add(rjeniskelamin);
        bingkai.add(lagama);
        bingkai.add(ragama);
        bingkai.add(lhobby);
        bingkai.add(rhobby);
        
        lnama.setBounds(10, 10, 120, 20);
        rnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        rjeniskelamin.setBounds(130, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        ragama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        rhobby.setBounds(130, 85, 140, 20);
    }
}
