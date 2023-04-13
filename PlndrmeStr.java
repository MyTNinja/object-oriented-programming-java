import java.io.*;

public class PlndrmeStr {
    public static int palindrome(StringBuffer str) {
        if(str.toString().contentEquals(str.reverse())) return 1;
        return 0;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter string: ");
        String s = br.readLine();

        StringBuffer str = new StringBuffer(s);

        System.out.println("\nOutput: " + palindrome(str));
    }
}
