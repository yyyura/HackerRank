//import java.util.TreeSet;

public class FirstDerivatives {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.TreeSet<String> ts1 = new java.util.TreeSet<>();

        for (int i = 0; i < s.length() - 3; i++) {
            ts1.add(s.substring(i, i + 3));
        }

        System.out.println(ts1.toString());

        smallest = ts1.first();
        largest = ts1.last();

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

        String s = "welcometojava";
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));
    }
}
