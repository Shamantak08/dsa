import java.util.Scanner;
public class sumOfArray{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

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

        System.out.print("Sum of array: ");
        int sum = 0;
        for (int i = 0 ; i < n ; i++){
            sum = array[i] + sum;
        }
        System.out.print(sum);
    }
}
