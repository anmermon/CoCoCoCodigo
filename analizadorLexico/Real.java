/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorLexico;

/**
 *
 * @author Andre
 */
public class Real extends Token{
    public final float valor;
    public Real(float v){ super(Etiqueta.REAL); valor = v;}
    public String toString(){return "" + valor;}
}
