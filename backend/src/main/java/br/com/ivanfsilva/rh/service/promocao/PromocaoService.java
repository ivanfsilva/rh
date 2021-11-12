package br.com.ivanfsilva.rh.service.promocao;

import br.com.ivanfsilva.rh.ValidacaoException;
import br.com.ivanfsilva.rh.model.Cargo;
import br.com.ivanfsilva.rh.model.Funcionario;

public class PromocaoService {

    public void promover( Funcionario funcionario, boolean metaBatida ) {
        Cargo cargoAtual = funcionario.getCargo();
        if ( Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes não podem ser promovidos! ");
        }

        if ( !metaBatida  ) {
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }

        Cargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover( novoCargo );
    }

}
