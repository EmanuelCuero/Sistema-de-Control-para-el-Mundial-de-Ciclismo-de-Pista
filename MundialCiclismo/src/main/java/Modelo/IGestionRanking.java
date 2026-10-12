/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author emanu
 */
public interface IGestionRanking {
    void actualizarRanking(int puntos);
    void actualizarRanking(int puntos, boolean ganoMedalla);
    String obtenerDatos();
}