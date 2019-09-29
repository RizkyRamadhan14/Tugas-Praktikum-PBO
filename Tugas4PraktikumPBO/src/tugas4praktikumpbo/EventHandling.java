/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4praktikumpbo;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventHandling {
    

    JFrame frame = new JFrame();
    JLabel label = new JLabel("");
    
    //Nama
    JLabel nama = new JLabel ("Nama anda : ");
    JTextField inputnama = new JTextField();
    
    //Jenis Kelamin
    JLabel jeniskelamin = new JLabel("Jenis Kelamin : ");
    JRadioButton kelaminL = new JRadioButton("Laki - Laki");
    JRadioButton kelaminP = new JRadioButton("Perempuan");
    ButtonGroup klikkelamin = new ButtonGroup();
    JTextField kelamin = new JTextField("Silahkan pilih jenis kelamin anda : ");
    
    //Agama
    JLabel agama = new JLabel("Agama : ");
    String[] pilihanAgama = {"Islam","Protestan","Katolik","Hindu","Budha","Konghuchu"};
    JComboBox Agamapilihan = new JComboBox(pilihanAgama);
    JTextField Agamanya = new JTextField("Silahkan pilih agama anda : ");
    
    //Hobi
    JLabel hobi = new JLabel("Hobi : ");
    JCheckBox sepakbola = new JCheckBox("Sepakbola");
    JCheckBox basket = new JCheckBox("Basket");
    JCheckBox voli = new JCheckBox("Voli");
    JCheckBox badminton = new JCheckBox("Badminton"); 
    JTextField hobianda = new JTextField ("Pilihlah hobi yang anda minati : ");
    
    //Mouse Listener
    JTextField saya = new JTextField("Saya");
    JTextField ia = new JTextField("Ia");
    JTextField dirinya = new JTextField("Dirinya");
    JTextField hasil = new JTextField ("Siapa yang diselamatkan duluan?");
    JTextField keluaran = new JTextField();
    
    public EventHandling(){
        
        frame.setTitle("Data Diri Mahasiswa");
        frame.setSize(800, 700); //Ukuran Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setelah window ditutup proses pun distop
        frame.setVisible(true); //untuk menggunkan window
        frame.setLayout(null);
    
        //bagian frame nama
        frame.add(label);
        label.setBounds(330, 30, 300, 10);
        frame.add(nama);
        nama.setBounds(130, 70, 300, 30);
        frame.add(inputnama);
        inputnama.setBounds(300, 70, 300, 30);
        inputnama.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        //bagian frame jenis kelamin
        frame.add(jeniskelamin);
        jeniskelamin.setBounds(130, 70, 300, 100);
        frame.add(kelaminL);
        kelaminL.setBounds(300, 105, 100, 30);
        frame.add(kelaminP);
        kelaminP.setBounds(400, 105, 200, 30);
        
        klikkelamin.add(kelaminL);
        klikkelamin.add(kelaminP);
        //perubahan pada text field jika diklik salah satu kelamin
        //jika dipilih laki - laki
        kelaminL.addItemListener((ItemEvent event) -> {
        if (event.getSource() == kelaminL){
            
            if (event.getStateChange() == ItemEvent.SELECTED){
            kelamin.setText("Laki - laki"); //maka pada text field berubah menjadi laki - laki 
        }
        }
        });
        
        //jika dipilih perempuan
        kelaminP.addItemListener((ItemEvent event)->{
        if (event.getSource() == kelaminP){
        
            if(event.getStateChange() == ItemEvent.SELECTED){
            kelamin.setText("Perempuan"); //maka pada text field berubah menjadi laki - laki
        }
        }
        });
        //frame kelamin hasil dari pilihan
        frame.add(kelamin);
        kelamin.setBounds(300, 140, 300, 30);
        kelamin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        kelamin.setEditable(false); //agar keluaran tidak dapat diedit
        
        //bagian frame agama
        frame.add(agama);
        agama.setBounds(130, 190, 300, 30);
        frame.add(Agamapilihan);
        Agamapilihan.setBounds(300, 190, 100, 30);
        
        //perubahan pada text field jika diklik salah satu agama
        Agamapilihan.addItemListener((ItemEvent event) -> {
            if(event.getStateChange() == ItemEvent.SELECTED){
                if(Agamapilihan.getSelectedIndex() == 0){
                    Agamanya.setText("Islam");
                }
                else if(Agamapilihan.getSelectedIndex() == 1){
                    Agamanya.setText("Protestan");
                }
                else if(Agamapilihan.getSelectedIndex() == 2){
                    Agamanya.setText("Katolik");
                }
                else if(Agamapilihan.getSelectedIndex() == 3){
                    Agamanya.setText("Hindu");
                }
                else if(Agamapilihan.getSelectedIndex() == 4){
                    Agamanya.setText("Budha");
                }
                else if(Agamapilihan.getSelectedIndex() == 5){
                    Agamanya.setText("Konghuchu");
                }
            }
        });
        //frame agama hasil dari pilihan
        frame.add(Agamanya);
        Agamanya.setBounds(300, 230, 300, 30);
        Agamanya.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        Agamanya.setEditable(false); //agar keluaran tidak dapat diedit
        
        //bagian frame hobi
        frame.add(hobi);
        hobi.setBounds(130, 290, 150, 20);
        
        frame.add(sepakbola);
        sepakbola.setBounds(300, 290, 100, 20);
        sepakbola.addItemListener((ItemEvent event) -> {
            if(event.getSource() == sepakbola){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hobianda.setText("Sepakbola");
                }
            }
        });
        
        frame.add(basket);
        basket.setBounds(425, 290, 100, 20);
        basket.addItemListener((ItemEvent event) -> {
            if(event.getSource() == basket){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hobianda.setText("Basket");
                }
            }
        });
        
        frame.add(voli);
        voli.setBounds(550, 290, 100, 20);
        voli.addItemListener((ItemEvent event) -> {
            if(event.getSource() == voli){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hobianda.setText("Voli");
                }
            }
        });
        
        frame.add(badminton);
        badminton.setBounds(675, 290, 100, 20);
        badminton.addItemListener((ItemEvent event) -> {
            if(event.getSource() == badminton){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hobianda.setText("Badminton");
                }
            }
        });
        
        /* saya masih bingung kenapa isSelected()(biar bisa checkbox lebih dari satu) tidak bisa digunakan
        if(sepakbola.isSelected() && basket.isSelected()){
            hobianda.setText("Sepakbola & Basket"); // = sepakbola.getText()+(" dan ")+basket.getText
        }
        else if(sepakbola.isSelected() && voli.isSelected()){
            hobianda.setText("Sepakbola & Voli");
        }
        else if(sepakbola.isSelected() && badminton.isSelected()){
            hobianda.setText("Sepakbola & Badminton");
        }
        else if(basket.isSelected() && voli.isSelected()){
            hobianda.setText("Basket & Voli");
        }
        else if(basket.isSelected() && badminton.isSelected()){
            hobianda.setText("Basket & Badminton");
        }
        else if(voli.isSelected() && badminton.isSelected()){
            hobianda.setText("Voli & Badminton");
        }
        else if(sepakbola.isSelected() && basket.isSelected() && voli.isSelected()){
            hobianda.setText("Sepakbola, Basket dan Voli");
        }
        else if(sepakbola.isSelected() && basket.isSelected() && badminton.isSelected()){
            hobianda.setText("Sepakbola, Basket dan Badminton");
        }
        else if(sepakbola.isSelected() && voli.isSelected() && badminton.isSelected()){
            hobianda.setText("Sepakbola, Voli dan Badminton");
        }
        else if(basket.isSelected() && voli.isSelected() && badminton.isSelected()){
            hobianda.setText("Sepakbola, Basket dan Voli");
        }
        else if(sepakbola.isSelected() && basket.isSelected() && voli.isSelected() && badminton.isSelected()){
            hobianda.setText("Sepakbola, Basket, Voli dan Badminton");
        }
        ;*/
        
        //frame hobi hasil dari pilihan
        frame.add(hobianda);
        hobianda.setBounds(300, 320, 300, 30);
        hobianda.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        hobianda.setEditable(false); //agar keluaran tidak dapat diedit

        //mouselistener
        frame.add(saya);
        saya.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        saya.setBackground(Color.PINK);
        saya.setBounds(130, 390, 100, 40);
        saya.setEditable(false); //agar keluaran tidak dapat diedit
        saya.setHorizontalAlignment(JTextField.CENTER); //agar ada ditengah tengah
        
        saya.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                keluaran.setText(saya.getText());
            }
        });
        
        frame.add(ia);
        ia.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        ia.setBackground(Color.PINK);
        ia.setBounds(320, 390, 100, 40);
        ia.setEditable(false); //agar keluaran tidak dapat diedit
        ia.setHorizontalAlignment(JTextField.CENTER); //agar ada ditengah tengah
        
        ia.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                keluaran.setText(ia.getText());
            }
        });
        
        frame.add(dirinya);
        dirinya.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        dirinya.setBackground(Color.PINK);
        dirinya.setBounds(500, 390, 100, 40);
        dirinya.setEditable(false); //agar keluaran tidak dapat diedit
        dirinya.setHorizontalAlignment(JTextField.CENTER); //agar ada ditengah tengah
        
        dirinya.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                keluaran.setText(dirinya.getText());
            }
        });
        
        //frame keluaran
        frame.add(hasil);
        hasil.setBounds(260, 480, 218, 80);
        hasil.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        hasil.setEditable(false); //agar keluaran tidak dapat diedit
        hasil.setHorizontalAlignment(JTextField.CENTER); //agar ada ditengah tengah
    }
}
