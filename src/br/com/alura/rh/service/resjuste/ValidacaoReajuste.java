package br.com.alura.rh.service.resjuste;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;


//Inversao de dependencia, onde a implementação depende dessa interface que é a abstração
public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
