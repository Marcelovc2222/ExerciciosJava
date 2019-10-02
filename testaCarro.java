/**
 * testaCarro
 */
public class testaCarro {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        //liga o carro.
        meuCarro.acelera(80);
        System.out.println(meuCarro.velocidadeAtual);
    }
}