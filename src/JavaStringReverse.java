public class JavaStringReverse {

    public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		String A = sc.next();

        String A = "madams";
        int len = A.length();
        int half = len / 2;
        boolean isPalindrome = true;

        for (int i = 0; i < half; i++) {
            if (A.charAt(i) == A.charAt(len - i - 1)) {
            } else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
