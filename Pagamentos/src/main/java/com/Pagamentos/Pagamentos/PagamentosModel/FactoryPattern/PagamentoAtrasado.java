package com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern;

import java.math.BigDecimal;

public class PagamentoAtrasado implements Pagamentos{


    @Override
    public BigDecimal calcularPagamento(BigDecimal a, BigDecimal b, BigDecimal desconto) {
        BigDecimal resultado;
        resultado = a.add(b);

        BigDecimal resultadoFinal = resultado.subtract(desconto);



        return resultadoFinal;
    }



}
