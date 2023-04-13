public class Pattern {
    public static void main(String[] args) {
        String star = "*";

        for(int i = 0; i<5; i++) {
            for (int j = 4-i; j>0; j--) {
                System.out.print(" ");
            }
            System.out.println(star);
            star = "*" + star + "*";
        }
    }
}
