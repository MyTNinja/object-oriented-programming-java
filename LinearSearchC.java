import java.util.Scanner;

class SearchInArray{
    int a[] = new int[5];
    int ele;
    public int linearSearch(){
        for(int i = 0; i < 5; i++){
            if(a[i]==ele){
                System.out.println(ele + " is at " + i);
                return 1;
            }
        }
        return 0;
    }
}

public class LinearSearchC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        System.out.println("Enter 5 element: ");
        for(int i = 0; i < 5; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        
        SearchInArray obj = new SearchInArray();
        obj.a = arr;
        
        System.out.print("Enter number to search: ");
        obj.ele = sc.nextInt();
        
        if(obj.linearSearch()==0) System.out.println("Not Found");
        
        sc.close();
    }
}