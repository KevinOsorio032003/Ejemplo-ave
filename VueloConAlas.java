/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

import java.util.logging.Logger;

/**
*
* @author Juan Sebastian Gil Coy 
* Esta clase especifica el vuelo de un ave
*/

public class VueloConAlas implements TipoVuelo {

/*(non-Javadoc)
* see com.cibancode.patterndesign.lab4.supertype.TipoVuelo#vuelo()
*
*/


@Override
public void vuelo() {
   
  System.out.println("Esta volando, aleteando");
}
}
