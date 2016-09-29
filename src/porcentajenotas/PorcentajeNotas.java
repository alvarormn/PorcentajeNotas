/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package porcentajenotas;

/**
 *
 * @author alvaro
 */
import java.io.*;
public class PorcentajeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        int alumnos = 0;
        int presentados = 0;
        String titulos[];
        int notas[];
        titulos = new String [] {
            "SB",
            "N",
            "A",
            "S",
            "P",
            "NP"
        };
        notas = new int [5];
        try{
          for (int i=0; i<=notas.length; i++) {
            System.out.println("Escribe el numero de " + titulos[i] + ":");
            notas[i] = Integer.parseInt(pedirNumero());
            alumnos = alumnos + notas[i];
            System.out.println("Valor de i" + i);
            if (notas[i] < 5) {
              presentados = presentados + notas[i];
            }
            System.out.println("Presentados " + presentados + " Total" + alumnos);
            System.out.println(titulos[i] + " -> " + notas[i]);
          }
          /*String sb = pedirNumero();
          System.out.print(sb);*/


        }catch(Exception e){
            System.out.print("Se ha producido un error");
        }


    }

    public static String pedirNumero()throws IOException {
        BufferedReader sb = new BufferedReader (
        new InputStreamReader(System.in));
        String cadena=sb.readLine();
        return cadena;
    }

}
