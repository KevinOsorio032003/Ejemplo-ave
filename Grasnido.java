/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;


/**
*@author Juan Sebastian Gil Coy
*
*/

public class Grasnido implements TipoSonido {
/*(non-Javadoc) 
* @see com.cibancode.patterndesign.lab4.supertype.TipoSonido#makeSound()
*/

@Override
public void makeSound() {

System.out.println("grasnando");
}
}
