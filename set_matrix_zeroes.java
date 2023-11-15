public class set_matrix_zeroes{

    //display matrix function
    public static void display(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;
        for(int i = 0 ; i< row; i++){
            for(int j = 0 ; j < column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //row - wise traversal
    public static void rowTraverse(int[][]arr){
        int row = arr.length;
        int column = arr[0].length;

        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //column - wise traversal
    public static void columnTraverse(int[][]arr){
        int row = arr.length;
        int column = arr[0].length;

        for(int i = 0 ; i < column ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.println(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    //create matrix method
    public static int[][] createMatrix(int row, int column){      

        int[][]matrix = new int[row][column];

        int value = 1;

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j< column ; j++){
                matrix[i][j] = value;
                value++;
            }
        }
        return matrix;
    }

    //convert matrix to zeroes = BRUTE FORCE METHOD

    private static int[][] markAndConvert(int[][]arr, int row , int col){
        int rows = arr.length;
        int columns = arr[0].length;

        //mark the row
        // in this row, jitney bhi column 0 nahi hai sabko -1 bana do
        for(int j = 0 ; j < columns ; j++){
            if(arr[row][j] != 0){ // keep row same, vary the column - j
                arr[row][j] = -1;
            }
        }

        //mark column
        // in this column , jitney bhi rows 0 nahi hia , sabko -1 banado
        for(int i = 0 ; i < rows ; i++){
            if(arr[i][col] != 0){ // keep column same, vary the row - i
                arr[i][col] = -1;
            }
        }
        return arr;
    }

    //brute force driver function 
    public static int[][] bruteF(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;

        //identify zeroes
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                if(arr[i][j] == 0){
                    markAndConvert(arr,i,j);
                }
            }
        }
        //convert -1 to 0
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                if(arr[i][j] ==-1){
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }

    //main method
    public static void main(String[]args){     
       
        int[][]exMatrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        display(exMatrix);
        System.out.println("----------");
        bruteF(exMatrix);
        display(exMatrix);
    
    }
}
