public class Multiples {
    static int main(int limit, int a, int b) {
        int nums = 0;

        for(int i = 1; i < limit; i ++){
            if(i % a == 0 || i % b == 0){
                nums ++;
            }
        }
        return nums;
    }

    public static int main(){
       return main(1000, 3, 5);
    }
}
