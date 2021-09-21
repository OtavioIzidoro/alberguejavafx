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
public class saida2 {
    private String nome;
    private String tipo;
    private String dimensao;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 public String salvar(){
        try {
            FileWriter fw = new FileWriter("CRIAR QUARTO.txt", true);
  
            PrintWriter pw = new PrintWriter(fw);
            pw.println("------------------------------------------");
            pw.println("Nome: "+this.nome);
            pw.println("Tipo Quarto: "+this.tipo);
            pw.println("Dimensão: "+this.dimensao);
            pw.println("Descrição "+this.descricao);
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
