import java.io.*;

public class RevWords {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter string: ");
        String s = br.readLine();

        String op = "";

        String[] str = s.split(" ");

        for(int i = str.length-1; i>=0; i--) {
            if(i==0) op = op + str[i];
            else op = op + str[i] + " ";
        }

        System.out.println("\nOutput: ");
        System.out.println(op);
    }
}
