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
public class Oteller {

    private int otel_id;
    private String otel_isim;
    private int oda_sayisi;
    private int yildiz_sayisi;
    private String ozelikler;

    public Oteller() {
    }

    public Oteller(int otel_id, String otel_isim, int oda_sayisi, int yildiz_sayisi, String ozelikler) {
        this.otel_id = otel_id;
        this.otel_isim = otel_isim;
        this.oda_sayisi = oda_sayisi;
        this.yildiz_sayisi = yildiz_sayisi;
        this.ozelikler = ozelikler;
    }

    @Override
    public String toString() {
        return "Oteller{" + "otel_id=" + otel_id + ", otel_isim=" + otel_isim + ", oda_sayisi=" + oda_sayisi + ", yildiz_sayisi=" + yildiz_sayisi + ", ozelikler=" + ozelikler + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.otel_id;
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
        final Oteller other = (Oteller) obj;
        if (this.otel_id != other.otel_id) {
            return false;
        }
        return true;
    }

    public int getOtel_id() {
        return otel_id;
    }

    public void setOtel_id(int otel_id) {
        this.otel_id = otel_id;
    }

    public String getOtel_isim() {
        return otel_isim;
    }

    public void setOtel_isim(String otel_isim) {
        this.otel_isim = otel_isim;
    }

    public int getOda_sayisi() {
        return oda_sayisi;
    }

    public void setOda_sayisi(int oda_sayisi) {
        this.oda_sayisi = oda_sayisi;
    }

    public int getYildiz_sayisi() {
        return yildiz_sayisi;
    }

    public void setYildiz_sayisi(int yildiz_sayisi) {
        this.yildiz_sayisi = yildiz_sayisi;
    }

    public String getOzelikler() {
        return ozelikler;
    }

    public void setOzelikler(String ozelikler) {
        this.ozelikler = ozelikler;
    }
    
    

}
