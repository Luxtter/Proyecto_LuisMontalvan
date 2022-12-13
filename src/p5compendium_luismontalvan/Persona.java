/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5compendium_luismontalvan;

import java.util.ArrayList;

/**
 *
 * @author luxte
 */
public class Persona {

    ArrayList nivel = new ArrayList();
    ArrayList name = new ArrayList();
    ArrayList arcana = new ArrayList();
    public int yen;

    public int getYen() {
        return yen;
    }

    public void setYen(int yen) {
        this.yen = yen;
    }

    public void inicializar() {

        this.yen = 1000000;

    }

    public void Personas(int level, String nombre, String arc) {
        nivel.add(level);
        name.add(nombre);
        arcana.add(arc);

    }
    
    public void Borrar() {
        nivel.remove(0);
        name.remove(0);
        arcana.remove(0);

    }

}
