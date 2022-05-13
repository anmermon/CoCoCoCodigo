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
public class Acceso extends Op{
    public Id arreglo;
    public Expr indice;
    public Acceso(Id a, Expr i, Tipo p){
        super(new Palabra("[]", Etiqueta.INDEX), p);
        arreglo = a; indice = i;
    }
    public Expr gen(){return new Acceso(arreglo, indice.reducir(), tipo);}
    public void salto(int t, int f){emitirsaltos(reducir().toString(),t,f);}
    public String toString(){
        return arreglo.toString() + " [ " + indice.toString() + " ] ";
    }
}
