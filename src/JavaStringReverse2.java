public class JavaStringReverse2 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		String A = sc.next();

		String A = "madam";
		int len = A.length();
		int half = len / 2;
		boolean isPalindrome = true;

		System.out.println(
				A.equals(
						new StringBuilder(A).reverse().toString())
				? "Yes"
						: "No");
	}
}
