/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;


/**
*@author Juan Sebastian Gil Coy
*
*/

public class SinVuelo implements TipoVuelo {

/* (non-Javadoc)
* @see com.cibancode.patterndesign.lab4.supertype.TipoVuelo#vuelo()
*/


@Override
public void vuelo() {
 
System.out.println("no puedo volar");
}   
}
