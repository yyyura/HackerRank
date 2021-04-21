public class GoogleMinions1 {

    public static int[] solution(int[] data, int n) {

        java.util.LinkedHashMap<Integer, Integer> lhm = new java.util.LinkedHashMap<>();

        for (int i = 0; i < data.length; i++) {
            int key = data[i];
            if (lhm.containsKey(key)) {
                int times = lhm.get(key);
                times++;
                lhm.put(key, times);
            }
            // first occurrence in the map
            else {
                lhm.put(data[i], 1);
            }
        }
        System.out.println(lhm.toString());

        // Get the iterator over the Map
        java.util.Iterator<java.util.Map.Entry<Integer, Integer>> iterator = lhm.entrySet().iterator();
        // Iterate over the map
        while (iterator.hasNext()) {
            // Get the entry at this iteration
            java.util.Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() > n) {
                iterator.remove();
            }
        }
        System.out.println(lhm.toString());

        int[] resultArr = new int[lhm.size()];
        int i = 0;
        java.util.Iterator<java.util.Map.Entry<Integer, Integer>> iterator2 = lhm.entrySet().iterator();
        // Iterate over the map
        while (iterator2.hasNext()) {
            // Get the entry at this iteration
            java.util.Map.Entry<Integer, Integer> entry = iterator2.next();
            resultArr[i] = entry.getKey();
            i++;
        }

        return resultArr;
    }


    public static void main(String[] args) {

//        int[] intArr1 = {10, 10, 15, 10, 7};
//        int[] intArr1 = {1, 2, 3};
//        int[] intArr1 = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int[] intArr1 = {0, 2, 2, 1, 1, 3, 3, 3, 4, 5, 5};
        //[0, 2, 2, 1, 1, 3, 3, 3, 4, 5, 5], 2

        System.out.println(java.util.Arrays.toString(solution(intArr1, 2)));
    }
}
