package task1;

// Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3
// countEvens([2, 2, 0]) → 3
// countEvens([1, 3, 5]) → 0
public class Main {
    public static void main(String[] args) {
        int[] mas1 = {2, 1, 2, 3, 4};
        int[] mas2 = {2, 2, 0};
        int[] mas3 = {1, 3, 5};
        int[] mas4 = new int[0];
        System.out.println(countEvens(mas1));
        System.out.println(countEvens(mas2));
        System.out.println(countEvens(mas3));
        System.out.println(countEvens(mas4));
    }

    private static int countEvens(int[] mas) {
        int count = 0;
        for (int x : mas) if (x % 2 == 0) count++;
        return count;
    }
}
