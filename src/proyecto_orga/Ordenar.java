/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_orga;

/**
 *
 * @author Gabriel
 */
public class Ordenar {

    private leer leer;
    private escribir escribir;
    private Tipo tipo;

    public void Ordenar() {
        int n = 4096;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (leer.leer(i, tipo) > leer.leer(j, tipo)) {
                    int temp = leer.leer(i, tipo);
                    escribir.escribir(i, tipo, new leer(j, tipo));
                    escribir.escribir(j, tipo, temp);
                }
            }
        }
    }

}
