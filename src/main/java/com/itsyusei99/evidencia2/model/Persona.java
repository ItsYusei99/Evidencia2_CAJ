package com.itsyusei99.evidencia2.model;

import java.io.Serializable;

public class Persona implements Serializable {
    private double peso;
    private double altura;

    public Persona() {}

    // Getters y Setters
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    // Lógica del IMC
    public double getImc() {
        double alturaMeters = altura / 100;
        return peso / (alturaMeters * alturaMeters);
    }

    public String getNivel() {
        double imc = getImc();
        if (imc < 18.5) return "Bajo peso";
        if (imc < 25) return "Normal";
        if (imc < 30) return "Sobrepeso";
        return "Obesidad";
    }
}