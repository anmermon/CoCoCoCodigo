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
public class Not extends Logica{
    public Not(Token tok, Expr x2){super(tok, x2, x2);}
    public void salto(int t, int f){expr2.salto(f, t);}
    public String toString(){return op.toString()+" "+expr2.toString();}
}
