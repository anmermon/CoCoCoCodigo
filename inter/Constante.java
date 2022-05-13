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
public class Constante extends Expr{
    public Constante (Token tok, Tipo p){super (tok, p);}
    public Constante (int i){super(new Num(i), Tipo.Int);}
    public static final Constante
            True = new Constante(Palabra.True, Tipo.Bool),
            False = new Constante(Palabra.False, Tipo.Bool);
    public void salto(int t, int f){
        if(this == True &&t != 0) emitir("goto L"+t);
        else if(this == False && f != 0) emitir("goto L"+f);
    }
}