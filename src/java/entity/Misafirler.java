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
public class Misafirler {
    
    private int misafir_id; 
    private String adi_soyadi ; 
    private String milliyet ;
    private int kalacak_sure ; 
    private int butce ; 

    public Misafirler() {
    }

    public Misafirler(int misafir_id, String adi_soyadi, String milliyet, int kalacak_sure, int butce) {
        this.misafir_id = misafir_id;
        this.adi_soyadi = adi_soyadi;
        this.milliyet = milliyet;
        this.kalacak_sure = kalacak_sure;
        this.butce = butce;
    }

    @Override
    public String toString() {
        return "Misafirler{" + "misafir_id=" + misafir_id + ", adi_soyadi=" + adi_soyadi + ", milliyet=" + milliyet + ", kalacak_sure=" + kalacak_sure + ", butce=" + butce + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.misafir_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Misafirler other = (Misafirler) obj;
        if (this.misafir_id != other.misafir_id) {
            return false;
        }
        return true;
    }

    public int getMisafir_id() {
        return misafir_id;
    }

    public void setMisafir_id(int misafir_id) {
        this.misafir_id = misafir_id;
    }

    public String getAdi_soyadi() {
        return adi_soyadi;
    }

    public void setAdi_soyadi(String adi_soyadi) {
        this.adi_soyadi = adi_soyadi;
    }

    public String getMilliyet() {
        return milliyet;
    }

    public void setMilliyet(String milliyet) {
        this.milliyet = milliyet;
    }

    public int getKalacak_sure() {
        return kalacak_sure;
    }

    public void setKalacak_sure(int kalacak_sure) {
        this.kalacak_sure = kalacak_sure;
    }

    public int getButce() {
        return butce;
    }

    public void setButce(int butce) {
        this.butce = butce;
    }
    
    
    
}
