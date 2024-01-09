// Q: Given a non empty array of integers - num.
// In num, all integers occur twice except one integer which occurs only one time.
// You have to find that one integer in linear time complexity. 
//For example: Input: [4,1,2,1,2] Output: 4
package arrayQuestions;
public class q1{

    public static int singleNum(int[] nums){
        int result = 0;
        for(int num:nums){
            result = result ^ num;
            System.out.println("iteration: "+num+"  result: "+result);
        }
        return result;
    }

    public static void main(String[]args){
        int [] arr = {4,1,2,1,2};
        System.out.println(singleNum(arr));
    }
}