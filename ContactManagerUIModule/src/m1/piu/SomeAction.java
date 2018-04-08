/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Clear",
        id = "m1.piu.SomeAction"
)
@ActionRegistration(
        displayName = "#CTL_SomeAction"
)
@ActionReference(path = "Menu/Clear", position = 3333)
@Messages("CTL_SomeAction=Clear")
public final class SomeAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("Voulez vous confirmer ?", NotifyDescriptor.WARNING_MESSAGE));
        DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("Succes !", NotifyDescriptor.INFORMATION_MESSAGE));
    }
}
