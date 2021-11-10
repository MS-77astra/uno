public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");

        long summa = summa(9, 6);
        System.out.println(summa);
        long minsumma = minus(9, 6);
        System.out.println(minsumma);
        long minsumm = multiply(9, 6);
        System.out.println(minsumm);
        long minsum = division(42, 7);
        System.out.println(minsum);
    }

    public static int summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static int minus(int arg1, int arg2) {
        int result = arg1 - arg2;
        return result;
    }

    public static int multiply(int arg1, int arg2) {
        int result = arg1 * arg2;
        return result;
    }

    public static int division(int arg1, int arg2) {
        int result = arg1 / arg2;
        return result;
    }
}