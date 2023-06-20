/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornecedores.usecase;

import fornecedores.entity.Fornecedores;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface FornecedoresRepository {

    //metodo alterarFornecedor
    void alterarFornecedor(Fornecedores obj);

    //Metodo cadastrarFornecedores
    void cadastrarFornecedores(Fornecedores obj);

    //metodo consultaFornecedoresPornome
    Fornecedores consultaPorNome(String nome);

    //metodo excluir fornecedor
    void excluirFornecedor(Fornecedores obj);

    //Metodo listarFornecedores
    List<Fornecedores> listarFornecedores();

    //Metodo listarFornecedores por nome
    List<Fornecedores> listarFornecedoresPorNome(String nome);
    
}
