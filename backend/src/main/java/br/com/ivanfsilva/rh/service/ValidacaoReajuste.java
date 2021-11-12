package br.com.ivanfsilva.rh.service;

import br.com.ivanfsilva.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar( Funcionario funcionario, BigDecimal aumento );
}
