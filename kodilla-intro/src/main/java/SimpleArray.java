public class SimpleArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        int check = numbers[3];
        System.out.println(check);
        int numberOfElements = numbers.length;
        System.out.println("Moja tablica ma " + numberOfElements + " elementow.");
    }
}