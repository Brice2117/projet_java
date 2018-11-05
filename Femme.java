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
public class Femme extends  Client{
    String bijoux = " ";

    public Femme(String initPrenom, String initSurnom, float initPorte_monnaire, float initCote_popularite, String initCri_significatif, String boison_favo, String boison_favo_secr, float  degre, String fair_offrir, String se_presenter, String initBijoux) {
        
        super(initPrenom, initSurnom, initPorte_monnaire, initCote_popularite, initCri_significatif, boison_favo, boison_favo_secr,degre, fair_offrir, se_presenter);
        this.bijoux = initBijoux;
    }
   
public String getBijoux()
    {
        return  this.bijoux;
    }

public  void setBijoux( String bijou)
    {
        this.bijoux = bijou;
    }
        
}
