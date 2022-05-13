/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;

/**
 *
 * @author Andre
 */
public class Break extends Instr{
    Instr instr;
    public Break(){
        if( Instr.Circundante == null) error("break no encerrada");
        instr = Instr.Circundante;
    }
    public void gen(int b,int a){
        emitir("goto L" + instr.despues);
    }
}
