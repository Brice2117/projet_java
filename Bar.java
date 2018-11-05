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
public class Bar {
    String nomBar = " ";
    Barman barman;
    Serveur serveur;
    Client client;
    Table table;
    Boison boison;
    
public Bar(String nom, Barman Br, Serveur S, Client C, Table T, Boison Bo)
{
    this.nomBar = nom;
    this.barman = Br;
    this.serveur = S;
    this.client = C;
    this.table = T;
    this.boison = Bo;
}

public String getNomBar() 
{
    return this.nomBar;
}

public Barman getBarman() 
{
    return this.barman;
}

public Serveur getServeur() 
{
    return this.serveur;
}
   
public Client getClient() 
{
    return this.client;
}

public Table getTable() 
{
    return this.table;
}

public Boison getBoison() 
{
    return this.boison;
}
// implémentation des settes***********************************************************************************************
public void setNomBar(String nombar)
{
  this.nomBar = nombar;  
}

public void setBarman(Barman initbarman)
{
  this.barman = initbarman;  
}

public void setServeur(Serveur initserveur)
{
  this.serveur = initserveur;  
}

public void setClient(Client initclient)
{
  this.client = initclient;  
}

public void setClient(Table inittable)
{
  this.table = inittable;  
}

public void setBoison(Boison initboison)
{
  this.boison = initboison;  
}
  
  
}
