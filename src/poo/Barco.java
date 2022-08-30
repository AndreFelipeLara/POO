/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Cliente
 */
public class Barco {

    String tipo;
    String cor;
    String nacionalidade;
    int numPessoas;
    
    void imprimeDadosDoBarco(){
        
        
         System.out.println("----------BARCO--------");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cor: " + cor);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Número de Pessoas: " + numPessoas);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;

    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;

    }
    
    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;

    }
    
}
