import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {

        // More than 1440 times means duplicate time is guaranteed
        if (timePoints.size() > 1440) {
            return 0;
        }

        List<Integer> minutes = new ArrayList<>();

        // Convert HH:MM into total minutes
        for (String time : timePoints) {
            int hours = Integer.parseInt(time.substring(0, 2));
            int mins = Integer.parseInt(time.substring(3, 5));

            minutes.add(hours * 60 + mins);
        }

        // Sort the times
        Collections.sort(minutes);

        int minDiff = Integer.MAX_VALUE;

        // Compare adjacent times
        for (int i = 1; i < minutes.size(); i++) {
            minDiff = Math.min(minDiff, minutes.get(i) - minutes.get(i - 1));
        }

        // Check circular difference: last time -> first time
        int circularDiff = 1440 - minutes.get(minutes.size() - 1)
                         + minutes.get(0);

        minDiff = Math.min(minDiff, circularDiff);

        return minDiff;
    }
}