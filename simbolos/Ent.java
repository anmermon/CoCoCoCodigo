/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simbolos;
import java.util.*;
import analizadorLexico.*;
import inter.*;
/**
 *
 * @author Andre
 */
public class Ent {
    private Hashtable tabla;
    protected Ent ant;
    public Ent(Ent n) {tabla = new Hashtable(); ant = n;}
    public void put(Token w, Id i) {tabla.put(w,i);}
    public Id get(Token w){
        for (Ent e = this; e != null; e = e.ant){
            Id encontro = (Id)(e.tabla.get(w));
            if(encontro != null) return encontro;
        }
        return null;
    }
}
