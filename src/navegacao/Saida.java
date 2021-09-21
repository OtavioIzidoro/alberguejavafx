/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegacao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otavi
 */
// DECLARANDO AS VARIAVEIS.
public class Saida {
    private String nome;
    private String endereco;
    private String ddd;
    private String numero;
    private String email;
    private String datinicio;
    private String datsaida;
    private String tipo;
    private String pagamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatinicio() {
        return datinicio;
    }

    public void setDatinicio(String datinicio) {
        this.datinicio = datinicio;
    }

    public String getDatsaida() {
        return datsaida;
    }

    public void setDatsaida(String datsaida) {
        this.datsaida = datsaida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    // FUNÇÃO USADA PARA PEGAR OS CONTEUDOS DIGITADOS NA INTERFACE E GERAR UM ARQUIVO TXT.
    
    public String salvar(){
        try {
            FileWriter fw = new FileWriter("NOVAS RESERVAS.txt", true);
  
            PrintWriter pw = new PrintWriter(fw);
            pw.println("------------------------------------------");
            pw.println("Nome: "+this.nome);
            pw.println("Email: "+this.email);
            pw.println("DDD: "+this.ddd);
            pw.println("Numero: "+this.numero);
            pw.println("Data Entrada: "+this.datinicio);
            pw.println("Data Saida: "+this.datsaida);
            pw.println("------------------------------------------");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Saida.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return null;
    }

   
}
