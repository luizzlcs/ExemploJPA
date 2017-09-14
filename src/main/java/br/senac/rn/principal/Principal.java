
package br.senac.rn.principal;

import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Sexo;

public class Principal {
    public static void main(String[] args) {
// INSERIR  
          Sexo s1 = new Sexo();
//
//        s1.setNome("Feminino");
//        s1.setSigla('F');
//
//        SexoDAO dao = new SexoDAO();
//        dao.inserir(s1);
//--------------------------------------------------------------------
// ATUALIZAR
//        
//        s1.setNome("Feminino");
//        s1.setSigla('F');
//        s1.setId(4);
//        s1.setDescricao("Mulher nata!");
//
//        SexoDAO dao = new SexoDAO();
//        dao.atualizar(s1);
//--------------------------------------------------------------------
// EXCLUIR
//        
        SexoDAO dao = new SexoDAO();
        dao.excluir(dao.buscarPorId(3));
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
