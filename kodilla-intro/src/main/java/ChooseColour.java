import java.util.Scanner;

public class ChooseColour {
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter first letter of the colour (b, w, y, g, r).");
            String colour = scanner.next();
            return colour;
        }
    }

    public static void main(String[] args) {
        String firstLetter = getLetter();
        String result = null;
        switch (firstLetter) {
            case "b":
                result = "BLACK";
                break;
            case "w":
                result = "WHITE";
                break;
            case "y":
                result = "YELLOW";
                break;
            case "g":
                result = "GREEN";
                break;
            case "r":
                result = "RED";
                break;
        }
        System.out.println(result);
    }
}
