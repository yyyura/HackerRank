import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FDtest5 {


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


    }

}



