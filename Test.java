/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;



 public class Test  { 

 
public void canarioTest  { 
Canario canario = new Canario(); 
Assert.assertNotNull(canario); 

 System.out.println("canario realizaVuelo");
 canario.realizaVuelo(); 

 System.out.println("canario realizaSonido"); 
canario.realizaSonido(); 
System.out.println("canario cambiando sonido ave");
 canario.setTipoSonido (new Grasnido()) ;
System.out.println("canario realizaSonido"); 
canario.realizaSonido();
}
}
