import java.util.*;


class CE_Scores { 
    int[][] numbers = new int[6][2]; 
    CE_Scores() { 
        System.out.println("---INPUT---"); 
        Scanner sc = new Scanner(System.in); 
        for (int i = 0; i < 6; i++) { 
            System.out.println("-> Subject_" + (i + 1)); 
            System.out.print("Enter marks: "); 
            numbers[i][0] = sc.nextInt(); 
            System.out.print("Enter code: "); 
            numbers[i][1] = sc.nextInt(); 
        } 
    }

    public int point(int marks) { 
        if (marks >= 90) 
            return 1; 
        else if (marks >= 80) 
            return 2; 
        else if (marks >= 70) 
            return 3; 
        else if (marks >= 60) 
            return 4; 
        else if (marks >= 50) 
            return 5; 
        else if (marks >= 40) 
            return 6; 
        else if (marks >= 30) 
            return 7; 
        else if (marks >= 20) 
            return 8; 
        else if (marks >= 10) 
            return 9; 
        else if (marks >= 0) 
            return 10; 
        else 
            return 0; 
    } 
}

class best_four extends CE_Scores { 
    void bestsubjects() { 
        int[][] points = new int[6][2]; 

        for (int i = 0; i < 6; i++) { 
            points[i][0] = super.point(super.numbers[i][0]); 
            points[i][1] = super.numbers[i][1]; 
        } 

        int size = points.length; 
        for (int i = 0; i <= size - 1; i++) { 
            for (int j = 0; j < (size - i - 1); j++) { 
                if (points[j][0] < points[j + 1][0]) { 
                    int temp = points[j][0]; 
                    points[j][0] = points[j + 1][0]; 
                    points[j + 1][0] = temp; 
                } 
            } 
        } 

        int total = 0; 
        for (int i = 0; i < size; i++) { 
            total += points[i][0]; 
        }

        System.out.println("Total points: " + total); 

        System.out.println("\nBest 4 subjects:"); 
        for (int i = 0; i < 4; i++) { 
            System.out.println(i + 1 + ". subject_code: " + points[i][1]); 
        } 
    } 
}

public class Scores {
    public static void main(String[] args) { 
        best_four ob = new best_four(); 
        ob.bestsubjects(); 
    } 
} 
