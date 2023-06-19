package ac2;

public class conta_corrente implements conta_bancaria{
    private int numero;
    private String titular;
    private double saldo;
    private String agencia;
    private double limiteCredito;

    public conta_corrente(int numero, String titular, double saldo, String agencia, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.limiteCredito = limiteCredito;
    }

    @Override
    public double obterSaldo() {
        return saldo;
    }

    // Implementar os demais métodos da interface ContaBancaria

    // Exemplo de implementação do método depositar()
    public void depositar(double valor) {
        saldo += valor;
    }

    // Exemplo de implementação do método sacar()
    public void sacar(double valor) {
        if (valor <= saldo + limiteCredito) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
