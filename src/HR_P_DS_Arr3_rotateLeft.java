import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HR_P_DS_Arr3_rotateLeft {
    // https://www.hackerrank.com/challenges/array-left-rotation/problem

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        LinkedList<Integer> ll = new LinkedList<>();

        for (Integer e : arr) {
            ll.add(e);
        }

        for (int i = 0; i < d; i++) {
            ll.addLast(ll.pollFirst());
        }

        return ll;
    }

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(al.toString());
        al = rotateLeft(2, al);
        System.out.println(al.toString());

    }
}
