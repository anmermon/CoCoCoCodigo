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
public class Expr extends Nodo{
    public Token op;
    public Tipo tipo;
    Expr(Token tok, Tipo p){op = tok; tipo = p;}
    public Expr gen(){return this;}
    public Expr reducir(){return this;}
    public void salto(int t,int f){emitirsaltos(toString(),t,f);}
    public void emitirsaltos(String prueba, int t, int f){
        if( t != 0 && f != 0){
            emitir("if " + prueba + " goto L" + t);
            emitir("goto L" + f);
        }
        else if(t != 0) emitir ("if " + prueba + " goto L" + t);
        else if(f != 0) emitir ("iffalse " + prueba + " goto L" + f);
        else ;
    }
    public String toString(){return op.toString();}
}
