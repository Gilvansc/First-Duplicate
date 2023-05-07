package firstDuplicate;

import java.lang.reflect.Array;

public class main {
    private static int[] a = {2,3,2,4,1};
    public static void main(String[] args) {
        System.out.println(getFirstDuplicate(a));
    }
    private static int getFirstDuplicate(int[] a){
        for (int i = 0; i < a.length; i++) {
            int firstNumber= Array.getInt(i);
            return i;
        }
        return -1;
    }
}
