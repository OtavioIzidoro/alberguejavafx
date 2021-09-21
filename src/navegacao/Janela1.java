/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegacao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author otavi
 */
public class Janela1 implements Initializable {
    
    @FXML
    private Label label;
    
   // COMANDOS QUE IMPLEMENTA OS BOTÕES, PARA QUE ELES POSSAM TER AÇÕES DENTRO DA INTERFACE. 
      @FXML
    protected void btMenuClick(ActionEvent e){
        Navegacao.changeScreen(1);
    }
      @FXML
    protected void btNovaReservaClick(ActionEvent e){
        Navegacao.changeScreen(2);
    }
     @FXML
    protected void btCadastrarQuartoClick(ActionEvent e){
        Navegacao.changeScreen(3);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
