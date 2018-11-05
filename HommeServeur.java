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
public class HommeServeur extends Serveur{
    
    float taille_biceps = 0;

    public HommeServeur(String initPrenom, String initSurnom, float initPorte_monnaire, float initCote_popularite, String initCri_significatif, String initType_boison, float  biceps) {
         super(initPrenom, initSurnom, initPorte_monnaire, initCote_popularite, initCri_significatif, initType_boison);
         this.taille_biceps = biceps;
    }
    
  public float getTaille_biceps()
    {
        return this.taille_biceps;
    }
  
  public void setTaille_biceps( float taille)
    {
        this.taille_biceps = taille;
    }
    
}
