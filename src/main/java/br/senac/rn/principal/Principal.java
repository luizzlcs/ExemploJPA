
package br.senac.rn.principal;

import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Produto;
import br.senac.rn.model.Sexo;

public class Principal {
    public static void main(String[] args) {
  
          Produto s1 = new Produto();
          
// INSERIR
        s1.setNome("Livros");
        s1.setDescricao("A criação e o universo");
        s1.setPreco(1.50f);
        s1.setCategoria(new CategoriaDAO().buscarPorId(1));

        ProdutoDAO dao = new ProdutoDAO();
        dao.inserir(s1);
//--------------------------------------------------------------------
// ATUALIZAR
//        
//        s1.setNome("Masculino");
//        s1.setSigla('M');
//        s1.setId(1);
//        s1.setDescricao("Homem nato!");
//
//        SexoDAO dao = new SexoDAO();
//        dao.atualizar(s1);
//--------------------------------------------------------------------
// EXCLUIR
////        
//        SexoDAO dao = new SexoDAO();
//        dao.excluir(dao.buscarPorId(3));
//--------------------------------------------------------------------
// LOCALIZAR TODOS OU POR ID
//        
//        SexoDAO dao = new SexoDAO();
//
//        //System.out.println(dao.buscarPorId(3).toString());
//        dao.buscarTodos().stream().forEach((s) -> { // quebra a linha
//            System.out.println(s);
//        });

       // System.exit(0);
  
        
    }
}
