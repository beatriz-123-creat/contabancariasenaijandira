package br.senai.sp.jandira.beatriz.banco;

import br.senai.sp.jandira.beatriz.banco.model.Agencia;
import br.senai.sp.jandira.beatriz.banco.model.Cliente;
import br.senai.sp.jandira.beatriz.banco.model.Conta;
import br.senai.sp.jandira.beatriz.banco.model.TipoConta;

public class SistemaBancario {

    public static void main(String[] args) {

        //classes do programa; método construtor.
        Cliente cliente01 = new Cliente();
        cliente01.setNome("Beatriz Almeida Silva");
        cliente01.setTelefone("(11)99999-9999");
        cliente01.setCpf("777.777.777-00");

        Cliente cliente02 = new Cliente();
        cliente02.setNome("Carlos Alberto.");
        cliente02.setTelefone("(11)88888-8888");
        cliente02.setCpf("444.444.444-04");

        Agencia agencia01 = new Agencia();
        agencia01.setNumero("1234-01");
        agencia01.setEndereco("Av.Brasil, 500 - Jandira/SP");
        agencia01.setGerente("Silvio Vasconcelo");

        Conta conta01 = new Conta();
        conta01.setCliente(cliente01);
        conta01.setAgencia(agencia01);
        conta01.setNumero("456-01");
        conta01.setTipoConta(TipoConta.CORRENTE);
        conta01.Depositar(30);

        Conta conta02 = new Conta();
        conta02.setCliente(cliente02);
        conta02.setAgencia(agencia01);
        conta02.setNumero("486-09");
        conta02.setTipoConta(TipoConta.POUPANCA);
        conta02.Depositar(10);

        // SACAR 100 REAIS DA CONTA01;
        conta01.Sacar(10);

        // MOSTRAR SALDO DA CONTA01;
        //System.out.println(conta01.getSaldo());

      //TRANSFERIR 10 REAIS NA CONTA DE DESTINO
        conta01.Transferir(1000, conta02);
    }




}