/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_orga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Gabriel
 */
public class RAM {

    private Vector<Integer> Datos;

    public RAM() {
        this.Datos = new Vector();
        File d = new File("./src/proyecto_orga/Datos.txt");
        String line = null;
        try {
            FileReader fileReader = new FileReader(d);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                this.Datos.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.err.println("No se pudo abrir " + d.getName());
        } catch (IOException ex) {
            System.err.println("No se pudo leer " + d.getName());
        }
    }

    public Vector<Integer> getDatos() {
        return Datos;
    }

    public int elementAt(int i) {
        return (int) Datos.elementAt(i);
    }

    public int size() {
        return Datos.size();
    }

    public void add(int n) {
        Datos.add(0, n);
    }

}
