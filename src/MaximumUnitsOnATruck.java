import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n = boxTypes.length;

        Arrays.sort(boxTypes, (a, b) -> a[1] - b[1]);

        int boxes = 0;
        for(int i = n-1; i>=0; i--){
            int quantity = Math.min(truckSize, boxTypes[i][0]);
            truckSize-=quantity;
            boxes+=(quantity * boxTypes[i][1]);

            if(truckSize == 0){
                return boxes;
            }
        }

        return boxes;
    }
}