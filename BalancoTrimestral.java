/**
 * BalancoTrimestral
 */
class BalancoTrimestral {

    public static void main(String []args) {
        int gastoJaneiro = 15000;
        int gastosFeveiro = 23000;
        int gastosMarco = 17000;
        int gastoTrimestre = gastoJaneiro + gastosFeveiro + gastosMarco;
        int mediaTrimestral = gastoTrimestre / 3;

        System.out.println("Gasto do trimestre = " + gastoTrimestre);
        System.out.println("Balanção do trimestre =" + mediaTrimestral);
    }
}