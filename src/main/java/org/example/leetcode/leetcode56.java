package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode56 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println("Sorted Intervals: " + Arrays.deepToString(intervals));

        List<int[]> merged = new ArrayList<>();
        int[] last = intervals[0];

        for (int[] interval : intervals) {
            if (merged.isEmpty()) {
                merged.add(interval);
            }
            else {
                if (last[1] >= interval[0]) {
                    int[] temp = merged.removeLast();
                    temp[1] = Math.max(interval[1], temp[1]);
                    merged.add(temp);
                    last=temp;
                } else {
                    last=interval;
                    merged.add(interval);
                }
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] merged = new int[][]{{3, 3}, {4, 6}, {5, 7}};
        System.out.println(Arrays.deepToString(merge(merged)));
    }

}
