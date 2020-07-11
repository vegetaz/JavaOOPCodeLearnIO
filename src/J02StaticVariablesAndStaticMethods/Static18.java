package J02StaticVariablesAndStaticMethods;
/*
        ArrayCalculator18
+maxOfArray(arr: int[]): int
+maxOfArray(arr: double[]): double
+minOfArray(arr: int[]): int
+minOfArray(arr: double[]): double

ArrayCalculator18 là lớp không có thuộc tính.
maxOfArray(arr: int[]) và maxOfArray(arr: double[]) là hai phương thức static được nạp chồng, hai phương thức này trả về giá trị lớn nhất trong mảng arr.
minOfArray(arr: int[]) và minOfArray(arr: double[]) là hai phương thức static được nạp chồng, hai phương thức này trả về giá trị nhỏ nhất trong mảng arr.
*/
public class Static18 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 3, 4, 2 };
        double[] arr2 = new double[] { 1.3, 4.2, 6.7 };
        System.out.println(ArrayCalculator18.minOfArray(arr1));
        System.out.println(ArrayCalculator18.minOfArray(arr2));
        System.out.println(ArrayCalculator18.maxOfArray(arr1));
        System.out.println(ArrayCalculator18.maxOfArray(arr2));
    }
}

class ArrayCalculator18 {
    public static int maxOfArray(int arr[]) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static double maxOfArray(double arr[]) {
        double maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static int minOfArray(int arr[]) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static double minOfArray(double arr[]) {
        double minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
