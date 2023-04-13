import java.util.Scanner;


class SearchInArrray{
    int a[] = new int[5];
    int ele;
    public int binarySearch(){
        int mid, start, end;
        start = 0;
        end = 4;
        
        while(start<=end){
            mid = (start+end)/2;
            if(ele == a[mid]){
                System.out.println(ele + " is at " + mid);
                return 1;
            }
            else if(ele > a[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return 0;
    }
}

public class BinarySearchC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        System.out.println("Enter 5 element: ");
        for(int i = 0; i < 5; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        
        SearchInArrray obj = new SearchInArrray();
        obj.a = arr;
        
        System.out.print("Enter number to search: ");
        obj.ele = sc.nextInt();
        
        if(obj.binarySearch()==0) System.out.println("Not Found");
        
        sc.close();
    }
}