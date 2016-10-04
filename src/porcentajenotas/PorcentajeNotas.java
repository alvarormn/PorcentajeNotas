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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class PorcentajeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator(',');
        DecimalFormat df= new DecimalFormat("#0.00000",simbolos);
        double alumnos = 0;
        double presentados = 0;
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
        notas = new int [6];
        try{
            System.out.println("Introduce en numero de alumnos por su nota en el examen");
            for (int i=0; i<notas.length; i++) {
                System.out.print(titulos[i] + "-> ");
                notas[i] = Integer.parseInt(pedirNumero());
                System.out.println(notas[i]);
                alumnos = alumnos + notas[i];
                if (i < 5) {
                  presentados = presentados + notas[i];
                }
            }
            System.out.println("\tPresentados\tTotal");
            for (int i=0; i<notas.length; i++) {
                double primera = notas[i]*100/presentados;
                double segunda = notas[i]*100/alumnos;
                if (i == 5) {
                    System.out.println(titulos[i] + "\t" + "-" + "\t\t" + df.format(segunda) + "%");
                }else{
                    System.out.println(titulos[i] + "\t" + df.format(primera) + "%"+ "\t" + df.format(segunda) + "%");
                }
            }
          

          /*String sb = pedirNumero();
          System.out.print(sb);*/


        }catch(Exception e){
            System.out.print("Se ha producido un error " + e);
        }


    }

    public static String pedirNumero()throws IOException {
        BufferedReader sb = new BufferedReader (
        new InputStreamReader(System.in));
        String cadena=sb.readLine();
        return cadena;
    }

}
