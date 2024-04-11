package task2;

import java.util.Arrays;

// Написать функцию, возвращающую разницу между самым большим и самым
// маленьким элементами переданного не пустого массива.
public class Main {
    public static void main(String[] args) {
        int[] mas1 = {2, 4, 5, 6, 7, -3, -10};
        int[] mas2 = {1, 4, 5, 6, 7, 3, 10};
        int[] mas3 = {-2, -4, -5, -6, -7, -3, -10};
        int[] mas4 = new int[0];
        System.out.println(subElement(mas1));
        System.out.println(subElement(mas2));
        System.out.println(subElement(mas3));
        System.out.println(subElement(mas4));
    }

    private static int subElement(int[] mas) {
        if (mas.length == 0) return 0;
        Arrays.sort(mas);
        return mas[mas.length - 1] - mas[0];
    }
}
