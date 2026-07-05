class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals based on starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // Step 2: Add the first interval
        result.add(intervals[0]);

        // Step 3: Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int[] last = result.get(result.size() - 1);

            // Overlapping interval
            if (last[1] >= intervals[i][0]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            }
            // Non-overlapping interval
            else {
                result.add(intervals[i]);
            }
        }

        // Convert List<int[]> to int[][]
        return result.toArray(new int[result.size()][]);
    }
}