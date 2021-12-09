import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        int a = 1;
        int b = 6;
        int max = Week4.max2Int(a, b);
        assertEquals(6, max);
    }


    @Test
    public void testMax2Int2() {
        int a = 9;
        int b = 20;
        int max = Week4.max2Int(a, b);
        assertEquals(20, max);
    }

    @Test
    public void testMax2Int3() {
        int a = 10;
        int b = 20;
        int max = Week4.max2Int(a, b);
        assertEquals(20, max);
    }

    @Test
    public void testMax2Int4() {
        int a = 11;
        int b = 20;
        int max = Week4.max2Int(a, b);
        assertEquals(20, max);
    }

    @Test
    public void testMax2Int5() {
        int a = 12;
        int b = 20;
        int max = Week4.max2Int(a, b);
        assertEquals(20, max);
    }

    @Test
    public void testMinArray1() {
        int[] arr = {1, 2, 3, 4, 5};
        int min = Week4.minArray(arr);
        assertEquals(1, min);
    }

    @Test
    public void testMinArray2() {
        int[] arr = {1, 2, 3, 4, 6};
        int min = Week4.minArray(arr);
        assertEquals(1, min);
    }

    @Test
    public void testMinArray3() {
        int[] arr = {1, 2, 3, 4, 7};
        int min = Week4.minArray(arr);
        assertEquals(1, min);
    }

    @Test
    public void testMinArray4() {
        int[] arr = {1, 2, 3, 4, 8};
        int min = Week4.minArray(arr);
        assertEquals(1, min);
    }

    @Test
    public void testMinArray5() {
        int[] arr = {1, 2, 3, 4, 9};
        int min = Week4.minArray(arr);
        assertEquals(1, min);
    }

    @Test
    public void testCalculateBMI1() {
        double weight = 40;
        double height = 1;
        String BMI = Week4.calculateBMI(weight, height);
        assertEquals("Béo phì", BMI);

    }

    @Test
    public void testCalculateBMI2() {
        double weight = 30;
        double height = 1;
        String BMI = Week4.calculateBMI(weight, height);
        assertEquals("Béo phì", BMI);
    }

    @Test
    public void testCalculateBMI3() {
        double weight = 20;
        double height = 1;
        String BMI = Week4.calculateBMI(weight, height);
        assertEquals("Bình thường", BMI);
    }

    @Test
    public void testCalculateBMI4() {
        double weight = 10;
        double height = 1;
        String BMI = Week4.calculateBMI(weight, height);
        assertEquals("Thiếu cân", BMI);
    }

    @Test
    public void testCalculateBMI5() {
        double weight = 24;
        double height = 1;
        String BMI = Week4.calculateBMI(weight, height);
        assertEquals("Thừa cân", BMI);
    }

}
