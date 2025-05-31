package model;

import java.io.*;
import java.util.*;
//vienen con el bufferedreader y fileReader


public class cargaitem {
    public static class resultadocarga {
        public String asignatura;
        public String evaluacion;
        public List<item> items;
        public resultadocarga(String asignatura, String evaluacion, List<item> items) {
            this.asignatura = asignatura;
            this.evaluacion = evaluacion;
            this.items = items;
        } 
    }
    public static resultadocarga cargarItems(File archivo) throws IOException {
        List<item> items = new ArrayList<>();
        String asignatura;
        String evaluacion;
        try (BufferedReader br = new BufferedReader(new FileReader("preguntas.txt"))) {
            asignatura = br.readLine(); // Leer la primera línea 
            evaluacion = br.readLine(); // Leer la segunda línea 
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("#") || linea.trim().isEmpty()) continue;
                String[] partes = linea.split(",");
                if (partes[0].equals("multiple")) {
                    items.add(new multiple(partes[0], partes[1], partes[2], Arrays.copyOfRange(partes, 3, partes.length)));
                } else if (partes[0].equals("vf")) {
                    items.add(new vf(partes[0], partes[1], partes[2]));
                }
            }
        }
        return new resultadocarga(asignatura, evaluacion, items);
    }
}


