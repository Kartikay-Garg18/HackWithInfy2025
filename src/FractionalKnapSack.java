import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        double ans = 0;
        int n = values.length;
        double[][] ratio = new double[n][3];
        for(int i=0; i<n; i++){
            ratio[i][0] = values[i];
            ratio[i][1] = weights[i];
            ratio[i][2] = ratio[i][0] / ratio[i][1];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[2]));

        for(int i=n-1; i>=0; i--){
            double pick = Math.min(W, ratio[i][1]);
            ans+=((pick * ratio[i][0])/ratio[i][1]);
            W -= (int)(pick);
        }

        return ans;
    }
}
