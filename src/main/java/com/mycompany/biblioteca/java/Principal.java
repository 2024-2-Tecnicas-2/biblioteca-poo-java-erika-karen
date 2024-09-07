package com.mycompany.biblioteca.java;

public class Principal {

    public static void main(String[] args) {
        Libro libro = new Libro("Satanas", 2002, "Mario Mendoza", 251);
        Revista revista = new Revista("Ciencia Hoy", 2024, 12, "Revista Científica");

        System.out.println("Información del libro:");
        libro.mostrarInfo();

        System.out.println("\nInformación de la revista:");
        revista.mostrarInfo();
    }
}

