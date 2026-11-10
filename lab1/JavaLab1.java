import java.util.*;


public class JavaLab1 {

    static double calculate(int el_b, float el_x) {
        double res;
        if (el_b == 9) {
            res = Math.pow(2 * (Math.sin(el_x) * (2 + Math.exp(el_x))), Math.cos(el_x));
            return res;
        }
        else if (el_b == 5 | el_b == 7 | el_b == 11) {
            res = (3 * Math.log(Math.pow(Math.abs(el_x) * (Math.abs(el_x) + 1), el_x))) / 2;
        }
        else {
            res = Math.asin(Math.cos(Math.asin(Math.pow((el_x + 1) / (double)22, 2))));
        }
        return res;
    }

    static void print_matrix(double[][] mrx) {
        for (int i = 0; i < mrx.length; i++) {
            System.out.print(i+ 1 + ") ");
            for (int j = 0; j < mrx[i].length; j++) {
                System.out.printf(java.util.Locale.US, "%.3f ", mrx[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] b = new int[7];
        for (int i = 0; i < b.length; i++) {
            b[i] = 15 - (i * 2);
        }

        float[] x = new float[18];
        for (int i = 0; i < 18; i++) {
            x[i] = random.nextFloat(-10f, 12f);
        }

        double[][] n = new double[7][18];
        for  (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = calculate(b[i], x[j]);
            }
        }

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(x));
        print_matrix(n);
    }
}