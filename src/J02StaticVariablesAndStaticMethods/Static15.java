package J02StaticVariablesAndStaticMethods;

public class Static15 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.abs(-2));
        System.out.println(Math.add(2, 3));
        System.out.println(Math.subtract(2, 3));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.max(2, 3));
        System.out.println(Math.pow(2, 3));
    }
}

class Math {
    // PI là biến static có giá trị mặc định là 3.14
    public static double PI = 3.14;
    public static int abs(int x) {
        // Hàm trả về giá trị tuyệt đối của x
        return x < 0 ? -x : x;
    }
    public static int add(int x, int y) {
        // Hàm trả về tổng của 2 số x và y
        return x + y;
    }
    public static int subtract(int x, int y) {
        // Hàm trả về hiệu của 2 số x và y
        return x - y;
    }
    public static int min(int x, int y) {
        // Hàm trả về giá trị nhỏ nhất trong 2 số x và y
        // return java.lang.Math.min(x, y);
        return x < y ? x : y;
    }
    public static int max(int x, int y) {
        // Hàm trả về giá trị lớn nhất trong 2 số x và y
        //return java.lang.Math.max(x, y);
        return x > y ? x : y;
    }
    public static int pow(int x, int y) {
        // Hàm trả về giá trị của x mũ y
        int power = 1;
        for (int i = 0; i < y; i++) {
            power = x * power; // power *= x;
        }
        return power;
    }
}
