
public class Murex1 {


    static String toPalindrome(String almostPalindrome) {

        int length = almostPalindrome.length();
        int half = almostPalindrome.length() / 2;

        StringBuilder toPalindrome = new StringBuilder(almostPalindrome);


        for (int i = 0; i < half; i++) {

            if (almostPalindrome.charAt(i) != almostPalindrome.charAt(length - 1 - i)) {
                toPalindrome.setCharAt(i, almostPalindrome.charAt(length - 1 - i));
            }

        }


        return String.valueOf(toPalindrome);
    }

    public static void main(String[] args) {

        System.out.println(toPalindrome("abxccba"));
    }

}
