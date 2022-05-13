/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorLexico;

/**
 *
 * @author Andre
 */
public class Num extends Token{
    public final int valor; 
    public Num(int v) {super(Etiqueta.NUM); valor = v;}
    public String toString(){return "" + valor;}
    
}
