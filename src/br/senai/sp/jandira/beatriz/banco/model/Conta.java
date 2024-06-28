package br.senai.sp.jandira.beatriz.banco.model;

public class Conta {

    private Agencia agencia;
    private String numero;
    private double saldo;
    private Cliente cliente;
    private TipoConta tipoConta;


    //AGENCIA
    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    //NUMERO
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    //SALDO
    public double getSaldo() {
        return saldo;
    }

    //CLIENTE
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //TIPO DA CONTA
    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    //SACAR;
    public boolean Sacar(double valor){
        if (saldo > valor && valor > 0) {
            saldo = saldo - valor;
            System.out.println("SAQUE REALIZADO COM SUCESSO.");
            System.out.printf("SACANDO %S \n DA CONTA DO(A) %s. \n", valor, cliente.getNome());
            System.out.printf("Saldo atual: R$%s\n", saldo);
            return true;
        } else{
            System.out.println("SALDO INSUFICIENTE.");
            return false;
        }
    }

    //DEPOSITAR/DEPOSITO;
    public void Depositar(double valor){
        if(valor > 0) {
            saldo = saldo + valor;
            System.out.println("---------------------------------------");
            System.out.println("DEPOSITO EFETUADO COM SUCESSO.");
            System.out.println("---------------------------------------");
            System.out.printf("DEPOSITANDO R$%S DA CONTA DO(A) %s. \n", valor, cliente.getNome());
            System.out.printf("Saldo atual: R$%s\n", saldo);
        } else{
            System.out.println("VALOR INFORMADO ESTÁ INCORRETO!");
        }
    }

    public void Transferir(double valor, Conta contaDestino){
        System.out.printf("Transferindo R$%s da conta %s para a conta: %s.", valor, cliente.getNome(), contaDestino.getCliente().getNome());
            if (Sacar(valor)){
                contaDestino.Depositar(valor);
            } else{
                System.out.println("A transferencia não ocorreu por falta de saldo na conta de origem.");
            }


    }

}
