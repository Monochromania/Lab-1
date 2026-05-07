public class Reduce {
    public static void main(){
        System.out.println(getReduction(100));
    }

    public static int getReduction(int n){
        int count = 0;
        while(n != 0){
            //Even
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n -= 1;
            }
            count ++;
        }
        return count;
    }
}
