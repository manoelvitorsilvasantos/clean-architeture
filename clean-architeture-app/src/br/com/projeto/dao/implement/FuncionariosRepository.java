package br.com.projeto.dao.implement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.projeto.model.Funcionarios;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface FuncionariosRepository {

    //Metodo Alterar Funcionario
    void alterarFuncionario(Funcionarios obj);

    //Metodo cadastrar Funcionario
    void cadastrarFuncionarios(Funcionarios obj);

    //metodo consultaCliente  por Nome
    Funcionarios consultaPorNome(String nome);

    //Metodo efetuaLogin
    void efetuaLogin(String email, String senha);

    //Metodo Excluir Funcionario
    void excluirFuncionario(Funcionarios obj);

    //Metodo Listar Todos Funcionarios
    List<Funcionarios> listarFuncionarios();

    //Metodo listaFuncionarioPorNome - retorna uma lista
    List<Funcionarios> listarFuncionariosPorNome(String nome);
    
}
