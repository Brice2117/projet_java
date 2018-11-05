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
public class Client extends Humain{
    String boison_favorite = " ";
    String boison_favorite_secour = " ";
    float degre_alcool = 0;
    String se_faire_offrir_verre = " ";
    String maniere_presenter = " ";
    
 public Client(String initPrenom, String initSurnom, float initPorte_monnaire, float initCote_popularite, String initCri_significatif, String boison_favo, String boison_favo_secr, float  degre, String fair_offrir, String se_presenter)
 {
    super(initPrenom, initSurnom, initPorte_monnaire, initCote_popularite, initCri_significatif);
    this.boison_favorite = boison_favo;
    this.boison_favorite_secour = boison_favo_secr;
    this.degre_alcool = degre;
    this.se_faire_offrir_verre = fair_offrir;
    this.maniere_presenter = se_presenter;
 }
    
}
