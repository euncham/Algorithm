import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int [] arr = new int[31];
        
        for(int i = 1; i < 29; i++){
            arr[s.nextInt()]++;
        }
        for(int i = 1; i < 31; i++){
            if(arr[i]==0){
                System.out.println(i);
            }
        }
    }
}