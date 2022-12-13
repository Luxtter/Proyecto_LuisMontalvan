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
public class Summoning implements ActionListener{

    JFrame frame = new JFrame("Welcome to the Velvet Room");
    JButton Summon = new JButton("S1");
    JButton Delete = new JButton("D1");
    
    
    Summoning() {
        new List();
        
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
