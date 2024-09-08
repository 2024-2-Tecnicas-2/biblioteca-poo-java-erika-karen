package com.mycompany.biblioteca.java;

public class Libro extends Publicacion {
    
    String Autor;
    int NumeroDePaginas;

    public Libro() {
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumero_de_paginas() {
        return NumeroDePaginas;
    }

    public void setNumero_de_paginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public Libro(String Autor, int NumeroDePaginas, String Titulo, int anoPublicacion) {
        super(Titulo, anoPublicacion);
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    
    //Override

    @Override
    public String toString() {
        return "Libro{"+ "Titulo=" + super.Titulo + ", anoPublicacion=" + super.anoPublicacion + "Autor=" + Autor + ", NumeroDePaginas=" + NumeroDePaginas + '}';
    }
    
}
