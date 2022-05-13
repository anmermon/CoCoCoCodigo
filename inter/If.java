/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;
import simbolos.*;
/**
 *
 * @author Andre
 */
public class If extends Instr{
    Expr expr; Instr instr;
    public If(Expr x, Instr s){
        expr = x; instr = s;
        if(expr.tipo != Tipo.Bool) expr.error("se requiere un booleano en if");
    }
    public void gen(int b, int a){
        int etiqueta = nuevaEtiqueta();
        expr.salto(0, a);
        emitirEtiqueta(etiqueta); instr.gen(etiqueta, a);
    }
}
