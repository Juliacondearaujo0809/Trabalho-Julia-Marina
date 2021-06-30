package Banco;

import java.util.List;

public class Conta {

    public static float calcularTotalMovimentacao(List<Movimentacao> movimentacaoList) {
        float total = 0.0f;
        for (Movimentacao movimentacao : movimentacaoList) {
            total += movimentacao.calcularMovimentacao();
        }
        return total;
    }
}
