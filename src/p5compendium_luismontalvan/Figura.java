/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5compendium_luismontalvan;

/**
 *
 * @author luism
 */
public class Figura {
   public int largo;
   public int alto;
   public int ancho;
   public int figura;

    public Figura(int largo, int alto, int ancho, int figura) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
        this.figura = figura;
    }

    
   
   
   public double area(int figura){
       double area;
       if(figura==2){
         area= (1/2)*alto*largo;  
       }else{
           area= largo*ancho;
       }
       return area;
    }
   public double volumen(int figura){
       double volumen;
       if(figura==1){
         volumen= largo*largo*largo;  
       }else if(figura==3){
           volumen= largo*ancho*alto;
       }else{
           volumen= largo*alto;
       }
       return volumen;
    }
   
}


