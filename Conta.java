/**
 * Conta
 */
public class Conta {

    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    double saca (double saque) {
        double novoSaldo = this.saldo - saque;
        return novoSaldo;
    }

    double deposita (double valor) {
        double novoSaldo = this.saldo + valor;
        return novoSaldo;
    }

    double calculaRendimento() {
        return this.saldo*0.1;
    }
}