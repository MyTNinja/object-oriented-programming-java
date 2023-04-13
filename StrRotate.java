import java.io.*;

public class StrRotate {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter string a: ");
        String a = br.readLine();

        System.out.println("\nEnter string b: ");
        String b = br.readLine();

        int len = b.length();

        String anticlock = b.substring(len-2, len) + b.substring(0, len-2);
        String clock = b.substring(2, len) + b.substring(0, 2);

        System.out.print("\nOutput: ");
        if(a.equals(anticlock) || a.equals(clock)) System.out.println("1");
        else System.out.println("0");
    }
}
