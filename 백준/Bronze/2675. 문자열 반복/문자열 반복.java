import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      
      for(int i=0; i<n; i++){
         String[] str = br.readLine().split(" ");
         int s = Integer.parseInt(str[0]);
         for(byte val:str[1].getBytes()){
            for(int j=0; j<s; j++){
            sb.append((char)val);
            }
         }
         sb.append('\n');
      }
      System.out.println(sb);
  }
}