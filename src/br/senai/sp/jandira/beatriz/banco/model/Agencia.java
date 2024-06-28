package br.senai.sp.jandira.beatriz.banco.model;

public class Agencia {

    private String numero;
    private String endereco;
    private String gerente;

    //NÚMERO
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    //ENDEREÇO
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //GERENTE
    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

}
