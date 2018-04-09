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
    
	private static  HashMap<Contact, String> hm = new HashMap<Contact, String>();
    
	public AddressBook(String nom,String type)
	{
    	this.nom = nom;
   	 
    	this.type = type;
	}
    
	public void setContact(Contact c,String x)
	{
    	hm.put(c,x);
	}   	 
	public HashMap<Contact, String> getAdressBook()
	{
    	return hm;
	}
   
    
}

