import java.io.*;
import java.util.*;

public class F{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] datos = br.readLine().split(" ");
        int totalRecaudado= Integer.parseInt(datos[0]); 
        int totalPersonas = Integer.parseInt(datos[1]); 
        int precioTotal= Integer.parseInt(datos[2]); 

        int lunares = 2 * (precioTotal * totalPersonas  - totalRecaudado ) / precioTotal;

        System.out.println(lunares);
    }
}