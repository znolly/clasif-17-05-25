import java.util.*;
import java.io.*;

public class A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] celdas = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            celdas[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(celdas);
        int[] celdasDobladas = new int[2 * n];
        for (int i = 0; i < n;i++){
            celdasDobladas[i] = celdas[i];
            celdasDobladas[i + n] = celdas[i] + 360;
        }
       int longitudMinima = 360;
       for (int i = 0; i < n; i++){
            int inicio = celdasDobladas[i];
            int fin = celdasDobladas[i + n - 1];
            int longitud = fin - inicio + 1;
            if (longitud < longitudMinima){
                longitudMinima = longitud;
            }
        }
     System.out.println(longitudMinima);
    }
}