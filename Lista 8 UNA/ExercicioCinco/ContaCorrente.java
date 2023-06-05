public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
    private double deposito;
    private double saque;
    private String operation;
    private int temSaldo;

    
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTemSaldo() {
        return temSaldo;
    }
    public void setTemSaldo(int temSaldo) {
        this.temSaldo = temSaldo;
    }

    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }

    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String alterarNome(String nome) {
        setNomeCorrentista(nomeCorrentista);
        return nomeCorrentista;
    }

    public double depositar() {
        saldo += deposito;
        System.out.printf("Deposito de R$%.2f realido com sucesso." , deposito);
        return saldo;
    }

    public double sacar() {
        if (saque <= saldo) {
        saldo -= saque;
        System.out.printf("Saque de R$%.2f realido com sucesso." , saque);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return saldo;
    }
}
