import java.util.Scanner;
public class rotate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int [][] matrix = new int[rows][cols];

        //getting matrix input
        for ( int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < cols ; j++){
                System.out.print("Element[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //printing original matrix
        System.out.println("Original matrix: ");
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //transposing matrix
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0 ; i < transpose.length ; i++){
            for (int j = 0 ; j < transpose[i].length ; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        //printing transposed matrix
        for (int i = 0 ; i < transpose.length ; i++){
            for (int j = 0 ; j < transpose[0].length ; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //reversing each row
        for (int i = 0 ; i < transpose.length ; i++){
            for (int j = 0 ; j < transpose[i].length/2 ; j++){
                int temp = transpose[i][j];
                transpose[i][j] = transpose[i][transpose[i].length - j - 1];
                transpose[i][transpose[i].length - j - 1] = temp;
            }
        }

        //printing rotated matrix
        for (int i = 0 ; i < transpose.length ; i++){
            for (int j = 0 ; j < transpose[0].length ; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
