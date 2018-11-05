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
public class Barman extends Humain{
    Caisse caisse;
    
 public Barman(String initPrenom, String initSurnom, float initPorte_monnaire, float initCote_popularite, String initCri_significatif, Caisse initcaisse)
 {
     super(initPrenom, initSurnom, initPorte_monnaire, initCote_popularite, initCri_significatif);
     this.caisse = initcaisse;
 }
    
}
