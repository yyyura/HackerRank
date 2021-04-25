
public class AA_JavaSubstringComparisons2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z";
        String largest = "";
        String current = "";

        for (int i = 0; i < k - 1; i++) {
            smallest += "z";
        }
        System.out.println(smallest);

        for (int i = 0; i < s.length() - k + 1; i++) {
            current = s.substring(i, i + k);
//            System.out.println(current);
            if (current.compareTo(largest) > 0) {
                largest = current;
//                System.out.println("largest " + largest);
            } else if (current.compareTo(smallest) < 0) {
                smallest = current;
//                System.out.println("smallest " + smallest);
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

//        String s = "welcometojava";
        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int k = 30;

          //DFHDSFHsdlfhsdlfLDFHSDLFHsdlfh
        //ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl

        //sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs
        //sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs

        System.out.println(getSmallestAndLargest(s, k));
    }
}
