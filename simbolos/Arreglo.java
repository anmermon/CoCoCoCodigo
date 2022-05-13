/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simbolos;
import analizadorLexico.*;
/**
 *
 * @author Andre
 */
public class Arreglo extends Tipo {
    public Tipo de;
    public int tamanio = 1;
    public Arreglo(int tm, Tipo p){
        super("[]", Etiqueta.INDEX, tm*p.anchura); tamanio =tm; de = p;
    }
    public String toString(){return "[" + tamanio + "]" +de.toString();}
}
