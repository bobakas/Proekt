/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author ema_makarova
 */
public class SetGet {
    private int izbor;
    private int broi;
    public int getIzbor(){
        return izbor;
    }
    public void setIzbor(int izbor){
        this.izbor=izbor;
    }
    public int getBroi(){
        return broi;
    }
    public void setBroi(int broi){
        this.broi=broi;
    }
    private int i=3;
     public int getI(){
         return i;
     }
     public void setI(int i){
         this.i=i+1;
         System.out.println(this.i+", "+i);
     }
    
}
