@file:JvmName("Elipses")

package com.ieseljust.kscenemaker

import java.awt.Graphics
import java.awt.Color

class Elipses: Figura {

    // Inicialitzem les variables en la delcaració mateix
    // No utilitzarem cap constructor primari
    var radio1: Int=100
    var radio2: Int=100
    
    // Constructors secundaris
    constructor():super() //Sense arguments

    constructor(x: Int, y:Int, radio1:Int=100, radio2:Int=100, color:Color=Color.BLACK): super(x, y, color) {
        //super(x, y, color)
        this.radio1=radio1
        this.radio2=radio2
         
     }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("elipse " + x + " " + y + " " + radio1 + " " + radio2 + " " + color)
    }

    override fun render(g:Graphics) {
        
        /*
         * Mètode que dibuixa sobre un context gràfic la figura elipse.
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
        g.fillRect(x, y, radio1, radio2)    // Dibuixem un elipse en la posició i mida indicades
    }

}

