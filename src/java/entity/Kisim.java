/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Muhammed ARSLAN
 */
public class Kisim {
    
    private int kisim_id ;
    private String kisim_isim ; 

    public Kisim() {
    }

    public Kisim(int kisim_id, String kisim_isim) {
        this.kisim_id = kisim_id;
        this.kisim_isim = kisim_isim;
    }

    @Override
    public String toString() {
        return "Kisim{" + "kisim_id=" + kisim_id + ", kisim_isim=" + kisim_isim + '}';
    }

    
    
    public int getKisim_id() {
        return kisim_id;
    }

    public void setKisim_id(int kisim_id) {
        this.kisim_id = kisim_id;
    }

    public String getKisim_isim() {
        return kisim_isim;
    }

    public void setKisim_isim(String kisim_isim) {
        this.kisim_isim = kisim_isim;
    }
    
    
}
