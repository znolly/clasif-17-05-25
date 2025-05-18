import java.io.*;
import java.util.*;
public class D{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String linea = br.readLine();
    int n = Integer.parseInt(linea);
    String ln = br.readLine();
    String[] lns = ln.split(" ");
    int[] arr = new int[2*n];
    for(int i = 0; i<2*n; i++){
        arr[i] = Integer.parseInt(lns[i]);
    }
    int[]sumas= new int[n];
    int j = 0;
    for(int i = 0; i < arr.length-2 ; i++ ){
        sumas[j] = arr[i] + arr[i+1];  
        j++;   
    }
    Arrays.sort(sumas);
    int res = sumas[n-1];
    System.out.println(res);
   }
}
