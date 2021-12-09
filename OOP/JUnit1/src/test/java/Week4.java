public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a <= b) {
            return b;
        }
        else {
            return a;
        }
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double height1 = height * height;
        double BMI = weight / height1;
        double sBMI = Math.round(BMI*10.0)/10.0 ;
        if (sBMI < 18.5) {
            return "Thiếu cân";
        } else if (18.5 <= sBMI && sBMI <= 22.9) {
            return "Bình thường";
        } else if (23 <= sBMI && sBMI <= 24.9) {
            return "Thừa cân";
        }
        return "Béo phì";

    }
}