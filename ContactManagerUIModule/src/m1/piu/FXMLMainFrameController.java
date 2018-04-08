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
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.util.RequestProcessor;

/**
 * FXML Controller class
 *
 * @author gaby
 */
public class FXMLMainFrameController implements Initializable {

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
            Logger.getLogger(FXMLMainFrameController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void save() {
        
         Runnable myRunnable = () -> {
             ProgressHandle myProgressHandle = ProgressHandleFactory.createHandle("Please wait....");
             myProgressHandle.start();
             //DO TASK HERE
             myProgressHandle.progress("Doing task...");
             myProgressHandle.finish();
         };
            RequestProcessor.Task myTask = RequestProcessor.getDefault().post(myRunnable);
    }
    
}
