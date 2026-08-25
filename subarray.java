import java.util.Scanner;
public class subarray {
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

        for (int si = 0 ; si < array.length ; si++){
            for (int ei = si ; ei < array.length ; ei++){
                for (int k = si ; k <= ei ; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
