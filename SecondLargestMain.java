import java.util.*;

class SLargeInArray{
    int[] a = new int[5];
    
    public int secondLargest(){
        for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 4 - i; j++){
                        if (a[j] < a[j + 1]) {
                                int temp = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = temp;
                        }
                    }
        }
        
        return a[1];
    }
}

public class SecondLargestMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter 5 element: ");
        for(int i = 0; i < 5; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        
        SLargeInArray obj = new SLargeInArray();
        obj.a = arr;
        System.out.println("Second Largest: " + obj.secondLargest());
        
        sc.close();
    }
}


