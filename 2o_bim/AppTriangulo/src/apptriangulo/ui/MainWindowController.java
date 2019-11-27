/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptriangulo.ui;

import apptriangulo.control.CtrlTriangulo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Alexandre LM
 */
public class MainWindowController implements Initializable
{
    
    @FXML
    private TextField tfL1;
    @FXML
    private TextField tfL2;
    @FXML
    private TextField tfL3;
    @FXML
    private Label lbmensagem;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        tfL1.setOnKeyTyped((event)->keyType(event));
        tfL2.setOnKeyTyped((event)->keyType(event));
        tfL3.setOnKeyTyped((event)->keyType(event));
    }    
    
    private void keyType(KeyEvent event)
    {
        if(!Character.isDigit(event.getCharacter().charAt(0)))
            event.consume();
    }

    @FXML
    private void clkVerificar(ActionEvent event)
    {
        try
        {
        int L1 = Integer.parseInt(tfL1.getText());
        int L2 = Integer.parseInt(tfL2.getText());
        int L3 = Integer.parseInt(tfL3.getText());
        lbmensagem.setText(CtrlTriangulo.getInstance().verificar(L1, L2, L3));
        }
        catch(NumberFormatException e)
        {
            lbmensagem.setText(CtrlTriangulo.getInstance().verificar(0, 0, 0));
        }
    }

    @FXML
    private void clkLimpar(ActionEvent event)
    {
        tfL1.clear();
        tfL2.clear();
        tfL3.clear();
        lbmensagem.setText("");
    }
}
