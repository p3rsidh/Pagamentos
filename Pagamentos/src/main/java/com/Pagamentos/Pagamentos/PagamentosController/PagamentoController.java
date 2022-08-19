package com.Pagamentos.Pagamentos.PagamentosController;

import com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern.Factory;
import com.Pagamentos.Pagamentos.PagamentosModel.PagamentoModel;
import com.Pagamentos.Pagamentos.PagamentosService.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping(path = "/cadastrarPagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarPagamento(@RequestBody PagamentoModel pagamentoModel, @RequestBody Factory pagamentosFactory){
        pagamentoService.PagamentoAtrasado(pagamentoModel, pagamentosFactory);
    }


}
