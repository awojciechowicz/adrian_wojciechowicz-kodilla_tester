public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price >= 1000) {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 900) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 900 && this.weight <= 1800) {
            System.out.println("This notebook is not so heavy.");
        } else if (this.weight >= 1800 ) {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void chooseTheBestOne() {
        if (this.price > 1000 && this.year < 2020) {
            System.out.println("This notebook is to expensive for that edition.");
        } else if (this.price <= 1000 && this.year >= 2020) {
            System.out.println("This notebook is quite cheap for that edition.");
        } else {
            System.out.println("Doesn't matter.");
        }
    }
}
