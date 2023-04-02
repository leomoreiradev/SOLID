package br.com.alura.rh.service.resjuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento){
        LocalDate dataUltimoResjuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        //Compara o a diferença em numero de meses entre duas datas
        Long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoResjuste, dataAtual);
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses!");
        }
    }
}
