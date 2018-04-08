/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author gaby
 */
public class FXMLMainFrameController_1 implements Initializable {

    @FXML
    private Button newContact;
    @FXML
    private Pane mainpanelId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //mainpanelId.getChildren().add(ContactManagerFX.n);
    }    

    @FXML
    private void openContact(ActionEvent event) {
         try {
            FXMLLoader fxmlLoader =  new FXMLLoader(getClass().getResource("FXMLContactPanel.fxml"));
            Stage stage = new Stage();
            Parent root1 = (Parent)fxmlLoader.load();
            stage.initStyle(StageStyle.UTILITY);
            stage.setScene(new Scene(root1));
            //Parametres ctrlparam = fxmlLoader.<Parametres>getController();
            stage.resizableProperty().set(false);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainFrameController_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
