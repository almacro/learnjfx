package org.example.challenge;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 *
 * @author almacro
 */
public class FXMLAskMeController implements Initializable {
    
    final String[] ANSWERS = {
        "Reply hazy, try again",
        "Better not tell you now",
        "Outlook good",
        "Most likely",
        "Concentrate and ask again"
    };
    
    @FXML
    private Text answertarget;

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        int choice = (int)(Math.random() * ANSWERS.length);
        answertarget.setText(ANSWERS[choice]);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    }    
}
