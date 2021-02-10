public class FirstClass {                           // [1]
    public static void main(String[] args) {        // [2]
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.chooseTheBestOne();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2016);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.chooseTheBestOne();

        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.chooseTheBestOne();
    }
}
