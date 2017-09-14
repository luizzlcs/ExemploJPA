
package br.senac.rn.principal;

import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Sexo;

public class Principal {
    public static void main(String[] args) {
        
        Categoria s1= new Categoria();
        
        s1.setNome("Futebol");
        s1.setDescricao("diversos");
        
        
   CategoriaDAO dao = new CategoriaDAO();
   dao.inserir(s1);
//
     // System.out.println(dao.buscarPorId(3).toString());
//        dao.buscarTodos().stream().forEach((s) -> {
//            System.out.println(s);
//        });
           
        System.exit(0);
        
        
    }
}
