/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.data;

import java.util.HashMap;

/**
 *
 * @author uapv1800665
 */
public class AddressBook {
    
	private String nom;
    
	private String type;
    
	private static  HashMap< String, Contact> hm = new HashMap<String, Contact>();
    
	public AddressBook(String nom,String type)
	{
    	this.nom = nom;
   	 
    	this.type = type;
	}
        
        public AddressBook(String nom)
	{
    	this.nom = nom;
	}
    
	public void setContact(Contact c,String x)
	{
    	hm.put(x,c);
	}   	 
	public HashMap<String,Contact> getAdressBook()
	{
    	return hm;
	}
   
        public String toString()
        {
            return nom;
        }
}

