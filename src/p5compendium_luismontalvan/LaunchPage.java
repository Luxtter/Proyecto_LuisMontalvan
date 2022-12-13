/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5compendium_luismontalvan;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author luxter
 */
public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame("Welcome to the Velvet Room");
    JButton Summon = new JButton("Summon a Persona");
    JButton Delete = new JButton("Delete a Persona");
    
    LaunchPage() {

        Summon.setBounds(100, 160, 200, 40);
        Summon.setFocusable(false);
        Summon.addActionListener(this);
        Delete.setBounds(100, 260, 200, 40);
        Delete.setFocusable(false);
        Delete.addActionListener(this);

        frame.add(Summon);
        frame.add(Delete);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Summon) {
            frame.dispose();
            Summoning myWindow = new Summoning();
        }else if(e.getSource() == Delete){
            frame.dispose();
            Summoning myWindow = new Summoning();
        }
    }
}
