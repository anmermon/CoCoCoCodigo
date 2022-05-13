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
public class While extends Instr {
    Expr expr; Instr instr;
    public While(){expr = null; instr = null;}
    public void inic(Expr x, Instr s){
        expr = x; instr = s;
        if(expr.tipo != Tipo.Bool) expr.error("se requiere un booleano en while");
    }
    public void gen(int b, int a){
        despues = a;
        expr.salto(0, a);
        int etiqueta = nuevaEtiqueta();
        emitirEtiqueta(etiqueta); instr.gen(etiqueta,b);
        emitir("goto L" + b);
    }
}
