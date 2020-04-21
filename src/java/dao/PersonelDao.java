/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Personel;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Muhammed ARSLAN
 */
public class PersonelDao extends BaseDao {
    
    
     public void remove(Personel personel) {
        try{
            PreparedStatement pst = this.getConnection().prepareStatement("delete from personel where personel_id=?");
            pst.setLong(1, personel.getPer_id());
            pst.executeUpdate();
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    
    public void create(Personel personel) {
        try{
            PreparedStatement pst = this.getConnection().prepareStatement("insert into personel (adsoyad,maas,bas_tarih) "
                    + "values (?,?,?)");
            pst.setString(1, personel.getAdsoyadi());
            pst.setInt(2, personel.getMaas());
            pst.setString(3, personel.getBas_tarihi());
            
            
            pst.executeUpdate();
           
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
       
    }
    public void edit(Personel personel) {
        try{
            PreparedStatement pst = this.getConnection().prepareStatement("update personel "
                    + "set adsoyad=?, maas=?, bas_tarihi=?,  where per_id=?");
            pst.setString(1, personel.getAdsoyadi());
            pst.setInt(2, personel.getMaas());
            pst.setString(3, personel.getBas_tarihi());
      
            
            pst.executeUpdate();
           
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
