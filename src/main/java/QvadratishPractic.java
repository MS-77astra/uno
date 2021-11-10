public class QvadratishPractic {
    public static void main(String[] args) {
        double a, b, c;
        double x1, x2;
        a = 1;
        b = 5;
        c = 6;
        double discrimenant = b * b - 4 * a * c;
        if (discrimenant == 0) {
            x1 = (-b) / (2 * a);
            System.out.printf("x1 = x2 = %s", x1);
        } else if (discrimenant > 0) {
            x1 = (-b + Math.sqrt(discrimenant)) / (2 * a);
            x2 = (-b - Math.sqrt(discrimenant)) / (2 * a);
            System.out.printf("x1 = %s,x2 = %s",x1,x2);
        } else {
            System.out.println("нет решения так, как дискреминант < 0");
        }
    }
}
