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
public class Humain {
    protected String prenom =" ";
    protected String surnom = " ";
    protected float porte_monnaire = 0;
    protected float cote_popularite = 0;
    protected String cri_significatif = " ";
    
public Humain(String initPrenom, String initSurnom, float initPorte_monnaire, float initCote_popularite, String initCri_significatif)
    {
     this.prenom = initPrenom;
     this.surnom = initSurnom;
     this.porte_monnaire = initPorte_monnaire;
     this.cote_popularite = initCote_popularite;
     this.cri_significatif = initCri_significatif;
    }

public String getPrenom()
{
    return  this.prenom;
}

public String getSurnom()
{
    return  this.surnom;
}

public float getPorte_monnaire()
{
    return  this.porte_monnaire;
}

public float getCote_popularite()
{
    return  this.cote_popularite;
}

public String getCri_significatif()
{
    return  this.cri_significatif;
}
    
  public void parler()
    {
        
    }
 public void  boire()
    {

    }
 public void payer()
    {

    }
 public  void offrir_verre()
    {

    }
 public void se_presenter()
    {

    }
}
