/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes.usecase;

import clientes.entity.Clientes;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface ClienteRepository {

    //Metodo AlterarCliente
    void alterarCliente(Clientes obj);

    //Busca Cep
    Clientes buscaCep(String cep);

    //Metodo buscarclientePorNome - retorna uma lista
    List<Clientes> buscaClientePorNome(String nome);

    //metodo busca Cliente  por Cpf
    Clientes buscaporcpf(String cpf);

    //Metodo cadastrarCliente
    void cadastrarCliente(Clientes obj);

    //metodo consultaCliente por Nome
    Clientes consultaPorNome(String nome);

    //Metodo ExcluirCliente
    void excluirCliente(Clientes obj);

    //Metodo Listar Todos Clientes
    List<Clientes> listarClientes();
    
}
