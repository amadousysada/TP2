/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import static java.lang.System.console;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import m1.piu.data.*;

/**
 * FXML Controller class
 *
 * @author gaby
 */
public class FXMLMainPanelController implements Initializable {
    @FXML
    private ListView listAdressBook;
    @FXML
    private Text name;
    @FXML
    private Text prenom;
    @FXML
    private Text age;
    @FXML
    private Text email;
    @FXML
    private Text mobile;
    @FXML
    private Text office;
    @FXML
    private Text address;
    
    
                
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      DB  x = new DB();
      listAdressBook.setItems(DB.getAdressBooks());   
      listAdressBook.getSelectionModel().selectedItemProperty().addListener((ObservableValue observable, Object oldValue, Object newValue) -> {
      //AddressBook ab = new AddressBook(newValue.toString());
      Contact s = null;
       for (AddressBook num :  DB.getAdressBooks()) { 		      
           if(num.toString().compareTo(newValue.toString())==0)
           {
               for (String key :  num.getAdressBook().keySet()) {
			
			  s=num.getAdressBook().get(key); 
                          name.setText(s.getNom());
                          prenom.setText(s.getPrenom());
                          age.setText(String.valueOf(s.getAge()));
                          email.setText(s.getEmail());
                          mobile.setText(s.getMobile());
                          office.setText(s.getOffice());
                          address.setText(s.getAddress());
		}
       
           }
      }
      
    
      
      });
      
    }    
    
}
