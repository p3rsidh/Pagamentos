package com.Pagamentos.Pagamentos.PagamentosService;

import com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern.Factory;
import com.Pagamentos.Pagamentos.PagamentosModel.PagamentoModel;
import com.Pagamentos.Pagamentos.PagamentosRepository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public PagamentoModel Pagamento(PagamentoModel pagamentoModel, Factory pagamentosFactory) {


        pagamentoModel.getCodigo();
        pagamentoModel.getStatus();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaValor();
        pagamentoModel.getDesconto();
        pagamentoModel.setValorTotal(pagamentosFactory.getPagamentos(pagamentoModel.getStatus()).calcularPagamento(pagamentoModel.getValorAPagar(), pagamentoModel.getDiferencaValor(), pagamentoModel.getDesconto()));


        return pagamentoRepository.save(pagamentoModel);
    }


    public List<PagamentoModel> buscarPagamentos() {
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> buscarPagamentoEspecifico(Long codigo) {
        return pagamentoRepository.findById(codigo);
    }
    public void deletarPagamento(Long codigoCliente){
        pagamentoRepository.deleteById(codigoCliente);
    }

    public PagamentoModel editarPagamento(PagamentoModel pagamento, Factory pagamentosFactory) {

        pagamento.getStatus();
        pagamento.getValorTotal();
        pagamento.getDiferencaValor();
        pagamento.getDesconto();
        pagamento.setValorTotal(pagamentosFactory.getPagamentos(pagamento.getStatus()).calcularPagamento(pagamento.getValorAPagar(), pagamento.getDiferencaValor(), pagamento.getDesconto()));

        return pagamentoRepository.save(pagamento);
    }
}