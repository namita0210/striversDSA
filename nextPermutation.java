import java.util.*;
public class nextPermutation {

    //Function for finding Pivot
    public static int findPivot(int[]arr){
        int pivot =-1;
        //sort the array
        Arrays.sort(arr);
        for(int i = arr.length-2 ; i <=0 ; i--){
            if(arr[i]< arr[i+1]){
                pivot = arr[i];
            }
        }
        return pivot;
    }

    //display an array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Function for next permutation - Brute FOrce
    public static int[] nextP(int[]arr){

        findPivot(arr);

        return arr;
    }

    //Main Method
    public static void main(String[]args){
        int[]arr = {1,2,3};
        
    }
}
