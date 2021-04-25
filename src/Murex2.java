import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Murex2 {

    static String evaluateDicesRoll(List<Integer> maximumValues, List<Integer> diceRolls) {

        List<Integer> score = new ArrayList<>();
        String output;
//        System.out.println(maximumValues.toString());
//        System.out.println(diceRolls.toString());

        boolean isMax = false;
        int length = maximumValues.size();

        for (int i = 0; i < length; i++) {

            int max = maximumValues.get(i);
            int halfMax = maximumValues.get(i) / 2;
            System.out.println("halfMax " + halfMax);

            if (diceRolls.get(i) == maximumValues.get(i)) {
                isMax = true;
            }

            if (diceRolls.get(i) == 1) {
                score.add(-1);
            } else if (diceRolls.get(i) < halfMax) {
                score.add(0);
            } else if (diceRolls.get(i) < max) {
                score.add(1);
            } else if (diceRolls.get(i) == max) {
                score.add(2);
            }

            System.out.println(score.toString());

        }

        int sum = 0;
        for (Integer e : score) {
            sum += e;
        }
        System.out.println(sum);

        if (sum == 0 && !isMax) {
            return "CRITICAL_FAILURE";
        } else if (sum == 0 && isMax) {
            return "FAILURE";
        } else if (sum < 5) {
            return "VICTORY";
        } else if (sum >= 5) {
            return "CRITICAL_VICTORY";

        }

        return "";
    }

    public static void main(String[] args) {

//        List<Integer> maximumValues = new ArrayList<>(Arrays.asList(6, 6, 6, 10));
        List<Integer> maximumValues = new ArrayList<>(Arrays.asList(10, 10, 10, 10));
//        List<Integer> diceRolls = new ArrayList<>(Arrays.asList(1, 5, 3, 9));
        List<Integer> diceRolls = new ArrayList<>(Arrays.asList(8, 5, 3, 9));

        System.out.println(evaluateDicesRoll(maximumValues, diceRolls));


    }

}
