package g0101_0200.s0165_compare_version_numbers;

public class Solution {

    public int compareVersion(String version1, String version2) {
        // acquire first number
        int numA = 0;
        int i;
        for (i = 0; i < version1.length(); i++) {
            char c = version1.charAt(i);
            if (c == '.') {
                break;
            } else {
                numA = numA * 10 + (c - 48);
            }
        }

        // acquire second number
        int numB = 0;
        int j;
        for (j = 0; j < version2.length(); j++) {
            char c = version2.charAt(j);
            if (c == '.') {
                break;
            } else {
                numB = numB * 10 + (c - 48);
            }
        }

        // compare
        if (numA > numB) {
            return 1;
        } else if (numA < numB) {
            return -1;
        } else { // equal
            String v1 = "";
            String v2 = "";

            if (i != version1.length()) {
                v1 = version1.substring(i + 1);
            }

            if (j != version2.length()) {
                v2 = version2.substring(j + 1);
            }

            // if both versions end here, they are equal
            if (v1.equals("") && v2.equals("")) {
                return 0;
            } else {
                return compareVersion(v1, v2);
            }
        }
    }
}
