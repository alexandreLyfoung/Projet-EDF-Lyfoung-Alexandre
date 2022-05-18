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
public class Agent {
    private int numAgent;
    private String nomAgent;
    private ArrayList<Client> sesClients;
    
    public Agent(int numAgent, String nomAgent)
    {
        this.numAgent = numAgent;
        this.nomAgent = nomAgent;
        this.sesClients =  new ArrayList<>();
    }
    
    public int getNumAgent()
    {
        return this.numAgent;
    }
    
    public String getNomAgent()
    {
        return this.nomAgent;
    }
    
    public ArrayList<Client> getSesClients()
    {
        return this.sesClients;
    }
    
    public void AjouterUnClient(Client c)
    {
        sesClients.add(c);
    }
    
    
}
