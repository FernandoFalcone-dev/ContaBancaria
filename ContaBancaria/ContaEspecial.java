package POO.ContaBancaria;

public class ContaEspecial extends ContaBancaria {
    private boolean especial;
    private double limite;

    public ContaEspecial(String cliente, String numConta, float saldo, float limite, boolean especial) {
        super(cliente, numConta, saldo);
        this.limite = limite;
        this.especial= especial;
    }


    public ContaEspecial() {
    }

    public boolean isEspecial() {
        return this.especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void checaEspecial(char resp) {

        if (resp == 's' || resp == 'S') {
            this.especial = true;
            System.out.println("É especial, pode prosseguir.");
        } else if (resp == 'n' || resp == 'N') {
            this.especial = false;
            System.out.println("Não é especial, desculpe. Procure um funcionário do banco.");
        }
    }

    public void sacar(double valorSaque) {
        double saldoComLimite = this.getSaldo() + limite;
        if (saldoComLimite >= 0) {
            saldoComLimite -= valorSaque;
            System.out.println("Operação realizada com sucesso!");
        } else {
            System.out.println("Não foi possível completar a transação.");
        }
    }
    
}
