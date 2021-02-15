package Modul_2;

public class User {
    public String name;
    int age;
    public User(String name, int age)  {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        User adrian = new User("Adrian", 35);
        User natalia = new User("Natalia", 33);
        User michal = new User("Michal", 32);
        User roman = new User("Roman", 16);
        User kordian = new User("Kordian", 19);
        User klara = new User("Klara", 21);

        User[] users = {adrian, natalia, michal, roman, kordian, klara};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        float average = (float)sum / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
    }

}
