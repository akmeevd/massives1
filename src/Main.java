import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1 и 2
        int[] a = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(a));

        double [] b = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(b));

        int [] c = new int [] {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(c));

        // Задание 3
        for (int i = a.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.println(a[i]);
            }

        }
        for (int i = b.length - 1; i >= 0 ; i--) {
            if (i > 0) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.println(b[i]);
            }
        }
        for (int i = c.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(c[i] + ", ");
            } else {
                System.out.println(c[i]);
            }

        }

        // Задание 4

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                if (i == a.length - 1) {
                    System.out.print(a[i] + 1);
                } else {
                    System.out.print(a[i] + 1 + ", ");
                }

            } else {
                if (i == a.length - 1) {
                    System.out.print(a[i]);
                } else {
                    System.out.print(a[i] + ", ");
                }


            }
        }

    }
}