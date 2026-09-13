import java.util.Scanner;
public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] matrix = new int[rows][cols];

        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < cols ; j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //printing matrix
        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < cols ; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        int [][] transpose = new int[matrix[0].length][matrix.length];

        //transpose matrix
        for (int i = 0 ; i < transpose.length ; i++){
            for (int j = 0 ; j < transpose[0].length ; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        //printing transposed matrix
        for (int i = 0 ; i < transpose.length ; i++){
            for (int j = 0 ; j < transpose[0].length ; j++){
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }

        //reversing 
        for (int i = 0 ; i < transpose.length ; i++){
            for (int j = 0 ; j < transpose[i].length/2 ; j++){
                int temp = transpose[i][j];
                transpose[i][j] = transpose[i][transpose[i].length - 1 - j];
                transpose[i][transpose[i].length - 1 - j] = temp;
            }
        }
        System.out.println();

        for (int i = 0 ; i < transpose.length ; i++){
            for (int j = 0 ; j < transpose[0].length ; j++){
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
