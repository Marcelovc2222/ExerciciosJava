/**
 * TestaConta
 */
public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.dataAbertura = "04/06/2015";

        c1.deposita(100.0);
        System.out.println("Saldo atual = " + c1.saldo);
        System.out.println("Rendimento Mensal = "+ c1.calculaRendimento());
    }
}