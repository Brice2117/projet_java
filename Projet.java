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
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Humain H = new Humain("Brice", "Major", 1500, 75, "hooyééé");
        System.out.println(H.getPrenom()+" "+ H.getSurnom()+" "+ H.getPorte_monnaire()+" "+ H.getCote_popularite()+" "+ H.getCri_significatif());
        Client C = new  Client("Brice", "Major", 1500, 75, "hooyééé", "Cheti", "Grans", 0, "oui", "yo mec");
    }
    
}
