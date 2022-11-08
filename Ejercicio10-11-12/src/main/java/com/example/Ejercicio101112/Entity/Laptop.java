package com.example.Ejercicio101112.Entity;


import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Computadoras")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String microprocesadorNombre;
    private String color;
    private String sistemaOperativo;
    private Double tamañoPantalla;
    private boolean pantallaTactil;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String microprocesadorNombre, String color, String sistemaOperativo, Double tamañoPantalla, boolean pantallaTactil) {
        this.id = id;
        this.marca = marca;
        this.microprocesadorNombre = microprocesadorNombre;
        this.color = color;
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;
        this.pantallaTactil = pantallaTactil;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMicroprocesadorNombre() {
        return microprocesadorNombre;
    }

    public void setMicroprocesadorNombre(String microprocesadorNombre) {
        this.microprocesadorNombre = microprocesadorNombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(Double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public boolean isPantallaTactil() {
        return pantallaTactil;
    }

    public void setPantallaTactil(boolean pantallaTactil) {
        this.pantallaTactil = pantallaTactil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
