/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author lvs_1
 */

public enum TipoAlimentacion {
    CARNIVORO,
    HERBIVORO,
    OMNIVORO;

    public boolean esCarnivoro () {
        return this == CARNIVORO;
    }

    public boolean esHerbivoro(){
        return this == HERBIVORO;
    }
}
