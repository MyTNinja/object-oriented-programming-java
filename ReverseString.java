import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    String usingLoop(String str) {
        String output = "";
        for(int i = 0; i<str.length(); i++) {
            output = str.charAt(i) + output;
        }

        return output;
    }

    String usingStringBuilder(String str) {
        StringBuilder stb = new StringBuilder(str);

        return stb.reverse().toString();
    }

    String usingRecursion(String str) {
        if(str.equals("")) {
            return str;
        }
        return usingRecursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader i  = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        System.out.println("Enter a String: ");
        String input = br.readLine();

        System.out.println("Reverse of String: ");
        ReverseString ob = new ReverseString();
        System.out.println(ob.usingLoop(input));
        System.out.println(ob.usingStringBuilder(input));
        System.out.println(ob.usingRecursion(input));
    }
}
