import java.util.Arrays;

public class ActivitySelection {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        int[][] pairs = new int[n][2];
        for(int i=0; i<n; i++){
            pairs[i][0] = start[i];
            pairs[i][1] = finish[i];
        }
        Arrays.sort(pairs, (a, b) -> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            }

            return a[1] - b[1];
        });

        int end = pairs[0][1];
        int len = 1;

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > end){
                len++;
                end = pairs[i][1];
            }
        }
        return len;
    }
}
