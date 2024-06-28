package br.senai.sp.jandira.beatriz.banco.model;

public class Cliente {

    private String nome;
    private String telefone;
    private String cpf;

    // NOME
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // TELEFONE
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // CPF OBJETO
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
