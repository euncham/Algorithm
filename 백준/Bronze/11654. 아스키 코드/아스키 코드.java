import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        int a = System.in.read();//System.in은 Byte값으로 문자 한개를 읽으면서
        //해당 문자에 대응되는 아스키코드 값을 저장할 수 있다.
        System.out.println(a);
    }
}