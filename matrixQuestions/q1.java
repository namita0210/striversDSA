//Take a matrix as input from the user
//Search for a given # x
//Print the indices where it occurs.
package matrixQuestions;
import java.util.Scanner;
public class q1 {

    //Take matrix input
    public static void takeMatrixInput(int n_rows , int n_cols){
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[n_rows][n_cols];        
        for(int i = 0 ; i < n_rows ; i++){
            for(int j = 0 ; j < n_cols; j++){
                System.out.println("Enter a value at row: "+i+" and col: "+j);
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("The matrix is question is displayed below:");
        display(arr);
    }

    //Display matrix
    public static void display(int[][]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Search for an element in matrix
    public static void searchMatrix(int[][] arr , int element){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] == element){
                    System.out.println(i+","+j);
                }
            }
        }
    }

    //Main Method
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n_rows = scn.nextInt();
        System.out.println("Enter the number of columns: ");
        int n_cols = scn.nextInt();
        takeMatrixInput(n_rows,n_cols);
        System.out.println("-----------------------");
        int[][] arr2 = {{1,2,3},{4,5,6}};
        searchMatrix( arr2, 999);
        System.out.println("-----------------------");
        searchMatrix(arr2, 5);

        
    }
    
}
