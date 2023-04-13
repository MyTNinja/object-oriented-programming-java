import java.util.Scanner;

class SLInArray{
    int[] a = new int[5];
    
    public void smallLarge(){
        for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 4 - i; j++){
                        if (a[j] < a[j + 1]) {
                                int temp = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = temp;
                        }
                    }
        }
        
        System.out.println("Smallest: " + a[0]);
        System.out.println("Largest: " + a[4]);
    }
}

public class SmallestNLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter 5 element: ");
        for(int i = 0; i < 5; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        
        SLInArray obj = new SLInArray();
        obj.a = arr;
        obj.smallLarge();
        
        sc.close();
    }
}


