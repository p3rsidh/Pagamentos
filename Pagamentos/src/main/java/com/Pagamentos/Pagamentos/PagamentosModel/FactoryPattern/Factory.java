package com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern;

public class Factory {

    public Pagamentos getPagamentos(String status) {
        if (status == null) {
            return null;

        } else if (status.equalsIgnoreCase("PAGAMENTO_EM_DIA")) {
            return new PagamentoEmDIa();

        } else if (status.equalsIgnoreCase("PAGAMENTO_ATRASADO")) {
            return new PagamentoAtrasado();

        }
        return null;
    }
}

