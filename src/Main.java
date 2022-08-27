public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //task1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i== arr.length-1) {
                System.out.println("сумма трат за месяц составила " + sum + " рублей");
            }
        }
        System.out.println();

        //task2
        int max =0;
        int min = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("минимальная сумма трат за день составила " + min + " рублей");

        //task3
        double sum1 = 0;
        for (int j : arr) {
            sum1 += j;
        }
        double average = sum1 / arr.length;
        System.out.println("Средня сумма трат за месяц составила " + average + " рублей");

        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char letter;
        for (int i = reverseFullName.length-1; i > -1; i--) {
            letter = reverseFullName[i];
            System.out.print(letter);
        }
    }
}