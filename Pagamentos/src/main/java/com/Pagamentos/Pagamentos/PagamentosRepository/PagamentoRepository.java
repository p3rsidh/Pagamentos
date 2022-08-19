package com.Pagamentos.Pagamentos.PagamentosRepository;

import com.Pagamentos.Pagamentos.PagamentosModel.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoModel, Long> {
}