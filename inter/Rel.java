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
public class Rel extends Logica{
    public Rel(Token tok, Expr x1, Expr x2){super(tok, x1, x2);}
    public Tipo comprobar(Tipo p1, Tipo p2){
        if(p1 instanceof Arreglo || p2 instanceof Arreglo) return null;
        else if (p1 == p2) return Tipo.Bool;
        else return null;
    }
    public void salto(int t, int f){
        Expr a = expr1.reducir();
        Expr b = expr2.reducir();
        String prueba = a.toString() + " " + op.toString() + " " + b.toString();
        emitirsaltos(prueba, t, f);
    }
}
