/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;
import analizadorLexico.*; 
import simbolos.*;
/**
 *
 * @author Andre
 */
public class Unario extends Op{
    public Expr expr;
    public Unario(Token tok, Expr x){
        super(tok, null); expr = x;
        tipo = Tipo.max(Tipo.Int, expr.tipo);
        if(tipo == null) error("error de tipo");
    }
    public Expr gen(){return new Unario(op, expr.reducir());}
    public String toString(){return op.toString()+" "+expr.toString();}

}