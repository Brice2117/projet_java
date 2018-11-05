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
public class Homme extends Client{
    
    String tee_shit = " ";

    public Homme(String initPrenom, String initSurnom, float initPorte_monnaire, float initCote_popularite, String initCri_significatif, String boison_favo, String boison_favo_secr, float  degre, String fair_offrir, String se_presenter, String couleur) {
        super(initPrenom, initSurnom, initPorte_monnaire, initCote_popularite, initCri_significatif, boison_favo, boison_favo_secr,degre, fair_offrir, se_presenter);
        this.tee_shit = couleur;
    }
    
public String getTee_shit()
    {
        return this.tee_shit;
    }

public void setTee_shit( String ti_shit) 
    {
      this.tee_shit = ti_shit;  
    }
}
