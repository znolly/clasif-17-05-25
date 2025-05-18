import java.io.*;
public class C{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String linea = br.readLine();
    int n = Integer.parseInt(linea);
    int var = n/3;
    int res = 2*var;
    System.out.println(res);
   }
}