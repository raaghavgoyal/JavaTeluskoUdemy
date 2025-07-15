package S3L92Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        //int num = System.in.read();//reads ascii value of the character
        //System.out.println(num-48);
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int result = Integer.parseInt(bf.readLine());
        // System.out.println(result);
        // // bufferedReader should be closed ideally to free the resource
        // bf.close();

        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        System.out.println(result);

    }
}
