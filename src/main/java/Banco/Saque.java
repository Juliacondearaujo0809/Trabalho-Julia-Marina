// Equipe: Júlia Condé Araújo / Marina Condé Araújo

package Banco;

public class Saque extends Movimentacao{

    public Saque(float valor) {
        this.valor = valor;
    }

    @Override
    public float calcularMovimentacao() {
        return this.valor * (-1);
    }


}
