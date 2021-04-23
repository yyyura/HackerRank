public class HR_P_DS_Arr2_hourglassSum {

    static int hourglassSum(int[][] arr) {

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                // sum of hourGlass
                int sum =   (arr[i][j] + arr[i][j + 1] + arr[i][j + 2])
                                       + (arr[i + 1][j + 1]) +
                        (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);

                max_sum = Math.max(max_sum, sum);

            }
        }

        return max_sum;
    }

    public static void main(String[] args) {

        int[][] myIntArray = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println(hourglassSum(myIntArray));


    }
}
