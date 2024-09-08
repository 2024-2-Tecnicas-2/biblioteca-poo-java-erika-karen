package com.mycompany.biblioteca.java;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaJava {

    static ArrayList publicaciones = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        while (true) {
            System.out.println("1.Agregar publicación Revista");
            System.out.println("2.Agregar publicación Libro");
            System.out.println("3.Mostrar las Publicaciones");
            System.out.println("4.Editar la publicación: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {
                agregarPublicacion(opc);
            } else if (opc == 2) {
                agregarPublicacion(opc);

            } else if (opc == 3) {
                MostrarPublicaciones(opc);

            } else if (opc == 4) {
                EditarPublicaciones(opc);

            } else {
                System.out.println("Por favor ingrese una opcion correcta");
            }

        }

    }

        public static void agregarPublicacion(int opc) {
        Revista revista = new Revista();
        Libro libro = new Libro();
        System.out.println("");

        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre de la revista: ");
                String Nombre = sc.nextLine();
                revista.setTitulo(Nombre);
                System.out.println("Ingrese el año de publicación: ");
                int ano = Integer.parseInt(sc.nextLine());
                revista.setAnoPublicacion(ano);
                System.out.println("Ingrese el numero de la revista: ");
                int numbrevista = Integer.parseInt(sc.nextLine());
                revista.setNumeroRevistas(numbrevista);
                System.out.println("Ingrese el titulo de la revista: ");
                String nombRevista = sc.nextLine();
                revista.setNombreRevista(nombRevista);
                publicaciones.add(revista);

                break;
            case 2:
                System.out.println("Ingrese el nombre del libro: ");
                Nombre = sc.nextLine();
                libro.setTitulo(Nombre);
                System.out.println("Ingrese el año de publicacion: ");
                ano = Integer.parseInt(sc.nextLine());
                libro.setAnoPublicacion(ano);
                System.out.println("Ingrese el numero de paginas: ");
                numbrevista = Integer.parseInt(sc.nextLine());
                libro.setNumero_de_paginas(numbrevista);
                System.out.println("Ingrese el titulo del libro: ");
                nombRevista = sc.nextLine();
                libro.setTitulo(nombRevista);
                publicaciones.add(revista);
            case 3:
                MostrarPublicaciones(opc);
                break;
            case 4:
                EditarPublicaciones(opc);
            default:
                throw new AssertionError("Por favor ingrese una opcion valida");
        }
    }

        public static void MostrarPublicaciones(int opc) {
        for (int i = 0; i < publicaciones.size(); i++) {
            System.out.println(i + " : " + publicaciones.get(i).toString());
        }

    }

        public static void EditarPublicaciones(int opc) {
        MostrarPublicaciones(opc);

        System.out.println("Ingrese el que quieras editar");

        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= publicaciones.size()) {
            System.out.println("El indice es invalido");

            return; 

        }

        Publicacion publicacion = (Publicacion) publicaciones.get(index);

        System.out.println("Introduce el nuevo titulo");
        String TituloNuevo = sc.nextLine();
        publicacion.setTitulo(TituloNuevo);

        System.out.println("Publicación actualizada con éxito");

    }
}
