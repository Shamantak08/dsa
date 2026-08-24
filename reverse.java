import java.util.Scanner;
public class reverse {
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

        for (int i = 0 ; i < n/2 ; i++){
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        System.out.print("Reversed array: ");
        for (int i = 0 ; i<n ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
