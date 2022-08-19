package com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern;

import java.math.BigDecimal;

public class PagamentoAtrasado implements Pagamentos{


    @Override
    public BigDecimal calcularPagamento(BigDecimal a, BigDecimal b) {
        BigDecimal resultado;
        resultado = a.add(b);
        return resultado;
    }

}
