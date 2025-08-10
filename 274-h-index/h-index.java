public class Solution {
    public int hIndex(int[] citations) {
        // Sort the citations in descending order
        Arrays.sort(citations);
        reverse(citations);
        
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1) {
                h = i + 1;
            } else {
                break;
            }
        }
        return h;
    }
    
    private void reverse(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}