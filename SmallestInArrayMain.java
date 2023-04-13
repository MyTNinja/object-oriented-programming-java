import java.util.Scanner;


class SmallInArray{
    int[] a = new int[5];
    public void smallest(){
        int min = a[0];
        int index = 0;
        
        for(int i = 1; i < 5; i++){
            if(a[i]<min){
                min = a[i];
                index = i;
            }
        }
        
        System.out.println("Index of smallest: " + index);
    }
}

public class SmallestInArrayMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter 5 element: ");
        for(int i = 0; i < 5; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        
        SmallInArray obj = new SmallInArray();
        obj.a = arr;
        obj.smallest();
        
        sc.close();
    }
}
