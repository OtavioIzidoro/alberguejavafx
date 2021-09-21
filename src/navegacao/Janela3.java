package navegacao;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;

public class Janela3 implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
     // COMANDOS QUE IMPLEMENTA OS BOTÕES, PARA QUE ELES POSSAM TER AÇÕES DENTRO DA INTERFACE. 
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
       }    
    @FXML    private Menu btInicio;

    @FXML    private MenuItem btNovaReserva;

    @FXML    private MenuItem btCadastrarQuarto;

    @FXML    private TextField NOME;

    @FXML    private Text TIPOTXT;

    @FXML    private ToggleGroup TIPO;

    @FXML    private TextField DIME;

    @FXML    private TextArea DESC;

    @FXML    private Button btSalvar;
     
    @FXML    private Label label;
    
    /**A FUNÇÃO CRIADA NA CLASSE SAIDA PEGA OS DADOS DIGITADOS NA INTERFACE JOGA PARA DENTRO DA CLASSE SAIDA QUE EXPORTA 
    *OS DADOS EM UM ARQUIVO TXT.*/
    
     @FXML
    void btSalvarClick(ActionEvent event) {
        System.out.println("SALVO");
        label.setText("QUARTO CRIADO COM SUCESSO!");
        
        saida2 saida2 = new saida2();
        saida2.setNome(NOME.getText());
       // saida2.setTipo(TIPO.getText());
        saida2.setDimensao(DIME.getText());
        saida2.setDescricao(DESC.getText());
             
        
        JOptionPane.showMessageDialog(null, saida2.salvar());
        NOME.setText("");
        //TIPO.setText("");
        DIME.setText("");
        DESC.setText("");   
       }
    
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
}
