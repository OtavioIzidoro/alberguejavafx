/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegacao;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 *
 * @author otavi
 */
public class Janela2 implements Initializable {
     // COMANDOS QUE IMPLEMENTA OS BOTÕES, PARA QUE ELES POSSAM TER AÇÕES DENTRO DA INTERFACE. 
    
    @FXML    private AnchorPane TXTNOVA;

    @FXML    private Menu btInicio;

    @FXML    private MenuItem btNovaReserva1;

    @FXML    private MenuItem btCadastrarQuarto1;

    @FXML    private TextField NOME;

    @FXML    private TextField DDD;

    @FXML    private TextField telefone;

    @FXML    private TextField endereço;

    @FXML    private TextField email;

    @FXML    private DatePicker datinicio;
    
    @FXML    private DatePicker datsaida;

    @FXML    private ToggleGroup pagamento;

    @FXML    private ToggleGroup tipo;
   
    @FXML    private Label saltxt;
    
    @FXML    private Button SALVAR;

     /**A FUNÇÃO CRIADA NA CLASSE SAIDA PEGA OS DADOS DIGITADOS NA INTERFACE JOGA PARA DENTRO DA CLASSE SAIDA QUE EXPORTA 
    *OS DADOS EM UM ARQUIVO TXT.*/
    
   @FXML
    private void btSalvarClick(ActionEvent event) {
        System.out.println("SALVO");
        saltxt.setText("RESERVA CONCLUIDA COM SUCESSO!");
        
        Saida saida = new Saida();
        saida.setNome(NOME.getText());
        saida.setEmail(email.getText());
        saida.setDdd(DDD.getText());
        saida.setNumero(telefone.getText());
        saida.setDatinicio(datinicio.getAccessibleText());
        saida.setDatsaida(datsaida.getAccessibleHelp());
       
        //PARA QUE A CADA CADASTRO OS CAMPOS A SEREM PREENCHIDOS FIQUE EM BRANCO.
        
        JOptionPane.showMessageDialog(null, saida.salvar());
        NOME.setText("");
        email.setText("");
        DDD.setText("");
        telefone.setText("");
        datinicio.setAccessibleText("");
        datsaida.setAccessibleHelp("");
      
    }

    @FXML
    void btSalvarClick(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        
    }
    
    @FXML
    public void btMenuClick(ActionEvent e){
         Navegacao.changeScreen(1);
    }
     @FXML
    public void btNovaReservaClick(ActionEvent e){
         Navegacao.changeScreen(2);
    }
     @FXML
    public void btCadastrarQuartoClick(ActionEvent e){
         Navegacao.changeScreen(3);
    }
}
