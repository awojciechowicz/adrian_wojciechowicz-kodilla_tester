import java.util.Random;

public class RandomNumbers {
    private static int min = 30;
    private static int max;

    public static void main(String[] args) {
        int sum = 0;
        Random random = new Random();
        while (sum <= 5000) {
            int n = random.nextInt(31);
            sum+= n;
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        System.out.println(sum);
        System.out.println(getMax());
        System.out.println(getMin());

    }

    public static int getMax() {
        return max;
    }

    public static int getMin() {
        return min;
    }
}
