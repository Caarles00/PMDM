@file:JvmName("Cercles")

package com.ieseljust.kscenemaker

import java.awt.Graphics
import java.awt.Color

class Cercles: Figura {

    // Inicialitzem les variables en la delcaració mateix
    // No utilitzarem cap constructor primari
    var radio: Int = 100
    
    // Constructors secundaris
    constructor():super() //Sense arguments

    constructor(x: Int, y:Int, radio:Int=100, color:Color=Color.BLACK): super(x, y, color) {
        //super(x, y, color)
        this.radio = radio
         
     }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("cercle " + x + " " + y + " " + radio + " " + color)
    }

    override fun render(g:Graphics) {
        
        /*
         * Mètode que dibuixa sobre un context gràfic la figura cercle.
         * S'utilitza per al mètode render() de App.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         * 
         * Fixeu-vos que això són classes de java que estem utilitzant
         * directament des de Kotlin!
         * 
         */

        g.setColor(color)             // Establim el color interior
        g.fillOval(x-radio, y-radio, 2*radio, 2*radio)    // Dibuixem un cercle en la posició i mida indicades
    }

}

