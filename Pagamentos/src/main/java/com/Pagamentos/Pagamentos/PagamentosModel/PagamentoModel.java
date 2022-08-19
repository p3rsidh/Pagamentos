package com.Pagamentos.Pagamentos.PagamentosModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "pagamentos")
    public class PagamentoModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long codigo;

        @Column
        private String status;

        @Column
        private BigDecimal valorAPagar;

        @Column
        private BigDecimal diferencaValor;

        @Column
        private Double desconto;

        private BigDecimal valorTotal;



    }
