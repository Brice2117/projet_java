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
public class Boison {
    
    float taux_alcool = 0;
    float prix_vente = 0;
    float prix_achat = 0;

    public Boison(float taux, float vente, float achat) {
        
        this.taux_alcool = taux;
        this.prix_vente = vente;
        this.prix_achat = achat;
    }
    
 public float getTaux_alcool()
  {
   return this.taux_alcool;
  }
  
 public float getPrix_vente()
  {
   return this.prix_vente;
  }
 
 public float getPrix_achat()
  {
   return this.prix_achat;
  } 
    
}
