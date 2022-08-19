package com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern;

import java.math.BigDecimal;

public class PagamentoAdiantado implements Pagamentos{

    @Override
    public BigDecimal calcularPagamento(BigDecimal a, BigDecimal b) {
        BigDecimal resultado;
        resultado = a.subtract(b);

        return null;
    }

}
