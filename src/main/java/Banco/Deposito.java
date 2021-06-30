// Equipe: Júlia Condé Araújo / Marina Condé Araújo

package Banco;

public class Deposito extends Movimentacao{

    public Deposito(float valor) {
        this.valor = valor;
    }

    @Override
    public float calcularMovimentacao() {
        return this.valor;
    }
}
