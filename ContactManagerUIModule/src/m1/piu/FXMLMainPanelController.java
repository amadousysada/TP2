/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableView tableview;
    @FXML
    private Text name;
    @FXML
    private Text prenom;
    @FXML
    private Text named;
    @FXML
    private Text prenomd;
    @FXML
    private Text genre;
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
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        DB  x = new DB();
        listAdressBook.setItems(DB.getAdressBooks());   
        listAdressBook.getSelectionModel().selectedItemProperty().addListener((ObservableValue observable, Object oldValue, Object newValue) -> {
        clear();
        AddressBook  a= (AddressBook) newValue;
          
        
        ObservableList<Contact> data=FXCollections.observableArrayList();
            
        HashMap<String, Contact> h= DB.getContacts(a);
        for (Map.Entry<String, Contact> entry : h.entrySet()) {
            String key = entry.getKey();
            Contact ct = entry.getValue();
            
            data.add(ct);
            
                
        }
        System.out.println(data);
        
        ((TableColumn)tableview.getColumns().get(0)).setCellValueFactory(new PropertyValueFactory<>("nom"));
        ((TableColumn)tableview.getColumns().get(1)).setCellValueFactory(new PropertyValueFactory<>("prenom"));
        ((TableColumn)tableview.getColumns().get(2)).setCellValueFactory(new PropertyValueFactory<>("email"));
        tableview.setItems(data);
        
      
    
      
      });
        
      tableview.getSelectionModel().selectedItemProperty().addListener(tabviewListener());
      
    }
    
    public ChangeListener tabviewListener(){
        
        ChangeListener cl= (ChangeListener) (ObservableValue observable, Object oldValue, Object newValue) -> {
            Contact s = (Contact)newValue;
            if(s!=null){
                name.setText(s.getNom());
                prenom.setText(s.getPrenom());
                named.setText(s.getNom());
                prenomd.setText(s.getPrenom());
                genre.setText(s.getGenre());
                age.setText(String.valueOf(s.getAge()));
                email.setText(s.getEmail());
                mobile.setText(s.getMobile());
                office.setText(s.getOffice());
                address.setText(s.getAddress());
            }
        };
        
        return cl;
    
    }
    
    public void clear(){
        name.setText("");
        prenom.setText("");
        named.setText("");
        prenomd.setText("");
        genre.setText("");
        age.setText("");
        email.setText("");
        mobile.setText("");
        office.setText("");
        address.setText("");
    }
    
}
