public class pascal_triangle{

    //Factorial - recursive
    public static int fact(int x){

        if(x==0){
            return 1;
        }

        int ans = x * fact(x-1);
        return ans;
    }

    // PnC
    public static int pnc(int n , int r){

        int diff = n-r;
        int denom1 = fact(diff);
        int denom2 = fact(r);
        int num = fact(n);

        int combination = ((num)/((denom1) * (denom2)));
        return combination;

    }

    //Pascal Triangle for n rows - BRUTE FOCE -> O(n2)
    public static void pTriangleAllRows(int n){

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <=i ; j++){
                System.out.print(pnc(i, j) + " ");
            }
            System.out.println();
        }
    }

    //Just print the Pascal's triangle line for a given row - BRUTE FORCE - O(line) + O(n)
    public static void pTriangleOneRow(int line){

        for(int i = 0 ; i < line ; i++){
            System.out.print(pnc(line-1, i)+" ");
        }
    }

    //Pascal's triangle element for given row and column - BRUTE FORCE
    public static void pTriangleElement(int n , int k){
        if(n>k){
            System.out.println(pnc(n-1, k-1));
        }else{
            System.out.println(pnc(k-1, n-1));
        }
    }

    public static void main(String[]args){
        pTriangleAllRows(5);
        pTriangleElement(3, 2);
    }
}
