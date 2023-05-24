import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double[] second = {1.57, 7.654, 9.986};
        double[] third = {1.1, 2.2, 3.4, 5.8000000001};
        System.out.println("Задача 2");
        for (int i = 0; i < first.length; i++) {
            if (i < first.length - 1) {
                System.out.print(first[i] + ", ");
            } else {
                System.out.print(first[i]);
            }
        }

        System.out.println();

        for (int i = 0; i < second.length; i++) {
            if (i < second.length - 1) {
                System.out.print(second[i] + ", ");
            } else {
                System.out.print(second[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < third.length; i++) {
            if (i < third.length - 1) {
                System.out.print(third[i] + ", ");
            } else {
                System.out.print(third[i]);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Задача 3");
        for (int i = first.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(first[i] + ", ");
            } else {
                System.out.print(first[i]);
            }
        }
        System.out.println();

        for (int i = second.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(second[i] + ", ");
            } else {
                System.out.print(second[i]);
            }
        }
        System.out.println();

        for (int i = third.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(third[i] + ", ");
            } else {
                System.out.print(third[i]);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < first.length; i++) {
            if (i % 2 != 1) {
                first[i]++;
            }
        }
        System.out.println(Arrays.toString(first));
        System.out.println();
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");

    }

    public static void task6() {
        System.out.println("Задача 6");

    }

    public static void task7() {
        System.out.println("Задача 7");

    }

    public static void task8() {
        System.out.println("Задача 8");

    }


}