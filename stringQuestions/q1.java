package stringQuestions;
public class q1{

    //reverse string
    public static void reverseString(StringBuilder str){
        System.out.print("Reverse of "+str+" is: ");
        for(int i = 0 ; i < str.length(); i++){
            int front = i;
            int end = str.length()-1-i;

            char frontChar = str.charAt(front);
            char endChar = str.charAt(end);

            str.setCharAt(front, endChar);
            str.setCharAt(end, frontChar);            

        }
        System.out.print(str);
        System.out.println();
    }

    //main method
    public static void main(String[]args){
        StringBuilder str = new StringBuilder("helloNamita");
        reverseString(str);
    }
}