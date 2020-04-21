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
public class Turtipi {

    private int turtipi_id;
    private String sehirler;
    private int kisi_sayisi;
    private int fiyat;

    public Turtipi() {
    }

    public Turtipi(int turtipi_id, String sehirler, int kisi_sayisi, int fiyat) {
        this.turtipi_id = turtipi_id;
        this.sehirler = sehirler;
        this.kisi_sayisi = kisi_sayisi;
        this.fiyat = fiyat;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.turtipi_id;
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
        final Turtipi other = (Turtipi) obj;
        if (this.turtipi_id != other.turtipi_id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turtipi{" + "turtipi_id=" + turtipi_id + ", sehirler=" + sehirler + ", kisi_sayisi=" + kisi_sayisi + ", fiyat=" + fiyat + '}';
    }

    public int getTurtipi_id() {
        return turtipi_id;
    }

    public void setTurtipi_id(int turtipi_id) {
        this.turtipi_id = turtipi_id;
    }

    public String getSehirler() {
        return sehirler;
    }

    public void setSehirler(String sehirler) {
        this.sehirler = sehirler;
    }

    public int getKisi_sayisi() {
        return kisi_sayisi;
    }

    public void setKisi_sayisi(int kisi_sayisi) {
        this.kisi_sayisi = kisi_sayisi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

}
