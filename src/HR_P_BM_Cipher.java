import java.util.Arrays;

public class HR_P_BM_Cipher {
    // https://www.hackerrank.com/challenges/cipher/problem


    public static String cipher(int times, String cipherString) {

        int cipherLength = cipherString.length();
        int answerLength = cipherLength - times; // answerLength(3) = cipherString(5) - timesShifted(2)
        int bits = answerLength - 1; // 1xx -> 3bits but xx -> 2bits

        int variants = (int) Math.pow(2, bits);
        System.out.println(variants + " variants");


//        for (int v = 0; v < variants; v++) {
//
//        }


        return "originalText";
    }


    // Function to print the output
    static void printTheArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to generate all binary strings
    static void generateAllBinaryStrings(int n, int arr[], int i) {
        if (i == n) {
            printTheArray(arr, n);
            return;
        }

        // First assign "0" at i-th position
        // and try for all other permutations
        // for remaining positions
        arr[i] = 0;
        generateAllBinaryStrings(n, arr, i + 1);

        // And then assign "1" at ith position
        // and try for all other permutations
        // for remaining positions
        arr[i] = 1;
        generateAllBinaryStrings(n, arr, i + 1);
    }


    public static void main(String[] args) {

        int n = 2;
        int[] arr = new int[n];

        // Print all binary strings
        generateAllBinaryStrings(n, arr, 0);


        String result = cipher(2, "11100"); // 100 answer
//        String result = cipher(7, "1110100110"); // 1001010 answer

//        System.out.println(1 ^ 0 ^ 0 ^ 0);
//        System.out.println(1 ^ 0 ^ 0 ^ 1);
//        System.out.println(1 ^ 1 ^ 1 ^ 0);

//        System.out.println(result);

    }

}


/*
        input:
        n:7 k:4
        s:1110100110 => length=10
        ---
        answer: 1001010 => length n=7

        n: length of the original decoded string
        k: times - an integer that represents the number of times the string is shifted
        s: an encoded string of binary digits

        1001010 -> answer shifted 4 times
        o1001010
        oo1001010
        ooo1001010
        ---------- XOR(^) -> должны быть разные, тогда TRUE (1^0) = 1
        1110100110 -> s
        */










/*static char[] arr = new char[2];
    static void binary(int n) {
        if (n < 1)
            System.out.printf("%s\n", Arrays.toString(arr));
        else {
            arr[n - 1] = '0';
            binary(n - 1);
            arr[n - 1] = '1';
            binary(n - 1);
        }
    }*/