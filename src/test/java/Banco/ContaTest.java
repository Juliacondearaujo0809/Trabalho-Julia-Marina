package Banco;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaTest {

    @Test
    void deveRetornarSaldo() {
        List<Movimentacao> movimentos = new ArrayList<Movimentacao>();

        Deposito deposito = new Deposito(1000);
        Saque saque = new Saque(200);

        movimentos.add(deposito);
        movimentos.add(saque);

        assertEquals(800, Conta.calcularTotalMovimentacao(movimentos));

    }

}