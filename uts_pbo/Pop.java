/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

/**
 *
 * @author hardi
 */
public class Pop {
   
    String Penyanyi = "Raisa";
    String lagu ="Kali Kedua";
    
    Pop(){
        
    }
    Pop (String penyanyi, String lagu){
        this.Penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.Penyanyi+"<=>"+this.lagu);
    }
    
    public void singer(String penyanyi){
        this.Penyanyi = penyanyi;
    }
    
    protected void song(String lagu){
        this.lagu = lagu;
    }
    
    public void cetakLabel(){
        System.out.println(this.Penyanyi+" <=> "+this.lagu);
    }
}

