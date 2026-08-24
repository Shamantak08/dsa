import java.util.Scanner;
public class subarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] array = {1,2,3};

        for (int i = 0 ; i < array.length ; i++){
            for (int j = i ; j < array.length ; j++){
                System.out.print(array[i]);
            }
        }
    }
    
}
