import java.util.Arrays;

public class HR_P_BM_Cipher3 {
    // https://www.hackerrank.com/challenges/cipher/problem

    static String cipher(int shiftTimes, String cipherStr) {

        // "11011"
        System.out.println(cipherStr);
        int length = cipherStr.length() - shiftTimes;

        // truncate 2 front elements - not needed
        int[] old = new int[length];// size 3 [0,1,2]
        // [0,1,1]
        for (int i = 0; i < length; i++) {
            old[i] = Character.getNumericValue(cipherStr.charAt(length - 1 + i));
        }
        System.out.println(Arrays.toString(old));

        int[] decrypted = new int[cipherStr.length()]; //[5] - last two [x,x,x,0,0]
        System.out.println(Arrays.toString(decrypted));


        // 2,1,0
//        for (int i = 0; i < length; i++) {
        for (int i = (length - 1); i >= 0; i--) {
            System.out.println("--->i " + i);

            System.out.print("old " + old[i] + " ^ " + decrypted[i + 1]);
            decrypted[i] = old[i] ^ decrypted[i + 1];
            System.out.println(" = " + decrypted[i]);
            for (int j = 2; j < length; j++) { // j= 2
                System.out.print(decrypted[i] + " ^ " + decrypted[i + j]);
                decrypted[i] = decrypted[i] ^ decrypted[i + j];
                System.out.println(" = " + decrypted[i]);
            }
            System.out.println("decrypted " + decrypted[i]);
        }

        System.out.println(Arrays.toString(decrypted));


        return "answer";
    }


    public static void main(String[] args) {


//        String result = cipher(2, "11011"); // 101 answer
        String result = cipher(3, "1110100110"); // 1001010 answer
        System.out.println(result);

//        System.out.println(0 ^ 0 ^ 1);

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