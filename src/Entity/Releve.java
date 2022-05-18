/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Alex
 */
public class Releve {
    private String date;
    private int valeurReleve;
    
    public Releve(String date, int valeurReleve)
    {
        this.date = date;
        this.valeurReleve = valeurReleve;
    }
    
    public String getDate()
    {
        return this.date;
    }
    
    public int getValeurReleve()
    {
        return this.valeurReleve;
    }
}
