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
public class FemmeServeuse extends  Serveur{
    
     float coef_charme = 0;

    public FemmeServeuse(String initPrenom, String initSurnom, float initPorte_monnaire, float initCote_popularite, String initCri_significatif, String initType_boison, float  coef) {
         super(initPrenom, initSurnom, initPorte_monnaire, initCote_popularite, initCri_significatif, initType_boison);
         this.coef_charme = coef;
    }
    
  public float getCoef_charme()
    {
        return this.coef_charme;
    }
  
  public void setCoef_charme( float charme)
    {
        this.coef_charme = charme;
    }
    
}
