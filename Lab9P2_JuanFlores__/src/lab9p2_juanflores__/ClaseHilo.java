/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_juanflores__;

import java.awt.Color;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicProgressBarUI;


public class ClaseHilo extends Thread{
    private Color color;
    private int segundos;
    private JProgressBar p = new JProgressBar();
    
    private boolean vivir = true;

    public ClaseHilo() {
    }

    
    
    public ClaseHilo(JProgressBar p) {
        this.p=p;
    }
    
    

    public ClaseHilo(Color color, int segundos, JProgressBar p) {
        this.color = color;
        this.segundos = segundos;
        this.p=p;
        
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public JProgressBar getP() {
        return p;
    }

    public void setP(JProgressBar p) {
        this.p = p;
    }

    public boolean isVivir() {
        return vivir;
    }

    public void setVivir(boolean vivir) {
        this.vivir = vivir;
    }
    
    public void run(){
        
        while(vivir){
           
            p.setValue(p.getValue()+35);
            if(p.getValue()==100000000){
                vivir=false;
            }
            try {
                 Thread.sleep(segundos*1000);
            } catch (Exception e) {
               
            }
            
        }
    }
    
    
    
}
