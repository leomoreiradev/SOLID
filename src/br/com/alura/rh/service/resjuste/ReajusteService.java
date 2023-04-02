package br.com.alura.rh.service.resjuste;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;


//S = principio da responsabilidade unica onde o resjuste de salario:
//não é mais responsabilidade de funcionario e sim da ReajusteService

//O = principio do aberto e fechado:
//(Aberto para extenção(implementação de novas funcionalidades))
//(Fechado para modificações)
//as validações foram extraidas para um interface e suas implementações
public class ReajusteService {


    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void resjustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(validacaoReajuste -> validacaoReajuste.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
