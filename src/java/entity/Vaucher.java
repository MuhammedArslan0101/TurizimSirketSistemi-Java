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
public class Vaucher {

    private int vaucher_id;
    private String otel_isim;
    private String sehir_isim;

    private int gun_sayisi;
    private int yetskin_sayisi;
    private int cocuk_sayisi;

    public Vaucher() {
    }

    public Vaucher(int vaucher_id, String otel_isim, String sehir_isim, int gun_sayisi, int yetskin_sayisi, int cocuk_sayisi) {
        this.vaucher_id = vaucher_id;
        this.otel_isim = otel_isim;
        this.sehir_isim = sehir_isim;
        this.gun_sayisi = gun_sayisi;
        this.yetskin_sayisi = yetskin_sayisi;
        this.cocuk_sayisi = cocuk_sayisi;
    }

    @Override
    public String toString() {
        return "Vaucher{" + "vaucher_id=" + vaucher_id + ", otel_isim=" + otel_isim + ", sehir_isim=" + sehir_isim + ", gun_sayisi=" + gun_sayisi + ", yetskin_sayisi=" + yetskin_sayisi + ", cocuk_sayisi=" + cocuk_sayisi + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.vaucher_id;
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
        final Vaucher other = (Vaucher) obj;
        if (this.vaucher_id != other.vaucher_id) {
            return false;
        }
        return true;
    }

    public int getVaucher_id() {
        return vaucher_id;
    }

    public void setVaucher_id(int vaucher_id) {
        this.vaucher_id = vaucher_id;
    }

    public String getOtel_isim() {
        return otel_isim;
    }

    public void setOtel_isim(String otel_isim) {
        this.otel_isim = otel_isim;
    }

    public String getSehir_isim() {
        return sehir_isim;
    }

    public void setSehir_isim(String sehir_isim) {
        this.sehir_isim = sehir_isim;
    }

    public int getGun_sayisi() {
        return gun_sayisi;
    }

    public void setGun_sayisi(int gun_sayisi) {
        this.gun_sayisi = gun_sayisi;
    }

    public int getYetskin_sayisi() {
        return yetskin_sayisi;
    }

    public void setYetskin_sayisi(int yetskin_sayisi) {
        this.yetskin_sayisi = yetskin_sayisi;
    }

    public int getCocuk_sayisi() {
        return cocuk_sayisi;
    }

    public void setCocuk_sayisi(int cocuk_sayisi) {
        this.cocuk_sayisi = cocuk_sayisi;
    }

}
