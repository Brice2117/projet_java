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
public class Table {
    int nombre_perso = 0;
    
    public Table(int nombre)
    {
        this.nombre_perso = nombre;
    }
    
public int getNombre_perso()
{
    return this.nombre_perso;
}

public void setNombre_perso( int nobre_pers)
{
   this.nombre_perso = nobre_pers;
}
    
}
