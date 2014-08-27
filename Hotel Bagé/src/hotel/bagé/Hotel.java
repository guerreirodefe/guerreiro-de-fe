/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel.bagé;

/**
 *
 * @author Daniel Bandeira
 */
public class Hotel {
    String nome, loc,dia;
    Float diaria,dia2;
    Integer telefone,ano,dia3;

    void atribuirnome ( String valor){
        nome = valor;
     }

    String returnenome (){
        return nome;
     }

    void atribuirloc (String valor){
        loc = valor;
     }
    String retorneloc (){
        return loc;
     }

    void atribuirvalor (Float valor){
        diaria = valor;
    }
    Float retornevalor (){
        return diaria;
    }

    void atribuirtelefone (Integer valor){
        telefone  = valor;
    }
    Integer retornetelefone (){
        return telefone;
    }

    void atribuirano (Integer valor){
        ano = valor;
    }

    Integer retorneano (){
        return ano;
    }

Float preco (String valor){
    dia=valor;
    dia2 = Float.parseFloat (dia);
    if (dia2 <= 6){
        return diaria *dia2;
    }else if (dia2 <= 10){
    return (diaria * dia2)-((diaria * 10 )/100);
        
    }else {
        return (diaria *dia2) - ((diaria * 30)/100);
}
}
}


    