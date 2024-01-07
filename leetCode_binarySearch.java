public class leetCode_binarySearch{

    public static int soln(int[]arr , int k){
        int missingCount = 0;
        int idx = 0;
        int num = 1;

        while(missingCount < k){
            if(idx < arr.length && arr[idx]==num){
                idx++;
            }else{
                missingCount++;
            }
            if(missingCount == k){
                return num;
            }
            num++;
        }

        return num + k - missingCount - 1;
    }

    public static void main(String[]args){
        int[] arr ={2,3,5,6,11};
        int ans = soln(arr,4);
        System.out.println(ans);
    }
}