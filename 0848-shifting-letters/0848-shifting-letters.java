class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        char[] arr = s.toCharArray();

        long total = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {

            total = (total + shifts[i]) % 26;

            int pos = arr[i] - 'a';

            pos = (int)((pos + total) % 26);

            arr[i] = (char)(pos + 'a');
        }

        return new String(arr);
    }
}