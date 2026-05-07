public class Multiples {
    static void main() {
        int count = 0;

        for(int i = 1; i < 1000; i ++){
            if(i % 3 == 0 || i % 5 == 0){
                count ++;
            }
        }

        System.out.println(count);
        System.out.println(999/3 + 999/5 - 999/15);
    }
}
