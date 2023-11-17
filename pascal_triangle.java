public class pascal_triangle{

    //Factorial - recursive
    public static int fact(int x){

        if(x==0){
            return 1;
        }

        int ans = x * fact(x-1);
        return ans;
    }

    // PnC - Recursive Calls
    public static int pnc(int n , int r){

        int diff = n-r;
        int denom1 = fact(diff);
        int denom2 = fact(r);
        int num = fact(n);

        int combination = ((num)/((denom1) * (denom2)));
        return combination;

    }

    //Pascal Triangle for n rows - BRUTE FOCE -> O(n2)
    public static void fullTriangle(int n){

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <=i ; j++){
                System.out.print(pnc(i, j) + " ");
            }
            System.out.println();
        }
    }

    //Just print the Pascal's triangle line for a given row - BRUTE FORCE - O(line) + O(n)
    public static void oneLine(int line){

        for(int i = 0 ; i < line ; i++){
            System.out.print(pnc(line-1, i)+" ");
        }
    }

    //Pascal's triangle element for given row and column - BRUTE FORCE
    public static void oneElement(int n , int k){
        if(n>k){
            System.out.println(pnc(n-1, k-1));
        }else{
            System.out.println(pnc(k-1, n-1));
        }
    }

    //PnC - Iterative - better
    public static int pncOptimized(int n , int r){
        int res = 1;
        for(int i = 0 ; i < r ; i++){
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    }

    //print one element of pascal triangle - optimal
    public static void oneElementOptimized(int i , int j){
        System.out.println(pncOptimized(i-1, j-1));
    }

    //print one line of pascal triangle - optimal
    public static void oneLineOptimized(int line){
        int res = 1;
        System.out.print(res+" ");
        for(int i = 1 ; i < line ; i++){
            res = res * (line-i);
            res = res/i;
            System.out.print(res+" ");
        }
    }

    //Print pascal triangle upto the given number of rows
    public static void fullTriangleOptimized(int n){

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <=i ; j++){
                System.out.print(pncOptimized(i, j)+" ");
            }
            System.out.println();
        }
    }

    //Main Method
    public static void main(String[]args){
        fullTriangleOptimized(5);
      
    }
}
