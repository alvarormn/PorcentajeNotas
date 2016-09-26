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
    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
        BufferedReader uno = new BufferedReader (
        new InputStreamReader(System.in));
        System.out.println(uno);
        
        String cadena=uno.readLine();
        int num=Integer.parseInt(cadena);
    }
    
}
