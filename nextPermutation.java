import java.util.*;
public class nextPermutation {

    //swap function
    public static int[] swap(int x , int y , int[]arr){
        int temp = 0;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y]=temp;
        return arr;
    }

    //reverse an array - > Can be done with built in function Arrays.reverse()
    public static int[] reverseArray(int[]arr , int si , int ei){
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

    //find index - striver main function's side function
    public static int findIdx(int[]arr){
        int idx = -1;
        int n = arr.length;
        for(int i = n-2 ; i >= 0 ; i--){
            if(arr[i]<arr[i+1]){
                idx = arr[i];
                break;
            }
        }
        return idx;
    }

    //strivers solution
    public static int[] striversSolution(int[]arr){
        int idx = findIdx(arr); // find the dip in the array
        int n = arr.length;
        if(idx==-1){
           return reverseArray(arr,0,n-1); // If there is no dip that means the array is already at its last permutation so 
        } // just reverse it and bring it to the first permutation as the final answer --> Base Case.
        for(int i = n-1 ; i >=idx ; i--){
            if(arr[i]>arr[idx]){
                swap(idx, i, arr);
                break;
            }
        }
        reverseArray(arr,n-1,idx+1);

        return arr;
    }

    //Main Method
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5};
        System.out.println(findIdx(arr));       
        
    }
}
