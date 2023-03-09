/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1_2;

/**
 *
 * @author ASUS
 */
public class Hidangan {
        protected String namaHidangan;
    
    public String getNamaHidangan(){
        return namaHidangan;
    }
    
    public void setNamaHidangan(String namaHidangan){
        this.namaHidangan = namaHidangan ;
    }
    
    public String disantap(){
        return "Makanan Dihidangkan";
    }
}
