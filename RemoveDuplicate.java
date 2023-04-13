import java.util.*;

class Duplicate{
    int a[] = new int[5];
    int b[];
    int count;
    public void sort(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4 - i; j++){
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public void countDuplicate(){
        count = 0;
        for(int i = 1; i<a.length; i++){
            if(a[i-1]==a[i]) count++;
        }
    }

    public void removeDuplicate(){
        b = new int[a.length - count];
        b[0] = a[0];

        int j = 0;
        for(int i = 1; i<a.length; i++){
            if(a[i]==b[j]) continue;
            b[j+1] = a[i];
            j++;
        }
    }

    public void display(){
        for(int i = 0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}


public class RemoveDuplicate{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 element: ");
        for(int i = 0; i < 5; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }

        Duplicate obj = new Duplicate();
        obj.a = arr;
        obj.sort();
        obj.countDuplicate();
        obj.removeDuplicate();
        obj.display();
    }
}