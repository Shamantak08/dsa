import java.util.Scanner;
public class max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0 ; i<n ; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("");

        //printing original array

        System.out.print("Given array: ");
        
        for (int i = 0 ; i<n ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 0 ; i < n-1 ; i++){
            if (max < array[i+1]){
                max = array[i+1];
            }
        }
        System.out.println("Max: " + max);
    }
}
