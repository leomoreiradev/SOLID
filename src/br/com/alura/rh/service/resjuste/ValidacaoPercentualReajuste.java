package br.com.alura.rh.service.resjuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste{

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento){
        //Pega salario atual do funcionario
        BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
        //Calcula o percentual do resjuste
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
