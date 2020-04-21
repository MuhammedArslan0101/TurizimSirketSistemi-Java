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
public class Personel {
    private int per_id ;
    private String adsoyadi;
    private int maas ; 
    private String bas_tarihi;

    public Personel(int per_id, String adsoyadi, int maas, String bas_tarihi) {
        this.per_id = per_id;
        this.adsoyadi = adsoyadi;
        this.maas = maas;
        this.bas_tarihi = bas_tarihi;
    }

    public Personel() {
    }

    @Override
    public String toString() {
        return "Personel{" + "per_id=" + per_id + ", adsoyadi=" + adsoyadi + ", maas=" + maas + ", bas_tarihi=" + bas_tarihi + '}';
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public String getAdsoyadi() {
        return adsoyadi;
    }

    public void setAdsoyadi(String adsoyadi) {
        this.adsoyadi = adsoyadi;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getBas_tarihi() {
        return bas_tarihi;
    }

    public void setBas_tarihi(String bas_tarihi) {
        this.bas_tarihi = bas_tarihi;
    }
    
    
    
}
