
package br.senac.rn.principal;

import br.senac.rn.model.Sexo;

public class Principal {
    public static void main(String[] args) {
        
        Sexo s1 = new Sexo();
        
//        s1.setId(2);
//        s1.setNome("Ouros");
//        s1.setSigla('0');
        
        System.out.println(s1.toString());
        
        Sexo s2= new Sexo(2, "Outros", '0');
        
        s1 = s2;
        
        System.out.println(s2.toString());
        
        if (s1.equals(s2)){
            System.out.println("IGUAIS");
        }else{
            System.out.println("DIFERENTES");
        }
    }
}
