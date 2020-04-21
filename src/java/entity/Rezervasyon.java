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
public class Rezervasyon {
    
    private int rezer_id ;
    private String otel_isim ;
    private String oda_tipi ;
    private String giris_tarihi;
    private String cikis_tarihi ;
    private int upgrade ;
    private int gecelik_fiyati ;

    public Rezervasyon() {
    }

    public Rezervasyon(int rezer_id, String otel_isim, String oda_tipi, String giris_tarihi, String cikis_tarihi, int upgrade, int gecelik_fiyati) {
        this.rezer_id = rezer_id;
        this.otel_isim = otel_isim;
        this.oda_tipi = oda_tipi;
        this.giris_tarihi = giris_tarihi;
        this.cikis_tarihi = cikis_tarihi;
        this.upgrade = upgrade;
        this.gecelik_fiyati = gecelik_fiyati;
    }

    public int getRezer_id() {
        return rezer_id;
    }

    public void setRezer_id(int rezer_id) {
        this.rezer_id = rezer_id;
    }

    public String getOtel_isim() {
        return otel_isim;
    }

    public void setOtel_isim(String otel_isim) {
        this.otel_isim = otel_isim;
    }

    public String getOda_tipi() {
        return oda_tipi;
    }

    public void setOda_tipi(String oda_tipi) {
        this.oda_tipi = oda_tipi;
    }

    public String getGiris_tarihi() {
        return giris_tarihi;
    }

    public void setGiris_tarihi(String giris_tarihi) {
        this.giris_tarihi = giris_tarihi;
    }

    public String getCikis_tarihi() {
        return cikis_tarihi;
    }

    public void setCikis_tarihi(String cikis_tarihi) {
        this.cikis_tarihi = cikis_tarihi;
    }

    public int getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(int upgrade) {
        this.upgrade = upgrade;
    }

    public int getGecelik_fiyati() {
        return gecelik_fiyati;
    }

    public void setGecelik_fiyati(int gecelik_fiyati) {
        this.gecelik_fiyati = gecelik_fiyati;
    }

    @Override
    public String toString() {
        return "Rezervasyon{" + "rezer_id=" + rezer_id + ", otel_isim=" + otel_isim + ", oda_tipi=" + oda_tipi + ", giris_tarihi=" + giris_tarihi + ", cikis_tarihi=" + cikis_tarihi + ", upgrade=" + upgrade + ", gecelik_fiyati=" + gecelik_fiyati + '}';
    }
    
    
    
    
}
