
public class GoogleMinions1b {

    public static int[] solution(int[] data, int n) {


        java.util.Map<Integer, Integer> hm = new java.util.HashMap<>();

        for (int i = 0; i < data.length; i++) {
            int key = data[i];
            if (hm.containsKey(key)) {
                int times = hm.get(key);
                times++;
                hm.put(key, times);
            }
            // first occurrence in the map
            else {
                hm.put(data[i], 1);
            }
        }
//        System.out.println(hm.toString());


        // Get the iterator over the Map
        java.util.Iterator<java.util.Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            // Get the entry at this iteration
            java.util.Map.Entry<Integer, Integer> entry = iterator.next();
            // map of elements to remove
            if (entry.getValue() <= n) {
                iterator.remove();
            }
        }
//        System.out.println("to remove: " + hm.toString());


        java.util.List<Integer> al = new java.util.ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            if (!hm.containsKey(data[i])) {
                al.add(data[i]);
            }
        }
//        System.out.println(al.toString());

        int[] resultArr = new int[al.size()];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = al.get(i).intValue();
        }

        return resultArr;
    }


    public static void main(String[] args) {

        int[] intArr1 = {5, 10, 15, 10, 7};
//        int[] intArr1 = {1, 2, 3};
//        int[] intArr1 = {1, 2, 2, 3, 3, 3, 4, 5, 5};
//        int[] intArr1 = {0, 2, 2, 1, 1, 3, 3, 3, 4, 5, 5};
        //[0, 2, 2, 1, 1, 3, 3, 3, 4, 5, 5], 2

        System.out.println(java.util.Arrays.toString(solution(intArr1, 1)));
    }
}
