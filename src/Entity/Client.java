/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Client {
    private int numClient;
    private String nomClient;
    private ArrayList<Releve> sesReleves;
    
    public Client(int numClient, String nomClient)
    {
        this.numClient = numClient;
        this.nomClient = nomClient;
        this.sesReleves = new ArrayList<>();
    }
    
    public int getNumClient()
    {
        return this.numClient;
    }
    
    public String getNomClient()
    {
        return this.nomClient;
    }
    
    public ArrayList<Releve> getSesReleves()
    {
        return this.sesReleves;
    }
    
    public void AjouterUnReleve(Releve r)
    {
        sesReleves.add(r);
    }
    
    public int CalculerConsomation()
    {
        if (sesReleves.isEmpty())
        {
            return 0;
        }
        else if (sesReleves.size() == 1)
        {
            return sesReleves.get(0).getValeurReleve();
        }
        else
        {
            return sesReleves.get(sesReleves.size() - 1).getValeurReleve() - sesReleves.get(sesReleves.size() - 2).getValeurReleve();
        }
    }
    
    public boolean VerifierValeurNouveauReleve(int nouvelleValeur)
    {
        if(this.sesReleves.isEmpty())
        {
            return true;
        }
        int ancienneVal = this.sesReleves.get(this.sesReleves.size() - 1).getValeurReleve();
        return ancienneVal <= nouvelleValeur;
    }
}
