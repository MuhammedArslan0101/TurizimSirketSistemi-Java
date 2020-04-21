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
public class Ulkeler {
    
    private int ulke_id ;
    private String ulke_isim ; 
    private int kalacak_sure ; 

    public Ulkeler(int ulke_id, String ulke_isim, int kalacak_sure) {
        this.ulke_id = ulke_id;
        this.ulke_isim = ulke_isim;
        this.kalacak_sure = kalacak_sure;
    }

    @Override
    public String toString() {
        return "Ulkeler{" + "ulke_id=" + ulke_id + ", ulke_isim=" + ulke_isim + ", kalacak_sure=" + kalacak_sure + '}';
    }

    public Ulkeler() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.ulke_id;
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
        final Ulkeler other = (Ulkeler) obj;
        if (this.ulke_id != other.ulke_id) {
            return false;
        }
        return true;
    }

    public int getUlke_id() {
        return ulke_id;
    }

    public void setUlke_id(int ulke_id) {
        this.ulke_id = ulke_id;
    }

    public String getUlke_isim() {
        return ulke_isim;
    }

    public void setUlke_isim(String ulke_isim) {
        this.ulke_isim = ulke_isim;
    }

    public int getKalacak_sure() {
        return kalacak_sure;
    }

    public void setKalacak_sure(int kalacak_sure) {
        this.kalacak_sure = kalacak_sure;
    }
    
    
    
    
}
