package com.mycompany.biblioteca.java;

public class Libro extends Publicacion {

    private String autor;
    private int numeroPaginas;

    public Libro(String titulo, int añoPublicacion, String autor, int numeroPaginas) {
        super(titulo, añoPublicacion);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
