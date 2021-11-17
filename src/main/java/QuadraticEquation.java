public class QuadraticEquation {
    public static void main(String[] args) {
        // a * x^2 + b * x + c = 0
        int a = 2;
        int b = 4;
        int c = 6;
        calculateRoots(a, b, c);
    }

    private static void calculateRoots(int a, int b, int c) {

        int diskriminant = b * b - 4 * a * c;
        if (diskriminant < 0) {
            System.out.println("корней квадратного уравнения с коофицентами а = " + a
                    + "b =" + b + "c =" + c + " не может быть, по скольку дискриминант = " + diskriminant
                    + " и является отрицательным числом");
        } else if (diskriminant == 0) {
            int x = -b / (2 * a);
            System.out.println("найден единственный корень квадратного уравнения с коэфицентом a = " + a
                    + "b = " + b + "c = " + c + "  и он равен " + x);
        } else { // дискриминант > 0
            int x1 = (int) (-b + Math.sqrt(diskriminant)) / (2 * a);
            int x2 = (int) (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("найдены корни квадратного уравнения с коэфицентами a = " + a
                    + " b = " + b + " c = " + c + "  и они равны " + x1 + " и " + x2);
        }
    }
}
