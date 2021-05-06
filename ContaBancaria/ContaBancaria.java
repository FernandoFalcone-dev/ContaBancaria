package POO.ContaBancaria;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    protected double saldo;


    public ContaBancaria(String nomeCliente, String numConta, float saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String cliente) {
        this.nomeCliente = cliente;
    }

    public String getNumConta() {
        return this.numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "Confirmação Conta Bancaria\n";
        s += "Nome do Cliente: " + nomeCliente;
        s += "\nNumero da Conta: " + numConta;
        s += "\nSaldo: R$" + saldo;
        return s;
    }    
    

    public void sacar(double valorSaque) {
        if ((saldo - valorSaque) >= 0) {
            saldo -= valorSaque;
            System.out.println("Operação realizada com sucesso!");
            System.out.println("Retire as notas no local indicado.");
        } else {
            System.out.println("Valor não permitido.");
        }
    }

    public void depositar(float valorDeposito) {
            saldo += valorDeposito;
            System.out.println("Operação realizada com sucesso!");
    }
}
