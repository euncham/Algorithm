import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.next();
        int a = s.nextInt()-1;
        
        System.out.println(st.charAt(a));
    }
}