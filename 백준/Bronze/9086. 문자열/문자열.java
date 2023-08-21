import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < a; i++){
            String s = br.readLine();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length()-1)+"\n");
        }
        System.out.println(sb);
    }
}