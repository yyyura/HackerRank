import java.util.Arrays;

public class HR_P_DS_Arr1 {

    //Reverse an array of integers.
    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {

        //{1, 2, 3}
        int length = a.length; //3
        int half = length / 2;

        for (int i = 0; i < half; i++) {
            int front = a[i];
            int backIndex = length - i - 1; //3-0-1=index 2
            a[i] = a[backIndex];
            a[backIndex] = front;
        }
//        System.out.println(Arrays.toString(a));
        return a;
    }

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3};

        System.out.println(reverseArray(myIntArray));

    }

}
