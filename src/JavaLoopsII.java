import java.util.Scanner;

class JavaLoopsII {
    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


            int current = 0;
            int total = 0;
            for (int j = 0; j < n; j++) {
                int p = (int) Math.pow(2, j);
                current = current + p;
                total = a + b * current;
                System.out.print(total + " ");
            }


            System.out.println();

        }
        in.close();

//		int a = 0;
//		int b = 2;
//		int n = 10;


    }
}