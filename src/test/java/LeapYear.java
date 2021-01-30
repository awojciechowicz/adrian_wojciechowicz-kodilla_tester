public class LeapYear {
    public static void main(String[] args) {
        int myYear = 1304;
        if (myYear % 4 == 0) {
            if (myYear % 100 == 0) {
                if (myYear % 400 == 0) {
                    System.out.println("Rok " + myYear + " jest przestepny.");
                } else {
                    System.out.println("Rok " + myYear + " nie jest przestepny.");
                }
            } else {
                System.out.println("Rok " + myYear + " jest przestepny.");
            }
        } else {
            System.out.println("Rok " + myYear + " nie jest przestepny.");
        }
    }
}
