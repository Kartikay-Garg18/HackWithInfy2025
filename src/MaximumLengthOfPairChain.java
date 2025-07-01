import java.util.Arrays;

public class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
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
