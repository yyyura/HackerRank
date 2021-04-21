import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FDtest4 {


    public static List<Integer> rodOffcut(List<Integer> lengths) {


        List<Integer> alOfArrSizes = new ArrayList<>();


        List<Integer> al = new ArrayList<>();
        al = lengths;
        System.out.println(al.toString());

        alOfArrSizes.add(al.size());
        System.out.println("alOfArrSizes " + alOfArrSizes.toString());

        do {
            //loop
            int minIndex = lengths.indexOf(java.util.Collections.min(lengths));
            System.out.print("index " + minIndex);
            System.out.println(" min lenght " + lengths.get(minIndex));
            Integer minElement = lengths.get(minIndex);

            while(al.remove(minElement)) {}

//            al.clear(minElement);
//            al.remove(minElement);

//            do {
//                al.remove(minElement);
////                al.remove(minIndex);
//            } while (al.contains(minElement));
            System.out.println(al.toString());

            alOfArrSizes.add(al.size());
            System.out.println("alOfArrSizes " + alOfArrSizes.toString());

            for (int i = 0; i < al.size(); i++) {
                al.set(i, al.get(i) - minElement);
            }

            System.out.println(al.toString());

            ///loop

//            System.out.println(al.size());

        } while (al.size() > 1);


        return alOfArrSizes;
    }

    public static void main(String[] args) throws IOException {

//        int[] lengths = {5, 4, 4, 2, 2, 8};
        List<Integer> al = new ArrayList<>();

//        al.add(8);
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        al.add(4);
//        al.add(3);
//        al.add(3);
//        al.add(2);
//        al.add(1);


        al.add(5);
        al.add(4);
        al.add(4);
        al.add(2);
        al.add(2);
        al.add(8);

//        System.out.println(lengths.toString());
        rodOffcut(al);


    }

}



