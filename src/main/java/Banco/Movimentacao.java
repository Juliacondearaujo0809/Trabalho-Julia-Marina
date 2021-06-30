// Equipe: Júlia Condé Araújo / Marina Condé Araújo

package Banco;

public abstract class Movimentacao {

    protected float valor;

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float calcularMovimentacao();
}
