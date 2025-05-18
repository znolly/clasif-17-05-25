import java.io.*;
import java.util.*;
public class B{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String linea = br.readLine();
    int n = Integer.parseInt(linea);
    int res = 0;
    Random r = new Random();
    res = r.nextInt((int)Math.pow(10,5))+n;
    System.out.println(res);

   }
}
