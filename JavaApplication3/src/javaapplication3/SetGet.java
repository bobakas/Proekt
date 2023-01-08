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
    private final String[] otbori = {"Манчестър Сити", "Байерн Мюнхен", "Реал Мадрид", "ПСЖ", "Милан", /*  */
       "Барселона", "Арсенал", "Интер", "Челси", "Ливърпул",/* */
       "Манчестър Юнайтед", "Атлетико Мадрид", "Севилия",  "Ювентус",  "Борусия Дортрмунд",/**/
       "РБ Лайпциг", "Байер Леверкузен", "Унион Берлин",  "Виляреал", "Аталанта", "Тотнъм"};
    private String otbor1, otbor2;

    public String getOtbor1() {
        return otbor1;
    }

    public void setOtbor1(String otbor1) {
        this.otbor1 = otbor1;
    }

    public String getOtbor2() {
        return otbor2;
    }

    public void setOtbor2(String otbor2) {
        this.otbor2 = otbor2;
    }
    public String[] getOtbori() {
        return otbori;
    }
    
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
