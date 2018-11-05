/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

/**
 *
 * @author USER
 */
public class Serveur extends Humain{
    
    String type_boison = " ";
    
    public Serveur(String initPrenom, String initSurnom, float initPorte_monnaire, float initCote_popularite, String initCri_significatif, String initType_boison)
    {
        super(initPrenom, initSurnom, initPorte_monnaire, initCote_popularite, initCri_significatif);
        this.type_boison = initType_boison;
    }
    
 public String getType_boison()
 {
     return this.type_boison;
 }
 
 public  void setType_boison( String boison_type)
 {
    this.type_boison = boison_type; 
 }
    
}
