package com.Pagamentos.Pagamentos.PagamentosService;

import com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern.Factory;
import com.Pagamentos.Pagamentos.PagamentosModel.PagamentoModel;
import com.Pagamentos.Pagamentos.PagamentosRepository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public PagamentoModel PagamentoAtrasado(PagamentoModel pagamentoModel, Factory pagamentosFactory) {

        pagamentoModel.setValorTotal(pagamentosFactory.getPagamentos(pagamentoModel.getStatus()).calcularPagamento(pagamentoModel.getValorAPagar(), pagamentoModel.getDiferencaValor()));

        pagamentoModel.getCodigo();
        pagamentoModel.getStatus();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaValor();


        return pagamentoRepository.save(pagamentoModel);
    }

}