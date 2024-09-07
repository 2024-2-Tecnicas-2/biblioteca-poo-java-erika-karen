package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {

    private int numeroRevista;
    private String nombreRevista;

    public Revista(String titulo, int añoPublicacion, int numeroRevista, String nombreRevista) {
        super(titulo, añoPublicacion);
        this.numeroRevista = numeroRevista;
        this.nombreRevista = nombreRevista;
    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de revista: " + numeroRevista);
        System.out.println("Nombre de la revista: " + nombreRevista);
    }
}

