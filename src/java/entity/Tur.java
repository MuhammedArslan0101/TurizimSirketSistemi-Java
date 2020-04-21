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
public class Tur {
    
    private int tur_id ;
    private String bas_tarih ;
    private String donus_tarihi;
    private int kisi_sayisi ;

    public Tur() {
    }

    public Tur(int tur_id, String bas_tarih, String donus_tarihi, int kisi_sayisi) {
        this.tur_id = tur_id;
        this.bas_tarih = bas_tarih;
        this.donus_tarihi = donus_tarihi;
        this.kisi_sayisi = kisi_sayisi;
    }

    @Override
    public String toString() {
        return "Tur{" + "tur_id=" + tur_id + ", bas_tarih=" + bas_tarih + ", donus_tarihi=" + donus_tarihi + ", kisi_sayisi=" + kisi_sayisi + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.tur_id;
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
        final Tur other = (Tur) obj;
        if (this.tur_id != other.tur_id) {
            return false;
        }
        return true;
    }

    
    
    
    public int getTur_id() {
        return tur_id;
    }

    public void setTur_id(int tur_id) {
        this.tur_id = tur_id;
    }

    public String getBas_tarih() {
        return bas_tarih;
    }

    public void setBas_tarih(String bas_tarih) {
        this.bas_tarih = bas_tarih;
    }

    public String getDonus_tarihi() {
        return donus_tarihi;
    }

    public void setDonus_tarihi(String donus_tarihi) {
        this.donus_tarihi = donus_tarihi;
    }

    public int getKisi_sayisi() {
        return kisi_sayisi;
    }

    public void setKisi_sayisi(int kisi_sayisi) {
        this.kisi_sayisi = kisi_sayisi;
    }
    
    
    
}
