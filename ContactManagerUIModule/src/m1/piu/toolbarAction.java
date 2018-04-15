/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javax.swing.AbstractAction;
import javax.swing.JPanel;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "Edit",
        id = "m1.piu.toolbarAction"
)
@ActionRegistration(
        displayName = "#CTL_toolbarAction"
)
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_toolbarAction=ToolBar")
public final class toolbarAction extends AbstractAction implements Presenter.Toolbar {
    private static JFXPanel fxPanel;
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }

    @Override
    public Component getToolbarPresenter() {
        fxPanel=new JFXPanel();
        //Platform.runLater(()-> createScene());
        //return new TestPanel();
        return createScene();
        
    }
    
    private Component createScene(){
        try {
            URL location = getClass().getResource("FXMLMainFrame.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(location);
            fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
            Parent root = (Parent) fxmlLoader.load(location.openStream());
            Scene scene = new Scene(root);
            fxPanel.setScene(scene);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        
        return fxPanel;
    }
}
