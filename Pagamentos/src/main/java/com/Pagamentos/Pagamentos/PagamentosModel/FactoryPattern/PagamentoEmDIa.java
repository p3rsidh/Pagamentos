package com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern;

import java.math.BigDecimal;

public class PagamentoEmDIa implements Pagamentos{

    @Override
    public BigDecimal calcularPagamento(BigDecimal a, BigDecimal b,BigDecimal desconto) {
        BigDecimal resultado;
        resultado = a.subtract(b);

        return resultado;
    }

}
