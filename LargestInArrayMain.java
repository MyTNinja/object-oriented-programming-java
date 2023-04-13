import java.util.*;


class LargeInArray{
    int a[] = new int[5];
    public int largest(){
        int max = a[0];
        
        for(int i = 1; i < 5; i++){
            if(a[i]>max) max = a[i];
        }
        return max;
    }
}

public class LargestInArrayMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        System.out.println("Enter 5 element: ");
        for(int i = 0; i < 5; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        
        LargeInArray obj = new LargeInArray();
        obj.a = arr;
        System.out.println("Largest: " + obj.largest());
        
        sc.close();
    }
}
