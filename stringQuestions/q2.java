package stringQuestions;

public class q2 {

    //Record checker method
    public static boolean recordChekcer(String str){

        boolean ans = true;
        int count = 0;

        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == 'A'){ //absent condition
                count++;
                if(count>2){
                    return false;
                }
            }           
        }

        for(int i = 0 ; i < str.length()-2; i++){ //late condition 
            if(str.charAt(i) == 'L' && str.charAt(i+1) == 'L' && str.charAt(i+2)=='L'){
                return false;
            }
        }

        return ans;
    }

    //Main method
    public static void main(String[]args){
        String str = "PPALLL";
        System.out.println(recordChekcer(str));
    }
}
