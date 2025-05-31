package model;

import java.io.*;
import java.util.*;
//vienen con el bufferedreader y fileReader


public class cargaitem {
    public static List<item> cargarItems() throws IOException {
        // Cargar los items desde el archivo preguntas.txt
        // Cada línea del archivo representa un item
        // El formato de cada línea es: tipo,pregunta,respuesta,opcion1,opcion2,...
        List<item> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("preguntas.txt"));
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.startsWith("#") || linea.trim().isEmpty()) continue; // Ignorar comentarios y líneas vacías
            String[] partes = linea.split(",");
            if (partes[0].equals("multiple")) {
                items.add(new multiple(partes[0], partes[1], partes[2], Arrays.copyOfRange(partes, 3, partes.length)));
            } else if (partes[0].equals("vf")) {
                items.add(new vf(partes[0], partes[1], partes[2]));
            }
        }
        br.close();
        return items;
    }
}


