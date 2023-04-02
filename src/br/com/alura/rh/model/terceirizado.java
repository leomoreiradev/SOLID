package br.com.alura.rh.model;

import java.math.BigDecimal;


//L = principio de Liskov
//Ao usar a herança devemos perceber que ao herdar de outra classe se não estamos ferindo esse principio
//Que ao herdar deve fazer sentido e não quebrar a aplicação
//Aqui para não ferir o princio, não estendemos de funcionario
//por mais que ele tenha alguns atributos iguais a terceirizado
//Então extraimos os dados pessoais para a classe DadosPessoais, para não estender de forma errada
//e por consequencia herdar metodos de funcionario que nã fazem sentido em Terceirizado.
public class terceirizado {

    private DadosPessoais dadosPessoais;
    private String empresa;

    public terceirizado(DadosPessoais dadosPessoais, String empresa) {
        this.dadosPessoais = dadosPessoais;
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
