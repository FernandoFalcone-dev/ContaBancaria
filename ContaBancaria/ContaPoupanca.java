package POO.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    private int diaDeRendimento;
    private double taxaRendimento;

    public ContaPoupanca(String cliente, String numConta, float saldo, int diaDeRendimento, double taxaRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
        this.taxaRendimento = taxaRendimento;
    }

    public ContaPoupanca() {
    }

    @Override
    public String toString() {
        String s = "Confirmação Conta Poupança\n";
        s += "Dia de rendimento: " + diaDeRendimento;
        s += "\nTaxa de rendimento: " + taxaRendimento;
        return s;
    }

    public int getDiaDeRendimento() {
        return this.diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    public double getTaxaRendimento() {
        return this.taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }


    public void calcularNovoSaldo() {
        double novoSaldo = super.getSaldo() + (super.getSaldo() * this.taxaRendimento);
       System.out.println("Seu novo é saldo é R$" + novoSaldo);
    }
}
