package arsenkarapetyan.lesson_4;

import java.util.Arrays;

public class App_341 {

    public static void main(String[] args) {

        int[] numbers = {-4, 52, -125, 3, 1, -77, 0, 42, -86, 4, 2562, -125, 4};
        System.out.println(Arrays.toString(numbers));
        int count = 0;
        int value =0;
        boolean t;

        for (int i = 0; i < numbers.length; i++) {
            t = true;
            value = numbers[i];
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[k] == value && i != k){
                    t = false;
                }
            }
            if (t==true){
                count++;
            }

        }
        System.out.println("Chkrknvogh tarreri qanake havasar e: " + count);
    }
}
