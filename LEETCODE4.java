import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int n = num1.length;
        int m = num2.length;

        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = num1[i];
        }
        for (int j = 0; j < m; j++) { // Corrected loop condition here
            merged[k++] = num2[j];
        }

        Arrays.sort(merged);

        int total = merged.length;

        if (total % 2 == 1) {
            return (double) merged[total / 2];
        } else {
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];

            return ((double) middle1 + (double) middle2) / 2.0;
        }

    }
}
