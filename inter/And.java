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
public class And extends Logica{
    public And (Token tok, Expr x1, Expr x2){super (tok, x1, x2);}
    public void salto(int t, int f){
        int etiqueta = f != 0 ? f : nuevaEtiqueta();
        expr1.salto(0, etiqueta);
        expr2.salto(t, f);
        if(f == 0)emitirEtiqueta(etiqueta);
    }
}