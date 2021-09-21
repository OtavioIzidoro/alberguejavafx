/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Navegacao extends Application {
    
            //MENU-NOVA RESERVA E CADASTRAR QUARTO.
    private static Scene sceneJanela1, sceneJanela2, sceneJanela3;
    private static Stage primaryStage;
    
    @Override
    public void start(Stage stage) throws Exception {
        // FAZER CARREGAMENTOS DO FXML PARA MENU, NOVA RESERVA E CADASTRAR QUARTO.
        FXMLLoader Janela1 = new FXMLLoader(getClass().getResource("Janela1.fxml"));
        FXMLLoader Janela2 = new FXMLLoader(getClass().getResource("Janela2.fxml"));
        FXMLLoader Janela3 = new FXMLLoader(getClass().getResource("Janela3.fxml"));
       
        
        primaryStage = stage;
        primaryStage.setTitle("ALBERGUE SPARKING WATER");
        primaryStage.getIcons().add(new Image(Janela1.class.getResourceAsStream("placa-do-hotel.png")));
       
        //CARREGAMENTO DAS PAGINAS.
        Parent parentJanela1 = Janela1.load();
        Parent parentJanela2 = Janela2.load();
        Parent parentJanela3 = Janela3.load();
       
        //DEFININDO A RESOLUÇÃO DE CADA CENA.
        sceneJanela1 = new Scene(parentJanela1, 1280, 768);
        sceneJanela2 = new Scene(parentJanela2, 1280, 768);
        sceneJanela3 = new Scene(parentJanela3, 1280, 768);
        
        // ATRIBUIR UMA CENA PRINCIPAL INICIANDO COM A MAIN
        stage.setScene(sceneJanela1);
        stage.show();
    }
    
    // FUNÇAO CRIADA PARA FAZER AS TROCAS DE TELAS.
    public static void changeScreen(int opcao){
        switch(opcao){
            case 1:
                primaryStage.setScene(sceneJanela1);
                break;
            case 2:
                primaryStage.setScene(sceneJanela2);
                break;
            case 3:
                primaryStage.setScene(sceneJanela3);
                break;
      
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
