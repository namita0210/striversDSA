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

    //swap function
    public static int[] swap(int x , int y , int[]arr){
        int temp = 0;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y]=temp;
        return arr;
    }

    //reverse an array - > Can be done with built in function Arrays.reverse()
    public static int[] reverseArray(int[]arr){
        int n = arr.length;
        int si = 0;
        int ei = n-1;
        while (si<=ei ){
            //swap array at index si with index ei
            swap(si, ei, arr);
            //Now increase the si and decrease the ei
            si++; ei--;
        }
        return arr;
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
        display(arr);
        reverseArray(arr);
        System.out.println();
        display(arr);
        
    }
}
