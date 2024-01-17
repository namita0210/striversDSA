package binarySearchQuestions;

public class q1 {
    public static int singleElement(int[]arr){
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int mid = left + (right-left)/2 ;

            if(mid % 2 == 1){
                mid --;
            }
            
            if(arr[mid] == arr[mid+1]){
                left = mid+2;
            }else{
                right = mid;
            }
        }
        return arr[left];
    }

    

    public static void main(String[]args){
        int[]arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(arr));
    }
    
}
