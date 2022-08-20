package com.Pagamentos.Pagamentos.PagamentosController;

import com.Pagamentos.Pagamentos.PagamentosModel.FactoryPattern.Factory;
import com.Pagamentos.Pagamentos.PagamentosModel.PagamentoModel;
import com.Pagamentos.Pagamentos.PagamentosService.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping(path = "/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel cadastrarPagamento(@RequestBody PagamentoModel pagamentoModel, Factory pagamentosFactory){
        return pagamentoService.Pagamento(pagamentoModel, pagamentosFactory);

    }
    @GetMapping(path = "/pagamentos/{codigo}")
    public Optional<PagamentoModel> buscarPagamento(@PathVariable Long codigo){

        return pagamentoService.buscarPagamentoEspecifico(codigo);
    }

    @GetMapping(path = "/pagamentos")
    public List<PagamentoModel> mostrarPagamentos(){
        return pagamentoService.buscarPagamentos();
    }
    @DeleteMapping(path = "/pagamentos/{codigo}")
    public  List<PagamentoModel> deletarPagamento(@PathVariable Long codigo){
        pagamentoService.deletarPagamento(codigo);
        return pagamentoService.buscarPagamentos();
    }

    @PutMapping(path = "/pagamentos/{codigo}")
    public PagamentoModel editarContato(@RequestBody PagamentoModel pagamento, Factory pagamentosFactory){
        return pagamentoService.editarPagamento(pagamento, pagamentosFactory);
    }



}
