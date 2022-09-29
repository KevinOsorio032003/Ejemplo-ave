/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

import java.util.logging.Logger;

public class Gallina extends Ave { 
 
 
public Gallina() { 
 
this.setTipoSonido (new Grasnido()); 
this.setTipoVuelo( new VueloConAlas()); 
         } 

    private void setTipoVuelo(VueloConAlas vueloConAlas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

