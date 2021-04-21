import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FDtest3 {


    public static List<Integer> oddNumbers(int l, int r) {

        List<Integer> al = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                al.add(i);
            }
        }


        return al;
    }

    public static void main(String[] args) throws IOException {

        //mezhdu
        System.out.println(oddNumbers(2, 5));

        String s1 = "abc";
        String s2 = "def";
        String s3 = s1.concat(s2.toUpperCase());
        System.out.println(s1 + s2 + s3);

        boolean a = false;
        if (a = true) System.out.println("Hello");
        else System.out.println("Goodbye");

        String first = "A String";
        String second = "A" + " " + "String";
        System.out.println(first == second);
        System.out.println(first.equals(second));


    }

}



