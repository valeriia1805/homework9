import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int totalMoney = 0;
        for (int i = 0; i < arr.length; i++) {
            totalMoney += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalMoney + " рублей");
    }

    private static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    private static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        double totalMoney = 0;
        for (int i = 0; i < arr.length; i++) {
            totalMoney += arr[i];
        }
        double average = totalMoney / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    private static void task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}