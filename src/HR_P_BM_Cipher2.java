public class HR_P_BM_Cipher2 {
    // https://www.hackerrank.com/challenges/cipher/problem
    // https://wf9a5m75.github.io/HackerRank/algorithm/bit-manipulation/cipher/whiteboard.jpg
    // https://www.hackerrank.com/challenges/cipher/forum/comments/705850

    static String cipher(int k, String s) {

        int n = s.length();
        byte[] buffer = new byte[n - k + 1];
        char[] results = new char[n - k + 1];
        char[] bits = s.toCharArray();

        byte dp = 0;
        int j;
        for (int i = n - 1; i >= k - 1; i--) {
            bits[i] -= '0';
            j = i - k + 1;

            buffer[j] = (byte) (dp ^ bits[i]);
            dp = (byte) (dp ^ buffer[j]);
            if (i <= n - k) {
                dp = (byte) (dp ^ buffer[i]);
            }
            results[j] = (char) (buffer[j] + '0');
        }
        return new String(results);
    }


    public static void main(String[] args) {

//        String result = cipher(2, "11100"); // 100 answer
        String result = cipher(4, "1110100110"); // 1001010 answer
        System.out.println(result);


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