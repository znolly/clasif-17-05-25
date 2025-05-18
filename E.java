import java.io.*;
import java.util.*;
public class E{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String linea = br.readLine();
    int n = Integer.parseInt(linea);
    String ln = br.readLine();
    String[] lns = ln.split(" ");
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = Integer.parseInt(lns[i]);
    }
    Arrays.sort(arr);
    int menor = arr[0];
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum+= arr[i] - menor;
    }
    System.out.println(sum);
   }
}
