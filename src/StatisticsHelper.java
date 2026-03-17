import java.util.Arrays;

public class StatisticsHelper {

    public static double calculateAverage(int[] values) {
        if (values == null || values.length == 0) {
            return 0.0;
        }

        return Arrays.stream(values).average().orElse(0.0);
    }
    public static int calculateMax(int[] values) {
        int max = values[0];
        for (int val : values) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}