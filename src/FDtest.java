import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FDtest {


    public static String findNumber(List<Integer> arr, int k) {

        if (arr.contains(k)){
            return "YES";
        }


        return "NO";
    }

    public static void main(String[] args) throws IOException {

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        System.out.println(arr1.toString());

        int toFind = 1;
        String result = FDtest.findNumber(arr1, toFind);
        System.out.println(result);


    }

}



