package task3;

// Написать функцию, возвращающую истину, если в переданном массиве
// есть два соседних элемента, с нулевым значением.
public class Main {
    public static void main(String[] args) {
        int[] mas1 = {0, 0, 5, 0, 4, 2, 4, 7};
        int[] mas2 = {0, 4, 5, 0, 4, 2, 0, 0};
        int[] mas3 = {4, 7, 5, 2, 4, 2, 4, 7};
        int[] mas4 = new int[0];
        System.out.println(findTwoZero(mas1));
        System.out.println(findTwoZero(mas2));
        System.out.println(findTwoZero(mas3));
        System.out.println(findTwoZero(mas4));
    }
    private static boolean findTwoZero(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == 0 && mas[i + 1] == 0) return true;
        }
        return false;
    }
}
