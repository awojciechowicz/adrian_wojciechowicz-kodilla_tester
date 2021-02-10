public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2 * (i + 1);
        }
        System.out.println(sumNumbers(numbers));
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
    private static int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
