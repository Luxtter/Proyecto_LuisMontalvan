/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5compendium_luismontalvan;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import static p5compendium_luismontalvan.P5Compendium_LuisMontalvan.nivel;

/**
 *
 * @author luxter
 */
public class List extends JFrame implements ActionListener {

    JComboBox comboBox;
    ArrayList nivel = new ArrayList();
    
    List() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};

        comboBox = new JComboBox((ComboBoxModel) nivel);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            
        }
    }
    public static void nivel(ArrayList nivel) {

        nivel.add(1);
        nivel.add(2);
        nivel.add(2);
        nivel.add(3);
        nivel.add(3);
        nivel.add(4);
        nivel.add(5);
        nivel.add(5);
        nivel.add(6);
        nivel.add(6);
        nivel.add(6);
        nivel.add(7);
        nivel.add(7);
        nivel.add(8);
        nivel.add(9);
        nivel.add(9);
        nivel.add(9);
        nivel.add(9);
        nivel.add(9);
        nivel.add(10);
        nivel.add(10);
        nivel.add(11);
        nivel.add(11);
        nivel.add(11);
        nivel.add(11);
        nivel.add(11);
        nivel.add(12);
        nivel.add(12);
        nivel.add(13);
        nivel.add(13);
        nivel.add(13);
        nivel.add(14);
        nivel.add(14);
        nivel.add(15);
        nivel.add(15);
        nivel.add(15);
        nivel.add(16);
        nivel.add(16);
        nivel.add(16);
        nivel.add(16);
        nivel.add(17);
        nivel.add(17);
        nivel.add(17);
        nivel.add(17);
        nivel.add(18);
        nivel.add(18);
        nivel.add(19);
        nivel.add(19);
        nivel.add(20);
        nivel.add(20);
        nivel.add(20);
        nivel.add(20);
        nivel.add(20);
        nivel.add(21);
        nivel.add(21);
        nivel.add(22);
        nivel.add(22);
        nivel.add(23);
        nivel.add(23);
        nivel.add(23);
        nivel.add(24);
        nivel.add(24);
        nivel.add(24);
        nivel.add(25);
        nivel.add(25);
        nivel.add(25);
        nivel.add(25);
        nivel.add(25);
        nivel.add(26);
        nivel.add(26);
        nivel.add(26);
        nivel.add(26);
        nivel.add(27);
        nivel.add(27);
        nivel.add(27);
        nivel.add(28);
        nivel.add(28);
        nivel.add(29);
        nivel.add(29);
        nivel.add(30);
        nivel.add(30);
        nivel.add(30);
        nivel.add(30);
        nivel.add(31);
        nivel.add(31);
        nivel.add(32);
        nivel.add(32);
        nivel.add(33);
        nivel.add(33);
        nivel.add(34);
        nivel.add(34);
        nivel.add(35);
        nivel.add(35);
        nivel.add(35);
        nivel.add(36);
        nivel.add(36);
        nivel.add(37);
        nivel.add(37);
        nivel.add(38);
        nivel.add(38);
        nivel.add(39);
        nivel.add(39);
        nivel.add(39);
        nivel.add(40);
        nivel.add(40);
        nivel.add(40);
        nivel.add(40);
        nivel.add(41);
        nivel.add(41);
        nivel.add(42);
        nivel.add(42);
        nivel.add(42);
        nivel.add(42);
        nivel.add(42);
        nivel.add(43);
        nivel.add(43);
        nivel.add(43);
        nivel.add(44);
        nivel.add(44);
        nivel.add(44);
        nivel.add(45);
        nivel.add(45);
        nivel.add(46);
        nivel.add(46);
        nivel.add(47);
        nivel.add(48);
        nivel.add(48);
        nivel.add(48);
        nivel.add(49);
        nivel.add(49);
        nivel.add(50);
        nivel.add(50);
        nivel.add(50);
        nivel.add(50);
        nivel.add(50);
        nivel.add(51);
        nivel.add(51);
        nivel.add(52);
        nivel.add(52);
        nivel.add(52);
        nivel.add(52);
        nivel.add(53);
        nivel.add(53);
        nivel.add(54);
        nivel.add(54);
        nivel.add(55);
        nivel.add(55);
        nivel.add(55);
        nivel.add(56);
        nivel.add(56);
        nivel.add(56);
        nivel.add(57);
        nivel.add(58);
        nivel.add(58);
        nivel.add(59);
        nivel.add(59);
        nivel.add(60);
        nivel.add(60);
        nivel.add(60);
        nivel.add(61);
        nivel.add(62);
        nivel.add(62);
        nivel.add(62);
        nivel.add(63);
        nivel.add(63);
        nivel.add(64);
        nivel.add(64);
        nivel.add(64);
        nivel.add(65);
        nivel.add(65);
        nivel.add(66);
        nivel.add(66);
        nivel.add(67);
        nivel.add(67);
        nivel.add(68);
        nivel.add(68);
        nivel.add(69);
        nivel.add(69);
        nivel.add(70);
        nivel.add(70);
        nivel.add(71);
        nivel.add(72);
        nivel.add(72);
        nivel.add(73);
        nivel.add(73);
        nivel.add(74);
        nivel.add(74);
        nivel.add(75);
        nivel.add(75);
        nivel.add(76);
        nivel.add(76);
        nivel.add(76);
        nivel.add(76);
        nivel.add(77);
        nivel.add(77);
        nivel.add(78);
        nivel.add(80);
        nivel.add(80);
        nivel.add(80);
        nivel.add(80);
        nivel.add(81);
        nivel.add(81);
        nivel.add(81);
        nivel.add(82);
        nivel.add(82);
        nivel.add(82);
        nivel.add(82);
        nivel.add(83);
        nivel.add(83);
        nivel.add(83);
        nivel.add(83);
        nivel.add(84);
        nivel.add(84);
        nivel.add(84);
        nivel.add(84);
        nivel.add(85);
        nivel.add(85);
        nivel.add(86);
        nivel.add(86);
        nivel.add(87);
        nivel.add(87);
        nivel.add(87);
        nivel.add(88);
        nivel.add(89);
        nivel.add(89);
        nivel.add(89);
        nivel.add(90);
        nivel.add(90);
        nivel.add(92);
        nivel.add(93);
        nivel.add(93);
        nivel.add(95);
    }
}
