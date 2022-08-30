/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author Cliente
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Resultado: "+ Calculo.elevar());

        Carro meuCarro = new Carro();

        meuCarro.setCor("Preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("ASM-1010");
        meuCarro.setTipo("Gol");

        meuCarro.imprimeDadosDoCarro();

        Pessoa novaPessoa = new Pessoa();

        novaPessoa.setNome("Andre");
        novaPessoa.setIdade(25);
        novaPessoa.setCorDoCabelo("Preto");
        novaPessoa.setBiotipo("Magro");

        novaPessoa.imprimeDadosDaPessoa();

        Barco meuBarco = new Barco();

        meuBarco.setTipo("Navio");
        meuBarco.setCor("Preto");
        meuBarco.setNacionalidade("Brasil");
        meuBarco.setNumPessoas(5000);

       meuBarco.imprimeDadosDoBarco();

    }

}
