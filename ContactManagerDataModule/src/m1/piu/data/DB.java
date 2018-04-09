package m1.piu.data;

import java.util.HashMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DB
{
    
	private static ObservableList<Contact> contactData = FXCollections.observableArrayList();
	private static ObservableList<AddressBook> addressBookData = FXCollections.observableArrayList();
    
    
	public DB()
	{
   	 
    	AddressBook a1 = new AddressBook("CarnetHome","HomeContact");
    	AddressBook a2 = new AddressBook("CarnetWork","WorkContact");
    	addressBookData.add(a1);
    	addressBookData.add(a2);
    	Contact p1 = new Contact("Mr","Poulet","  Farci",10,"pouletfarci@crous.fr","0725156428","CROUS","Agroparc");
    	Contact p2 = new Contact("Mme","Poisson","   Fumée",20,"poissonfumee@crous.fr","0795856750","CROUS","Agroparc");
    	contactData.add(p1);
    	contactData.add(p2);
   	 
    	a1.setContact(p1, "Poulet");
    	a2.setContact(p2, "Poisson");
   	 
   	 
	}
    
	public static ObservableList<AddressBook> getAdressBooks()
	{
    	return addressBookData;
   	 
	}
	public static ObservableList<Contact> getAllContacts()
	{
    	return contactData;
   	 
	}
	public static HashMap<String, Contact> getContacts(AddressBook ab)
	{
    	return  ab.getAdressBook();
	}
}
